/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.Investigador;

import Vista.VentanaPrincipal;
import java.awt.Image;

import com.griaule.grfingerjava.FingerprintImage;
import com.griaule.grfingerjava.GrFingerJava;
import com.griaule.grfingerjava.GrFingerJavaException;
import com.griaule.grfingerjava.MatchingContext;
import com.griaule.grfingerjava.Template;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;


/**
 *
 * @author tuza
 */


public class ControladorVentanaPrincipal {

    private Image image = null; //esta variable es la imagen de la huella
    //private Image foto = null; //esta es la foto del investigador

    private Investigador investigadorIdentificado; //el investigador identificado en este momento
    private BufferedImage huella;
    private boolean captureInitalized = false;
    private MatchingContext matchContext;
    private Template template; // ultimo template extraido
    private Investigador inv;
    private BufferedImage huella_template;

    //private BufferedImage huellaMatcheada;

    private VentanaPrincipal ui;

    private Hashtable<Integer, Template> tablahash = new Hashtable<Integer, Template>();


    public ControladorVentanaPrincipal(String lib){
        ui = new VentanaPrincipal(this);
        ui.setVisible(true);
        ui.writeLog("Librerias en: " + lib);
    }

    public static void main(String[] args) {
                File binDirectory = null;
                //carga el path de las bibliotecas de grfing....
                try {
                    binDirectory = new File("C:\\Archivos de programa\\Griaule\\GrFinger Java\\bin");
                    GrFingerJava.setNativeLibrariesDirectory(binDirectory);
                }catch(IllegalArgumentException e){
                    try{
                        binDirectory = new File("C:\\Archivos de programa\\Griaule\\Fingerprint SDK Java 2007\\bin");
                        GrFingerJava.setNativeLibrariesDirectory(binDirectory);
                    }catch(IllegalArgumentException es){
                        try{
                            binDirectory = new File("D:\\Archivos de programa\\Griaule\\Fingerprint SDK Java 2007\\bin");
                            GrFingerJava.setNativeLibrariesDirectory(binDirectory);
                        }catch(IllegalArgumentException eds){
                            binDirectory = new File("D:\\Archivos de programa\\Griaule\\GrFinger Java\\bin");
                            GrFingerJava.setNativeLibrariesDirectory(binDirectory);
                        }
                    }
                }

                //pone el look and feel windowsero...APB
                try{
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }catch (Exception e) { }



                try {
                        // setea el path de la licencia...ver como se saca :D
                        GrFingerJava.setLicenseDirectory(binDirectory);
                } catch (GrFingerJavaException e) {
                        e.printStackTrace();
                }

                //inicializa el objeto
                ControladorVentanaPrincipal lisbioid = new ControladorVentanaPrincipal(binDirectory.getAbsolutePath());
                lisbioid.start();

    }

    private void start() {

        try {
            // Crea un contexto de matcheo para efectuar comparaciones
            matchContext = new MatchingContext();
            ui.writeLog("** Espere mientras se inicializa el entorno **");
            // inicia GrCapture.
            GrFingerJava.initializeCapture(ui);
            captureInitalized = true;

            //Carga la lista de los templates de huellas que hay
            //en la BD...es decir, los usrs registrados...printear (!)
            try{
                if(!cargarListaTemplates())
                    ui.writeLog("**  No hay investigadores registrados **");
            }catch(SQLException e){
                e.printStackTrace() ;//debug
                ui.writeLog("**  Error de acceso a la base de datos. **");
            }

            ui.writeLog("** LISBioID se inicio exitosamente **");

        } catch (GrFingerJavaException e) {
            // error to log
            ui.writeLog(e.toString());
        }

    }

    //esta funcion carga el investigador por el dni, y no por el lector
    //el parametro inv se le pasa desfr la interfaz que toma el dni
    //y crea el investigador
    public void cargarInvestigadorDni(String dni) throws SQLException, NullPointerException{
            Investigador investigador  = new Investigador(dni);
            this.setHuella(investigador.getHuella());


    }

    public FingerprintImage getFingerPrint() {
        return new FingerprintImage(this.getHuella(), 500 );
    }

    public BufferedImage getHuella()  {
         if(this.huella != null)
             return this.huella;
         try{
            this.huella = this.investigadorIdentificado.getHuella();
         }catch(SQLException e){
            e.printStackTrace();
            return null;
         }catch(NullPointerException er){
            //cuando recien inicia no hay un inv identificado
             return null;
         }
         return this.huella;
    }

    // Extrae un template desde una imagen de huella (this.fingerprint)
    public String extract() throws SQLException {

            try {
                    template = matchContext.extract(getFingerPrint());
                    String msg = "Template extraido con exito. ";
                    // write template quality to log
                    switch (template.getQuality()) {
                        case Template.HIGH_QUALITY:
                                msg += "Alta calidad.";
                                break;
                        case Template.MEDIUM_QUALITY:
                                msg += "Media calidad.";
                                break;
                        case Template.LOW_QUALITY:
                                msg += "Baja calidad.";
                                break;
                    }
                    return msg;
            } catch (GrFingerJavaException e) {
                    return e.toString();
            }
    }

    // Finalizes library and close DB.
    public void stop() throws GrFingerJavaException{

        if (captureInitalized) {
                GrFingerJava.finalizeCapture();
                captureInitalized = false;
        }

        if (matchContext != null) {
                matchContext.destroy();
                matchContext = null;
        }
        ControladorBaseDeDatosFactory.close();
    }
    // Getting GrFinger Java major version
    public String getMajorVersion() {
            return "0.1.9";
    }



    // Getting GrFinger Java license type
    public int getLicenseType() {
            try {
                    return GrFingerJava.getLicenseType();
            } catch (GrFingerJavaException e) {
                    // write error to log
                    ui.writeLog(e.toString());
            }
            return 0;
    }

    // Identifica la huella desde la base de datos
    public boolean identify() {

            try {
                    // Starting identification process and supplying query template.
                    matchContext.prepareForIdentification(template);

                    // Trae la lista de huellas enroladas
                    Enumeration<Template> e = tablahash.elements();
                    Enumeration<Integer> ids = tablahash.keys();

                    Template temp = null;
                    int id ;

                    while (e.hasMoreElements()){

                        temp = e.nextElement();
                        id = ids.nextElement();

                        // Compara el template parametro con el que esta extraido
                        boolean matchea = matchContext.identify(temp);

                        if(matchea){
                            try{
                                this.investigadorIdentificado = new Investigador(id);

                            }catch(SQLException sqle){sqle.printStackTrace();} //agarrar bien este error por favor
                            catch(NullPointerException er){
                                System.out.println("Error con el inv de id " + id); //agarrar bien, debug
                            }

                            this.huella_template = GrFingerJava.getBiometricImage(template,getFingerPrint(), matchContext);

                            return true;
                        }
                    }
                    investigadorIdentificado = null;

                    System.out.println("No se identifico ningun investigador"); //debug
                    return false;

            } catch (GrFingerJavaException e) {
                   e.printStackTrace();
                   return false;
            }

    }
    public BufferedImage getHuellaTemplate(){
        return this.huella_template;
    }
    public void setHuellaTemplate(BufferedImage huellatemplate){
        this.huella_template = huellatemplate;
    }
    public boolean doAccion() throws SQLException {
        //registra la entrada o salida de un investigador
        //devuelve true si entra, false si sale del LIS
        return this.investigadorIdentificado.registrarMovimiento();
    }

    // carga una foto seleccionada al perfil actual identificado
    public boolean cargarFotoDesdeMenu(File file, ImageReaderSpi spi) throws IOException, IllegalArgumentException {
        if(file.length() > 100000L)
            return false;
        ImageReader reader = spi.createReaderInstance();
        ImageInputStream input = ImageIO.createImageInputStream(file);
        reader.setInput(input);
        BufferedImage img = reader.read(0);
        reader.dispose();
        input.close();

        this.getInvestigador().setFoto(img);
        return true;
    }

    public static String getHora(Timestamp fecha) {
      String hora = "";
      Calendar cal = Calendar.getInstance();
      if (fecha == null) { //devuelve la hora actual
        String FORMATOHORA = "HH:mm:ss";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(FORMATOHORA);
        hora = sdf.format(cal.getTime());
      }
      else {
        cal.setTimeInMillis(fecha.getTime());

        String FORMATOHORA = "HH:mm:ss";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(FORMATOHORA);
        hora = sdf.format(cal.getTime());
      }
      return hora;
    }



    private static String pathImg = "C:/biometrico/imgs/";
    //carga la foto de un investigador identificado
    //sino carga foto de desconocido o no identificado
    public BufferedImage getFoto(){
        try{
              if(getInvestigador() == null){
                  File fileFoto = new File(pathImg + "noidentificado.jpg");
                  return ImageIO.read(fileFoto); //no se identifico
              }
              if(getInvestigador() != null)
              {
                    try{
                        BufferedImage foto = getInvestigador().getFoto();
                        if(foto != null)
                            return foto;
                    }catch(SQLException e){
                        e.printStackTrace();
                        //no hace nada...cargara incognita
                    }
              }
              File fileFoto = new File(pathImg + "incognita.jpg");
              return ImageIO.read(fileFoto);

            } catch(IOException e){
                //writeLog("No se puede cargar la foto de" + getInvestigador().toString());
                return null;
            }
    }


    public String enroll (Investigador investigador) throws SQLException{
        try {
                //añade el investigador recien enrolado a la lista de templates
                //checkear estas 2 lineas para ver si es necesaria la asignacion asi complicada
                Template nuevo = new Template();
                nuevo.setData(extraerTemplate(getFingerPrint()).getData());
                tablahash.put(investigador.getId(), nuevo);
                investigador.setHuella(huella);

                return "Huella de " + investigador.getNombre() + " " + investigador.getApellido() + " registrada con Exito!";
        } catch (NullPointerException e) {
                // write error to log
                return "Ingrese una huella!!!";
        }
    }



    //metodo que guarda una foto en disco
//    public void guardarFoto(BufferedImage foto){
//
//              // Save image.
//              try {
//                        File archivo = new File(pathFoto+ investigadorIdentificado.getArchivo() + ".jpg");
//                      Iterator iterador = ImageIO.getImageWritersByFormatName("jpg");
//                      ImageWriter writer = ((ImageWriter)iterador.next());
//                        ImageOutputStream output = ImageIO.createImageOutputStream(archivo);
//                      writer.setOutput(output);
//                        Image escala = foto.getScaledInstance(250, 225, Image.SCALE_SMOOTH);
//                        writer.write(toBufferedImage(escala));
//                        output.close();
//                      writer.dispose();
//
//              } catch (IOException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//                investigadorIdentificado.setPathFoto(investigadorIdentificado.getArchivo()+ ".jpg");
//
//        }

    public Investigador getInvestigador(){
        return this.investigadorIdentificado;
    }


    public boolean cargarListaTemplates() throws SQLException {
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        boolean hayRegistrado = false;

        PreparedStatement ps = null;
        ps =  conLIS.getC().prepareStatement("SELECT id, huella FROM Investigador where  desactivado = 0 and huella IS NOT NULL ;"); //agregar desactivado = null
        //ps.setBoolean(1, false);
        ResultSet rs  =ps.executeQuery();

           byte[] bytesHuella;
           int ide;

           while(rs.next()){
                hayRegistrado = true;
                bytesHuella = rs.getBytes("huella");
                ide = rs.getInt("id");

                //se pasa el arreglo de bytes a una bufferedimage
                try{
                    BufferedImage imagenHuella = ImageIO.read ( new ByteArrayInputStream ( bytesHuella ) );
                    //crea la huella en base al png
                    FingerprintImage dedo = new FingerprintImage(imagenHuella, 500);

                    Template temp = extraerTemplate(dedo);
                    if(temp!= null)
                        this.tablahash.put(ide, temp);
                    else
                        ui.writeLog("Error cargando " + ide + "\n");

                }catch(IOException e){
                    e.printStackTrace();
                }
            }


            return hayRegistrado;

    }

    public Template extraerTemplate(FingerprintImage dedo) {
        try {
                return matchContext.extract(dedo);
        } catch (GrFingerJavaException e) {
                return null;
        }
    }

    public void setHuella(BufferedImage huella){
        this.huella = huella;
    }

//    public void insertImage(Connection conn,String img)
//        {
//                int len;
//                String query;
//                PreparedStatement pstmt;
//
//                try
//                {
//                        File file = new File(img);
//                        FileInputStream fis = new FileInputStream(file);
//                        len = (int)file.length();
//
//                        query = ("insert into TableImage VALUES(?,?,?)");
//                        pstmt = conn.prepareStatement(query);
//                        pstmt.setString(1,file.getName());
//                        pstmt.setInt(2, len);
//
//                        // Method used to insert a stream of bytes
//                        pstmt.setBinaryStream(3, fis, len);
//                        pstmt.executeUpdate();
//
//                }
//                catch (Exception e)
//                {
//                        e.printStackTrace();
//                }
//        }
//
//        public void getImageData(Connection conn)
//        {
//
//                 byte[] fileBytes;
//                 String query;
//                 try
//                 {
//                         query = "select data from tableimage";
//                         Statement state = conn.createStatement();
//                         ResultSet rs = state.executeQuery(query);
//                         if (rs.next())
//                        {
//                                  fileBytes = rs.getBytes(1);
//                                  OutputStream targetFile=
//                                  new FileOutputStream(
//                                       "d://filepath//new.JPG");
//
//                                  targetFile.write(fileBytes);
//                                  targetFile.close();
//                        }
//
//                 }
//                 catch (Exception e)
//                 {
//                         e.printStackTrace();
//                 }
//        }



    public Template getTemplate(){
        return this.template;
    }

    //para las opciones
    // Sets match parameters
        public void setParemeters(int identifyThreshold,
                        int identifyRotationTolerance, int verifyThreshold,
                        int verifyRotationTolorance) {
                try {
                        matchContext.setIdentificationThreshold(identifyThreshold);
                        matchContext.setIdentificationRotationTolerance(identifyRotationTolerance);
                        matchContext.setVerificationRotationTolerance(verifyRotationTolorance);
                        matchContext.setVerificationThreshold(verifyThreshold);

                } catch (GrFingerJavaException e) {
                        // write error to log
                        ui.writeLog(e.toString());
                }

        }

        public int getVerifyRotationTolerance() {

                try {
                        return matchContext.getVerificationRotationTolerance();
                } catch (GrFingerJavaException e) {
                        // write error to log
                        ui.writeLog(e.toString());
                }
                return 0;
        }

        public int getVerifyThreshold() {

                try {
                        return matchContext.getVerificationThreshold();
                } catch (GrFingerJavaException e) {
                        // write error to log
                        ui.writeLog(e.toString());
                }
                return 0;
        }

        public int getIdentifyRotationTolerance() {

                try {
                        return matchContext.getIdentificationRotationTolerance();
                } catch (GrFingerJavaException e) {
                        // write error to log
                        ui.writeLog(e.toString());
                }
                return 0;
        }

        public int getIdentifyThreshold() {

                try {
                        return matchContext.getIdentificationThreshold();
                } catch (GrFingerJavaException e) {
                        // write error to log
                        ui.writeLog(e.toString());
                }
                return 0;
        }

        // Sets the colors of biometric display
        public void setBiometricDisplayColors(Color minutiaeColor,
                        Color minutiaeMatchColor, Color segmentColor,
                        Color segmentMatchColor, Color directionColor,
                        Color directionMatchColor) {

                try {
                        // set new colors for BiometricDisplay
                        GrFingerJava.setBiometricImageColors(minutiaeColor,
                                        minutiaeMatchColor, segmentColor, segmentMatchColor,
                                        directionColor, directionMatchColor);
                } catch (GrFingerJavaException e) {
                        // write error to log
                        ui.writeLog(e.toString());
                }

        }

}