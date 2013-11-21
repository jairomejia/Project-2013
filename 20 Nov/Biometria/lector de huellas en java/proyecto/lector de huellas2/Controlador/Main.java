/*
 * Main.java
 *
 * Created on 14 de febrero de 2007, 00:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

//
//package Controlador;
//
//
//import Modelo.Nodo;
//import Modelo.Lista;
//import Modelo.Investigador;
//import Vista.VentanaPrincipal;
//import java.awt.Color;
//import java.awt.image.BufferedImage;
//import java.awt.image.RenderedImage;
//import java.io.File;
//import java.io.IOException;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Iterator;
//
//import javax.imageio.ImageIO;
//import javax.imageio.ImageReader;
//import javax.imageio.ImageWriter;
//import javax.imageio.spi.ImageReaderSpi;
//import javax.imageio.spi.ImageWriterSpi;
//import javax.imageio.stream.ImageInputStream;
//import javax.imageio.stream.ImageOutputStream;
//
//import com.griaule.grfingerjava.FingerprintImage;
//import com.griaule.grfingerjava.IFingerEventListener;
//import com.griaule.grfingerjava.IImageEventListener;
//import com.griaule.grfingerjava.IStatusEventListener;
//import com.griaule.grfingerjava.GrFingerJava;
//import com.griaule.grfingerjava.GrFingerJavaException;
//import com.griaule.grfingerjava.MatchingContext;
//import com.griaule.grfingerjava.Template;
//import java.awt.Graphics;
//import java.awt.GraphicsConfiguration;
//import java.awt.GraphicsDevice;
//import java.awt.GraphicsEnvironment;
//import java.awt.HeadlessException;
//import java.awt.Image;
//import java.awt.Transparency;
//import javax.swing.ImageIcon;

//public class Main implements IStatusEventListener, IImageEventListener,
//              IFingerEventListener {
//
//      private MatchingContext matchContext;
//
//      //private VentanaPrincipal ui;
//
//      //static String baseLIS = "C:\\biometrico-dev\\test.mdb";
//
//        //private Lista listaTemplates; //lista de los templates de los investigadores registrados
//
//      //private FingerprintImage fingerprint; // ultima huella adquirida.
//
//      private Template template; // ultimo template extraido
//
//        private BufferedImage foto; //fotografia del investigador
//
//      private Investigador investigadorIdentificado; //el investigador identificado en este momento
//
//        //till we move to SQLServer ...
//        private static String pathHuella = "C:/biometrico-dev/huellas/";
//
//        private static String pathFoto = "C:/biometrico-dev/fotos/";
//
//        private boolean captureInitalized = false;
//
////    public Main() {
//              ui = new VentanaPrincipal(this);
//              ui.setVisible(true);
//        }

//      public static void main(String[] args) {
//                //carga el path de las bibliotecas de grfing....
//              File binDirectory = new File("C:\\Archivos de programa\\Griaule\\GrFinger Java\\bin");
//
//                //pone el look and feel windowsero...APB
//                try{
//                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//                }catch (Exception e) { }
//
//                // Setea el path a las bibliotecas
//              GrFingerJava.setNativeLibrariesDirectory(binDirectory);
//              try {
//                      // setea el path de la licencia...ver como se saca :D
//                      GrFingerJava.setLicenseDirectory(binDirectory);
//              } catch (GrFingerJavaException e) {
//                      e.printStackTrace();
//              }
//
//                //inicializa el objeto
//              Main sample = new Main();
//                sample.start();
//        }

//      private void start() {
//
//              try {
//                      // Crea un contexto de matcheo para efectuar comparaciones
//                        matchContext = new MatchingContext();
//                      ui.writeLog("** Espere mientras se inicializa el entorno **");
//                        // inicia GrCapture.
//                      GrFingerJava.initializeCapture(this);
//                      captureInitalized = true;
//
//                        //Carga la lista de los templates de huellas que hay
//                        //en archivos en disco...es decir, los usrs registrados
//                        this.listaTemplates = cargarListaTemplates();
//
//                      ui.writeLog("** LISBioID se inicio exitosamente **");
//
//              } catch (GrFingerJavaException e) {
//                      // error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }

//        public Lista cargarListaTemplates(){
//            ControladorBaseDeDatos conLIS = new ControladorBaseDeDatos(baseLIS);
//            ResultSet rs = conLIS.consulta("select invId, pathHuella from Investigadores where desactivado = False ;");
//            Lista lista = new Lista();
//            try{
//               String huella;
//               int ide;
//                while(rs.next()){
//
//
//                    huella = rs.getString("pathHuella");
//                    ide = rs.getInt("invId");
//
//                  //si el usr no tiene huella, lo saltea y sigue
//                  // MEJORAR
//                  try{
//                    if( huella != null || huella.compareTo("") != 0 || huella.compareTo("null") != 0 ) {
//                        //crea la huella en base al png
//                        FingerprintImage dedo = new FingerprintImage(cargarHuella(huella), 500);
//
//                        Template temp = new Template();
//                        //saca el template de la huella
//                        //turbio...se que da vueltas al vicio, pero dejar asi
//                        temp.setData(extraerTemplate(dedo).getData());
//                        //crea un nodo de la lista y apendea
//                        Nodo nodo= new Nodo(temp, ide);
//                        lista.append(temp, ide);
//                        }
//
//                  }catch (NullPointerException e){
//                      // ui.writeLog("Error al cargar los templates" ); //debuggin purposes..yeah!
//                  }
//
//                }
//                rs.close();
//                conLIS.cerrar();
//                return lista;
//            }catch (SQLException e){
//                ui.writeLog(e.toString());
//                e.printStackTrace();
//                ui.writeLog("=== Error cargando lista de templates ===");
//            }
//            //conLIS.cerrar();
//            return lista;
//        }
//
        //devuelve una imagen de huella que busca en PathHuella (atr de clase) y PathH (atributo local)
//        public BufferedImage cargarHuella(String pathH){
//            File fileFoto = new File(pathHuella + pathH);
//            try{
//                return ImageIO.read(fileFoto);
//            }catch(IOException e){
//                //generalmente cuando falla el path, o cuando alguien tiene un path en BD pero el
//                //archivo no existe
//                ui.writeLog("Error cargando huella digital de " + pathHuella + pathH + "\n" + e.toString());
//                return null;
//           }
//        }


//      // Se llama cada vez que un lector es enchufado
//      public void onSensorPlug(String idSensor) {
//              ui.writeLog("Sensor " + idSensor + " conectado.");
//              try {
//                      // Empieza a capturar desde el sensor
//                      GrFingerJava.startCapture(idSensor, this, this);
//              } catch (GrFingerJavaException e) {
//                      // error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }
//
//
//
//      // Se llama cuando el sensor es desenchufado.
//      public void onSensorUnplug(String idSensor) {
//              ui.writeLog("Sensor " + idSensor + " desconectado.");
//              try {
//                      //Deja de capturar de el sensor.
//                      GrFingerJava.stopCapture(idSensor);
//              } catch (GrFingerJavaException e) {
//                      // error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }
//
//      // Se llama cuando una imagen se adquiere del sensor
//      public void onImageAcquired(String idSensor, FingerprintImage fingerprint) {
//              // se reporta que ocurrio un evento con una imagen
//              ui.writeLog("Huella capturada "); //en el sensor " + idSensor);
//              processImage(fingerprint);
//
//      }

        // esta funcion procesa una huella
//      private void processImage(FingerprintImage fingerprint) {
//              // muestra la huella en la interfaz
//              ui.showImage(fingerprint);
//              this.fingerprint = fingerprint; //   <============================,.
//              // ya tenemos la huella digital                                    \\
//                //habilita los botones pertinentes, ya que hay huella                ||
//              ui.enableRegistrarHuella();                                         //
//                                                                                   //
//                extract(); //extrayendo el template automaticamente de la huella (this.fingerprint)
//
//      }
//        //procesa una foto
//        private void procesarFoto(BufferedImage foto){
//            //la muestra en interfaz
//            ui.showFoto(foto);
//            this.foto = foto; //encapsular en investigador
//            //guarda la foto a disco
//            guardarFoto(foto);
//
//        }
//      // Se llama cuando se detecta un dedo en el sensor
//      public void onFingerDown(String idSensor) {
//              ui.writeLog("Dedo apollado"); // en el sensor " + idSensor );
//      }
//
//      // Se llama cuando se remueve un dedo del sensor
//      public void onFingerUp(String idSensor) {
//              ui.writeLog("Dedo retirado "); //del sensor " + idSensor);
//      }

//      // enrola una huella digital
//      public void enroll(Investigador investigador) {
//              try {
//                      //funcion que guarda la huella en ./huellas/nombreapellido.png
//                        // y devuelve el NOMBRE del archivo asi se guarda en investigador
//                        String archivo = guardarHuellaEnDisco(investigador.getArchivo());
//
//                        //añade el investigador recien enrolado a la lista de templates
//                        Template nuevo = new Template();
//                        nuevo.setData(extraerTemplate(fingerprint).getData());
//                        listaTemplates.append(nuevo, investigador.getId());
//
//                        investigador.setPathHuella(archivo);
//                        ui.writeLog("Huella de " + investigador.getNombre() + " " + investigador.getApellido() + " registrada con Exito!");
//              } catch (NullPointerException e) {
//                      // write error to log
//                      ui.writeLog("Ingrese una huella!!!");
//              }
//      }

//        //carga una huella digital desde un archivo de imagen a memoria
//        public void cargarHuellaDesdeMenu(File file, int resolution, ImageReaderSpi spi) {
//              try {
//                      ImageReader reader = spi.createReaderInstance();
//                      ImageInputStream input = ImageIO.createImageInputStream(file);
//                      reader.setInput(input);
//                      BufferedImage img = reader.read(0);
//                      reader.dispose();
//                      input.close();
//                      // creates and processes the fingerprint image
//                      processImage(new FingerprintImage(img, resolution));
//              } catch (IOException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              } catch (IllegalArgumentException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//      }


//      // Identifica la huella desde la base de datos
//      public void identify() {
//
//              try {
//                      // Starting identification process and supplying query template.
//                      matchContext.prepareForIdentification(template);
//
//
//                        // Trae la lista de huellas enroladas
//                      Nodo nodoReferencia = listaTemplates.getFrente();
//                        Template templateReferencia = new Template();
//                      // itera sobre los templates
//                        while (nodoReferencia != null) {
//
//                            // puts template data into Template object
//                            templateReferencia.setData(nodoReferencia.getTemplate().getData());
//
//                            // Comparing current template.
//                            boolean doesMatch = matchContext.identify(templateReferencia);
//
//                            // Checking if query template and reference template match.
//                                if (doesMatch) {
//                                    this.investigadorIdentificado = new Investigador(nodoReferencia.getId());
//
//                                    //muestra foto del investigador
//                                    BufferedImage foto = cargarFoto();
//
//                                    this.foto = foto;
//                                //devuelve true si entra, false si sale del LIS
//                                boolean accion = investigadorIdentificado.registrarMovimiento();
//                                ui.actualizarUI(GrFingerJava.getBiometricImage(template,fingerprint, matchContext), accion );
//
//                                // si coinciden, detener la busqueda
//                              return;
//                              }
//                                nodoReferencia = nodoReferencia.getProximo();
//                      }
//                      ui.writeLog("Huella NO identificada!!!");
//                        investigadorIdentificado = null ;
//                        ui.showFoto(cargarFoto());
//                        ui.showDatos("ID: NO IDENTIFICADO", "Dni: NO IDENTIFICADO");
//
//
//
//
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }

//      // Extrae un template desde una imagen de huella (this.fingerprint)
//      public void extract() {
//
//              try {
//                      template = matchContext.extract(fingerprint);
//                      String msg = "Template extraido con exito. ";
//                      // write template quality to log
//                      switch (template.getQuality()) {
//                      case Template.HIGH_QUALITY:
//                              msg += "Alta calidad.";
//                              break;
//                      case Template.MEDIUM_QUALITY:
//                              msg += "Media calidad.";
//                              break;
//                      case Template.LOW_QUALITY:
//                              msg += "Baja calidad.";
//                              break;
//                      }
//                      ui.writeLog(msg);
//
//
//                      // muestra minutiaes/segmentos/directiones en la imagen
//                      ui.showImage(GrFingerJava.getBiometricImage(template, fingerprint));
//
//                        identify();
//
//              } catch (GrFingerJavaException e) {
//                      // error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }
//        public Template extraerTemplate(FingerprintImage dedo) {
//
//              try {
//                      return matchContext.extract(dedo);
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//                        ui.writeLog("error en extraerTemplate()");
//                        return null;
//              }
//      }


//      // Finalizes library and close DB.
//      public void stop() {
//
//              try {
//                      //if (conLIS != null){
//                        //    conLIS.cerrar();
//                        //}
//                        if (captureInitalized) {
//                              GrFingerJava.finalizeCapture();
//                              captureInitalized = false;
//                      }
//
//                      if (matchContext != null) {
//                              matchContext.destroy();
//                              matchContext = null;
//                      }
//
//              }  catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.getMessage());
//              }
//
//      }

        // Graba una huella digital en disco, en formato de imagen
//      public String guardarHuellaEnDisco(String nombreArchivo) {
//
//              // Save image.
//              try {
//                        File archivo = new File(pathHuella + nombreArchivo + ".png");
//                      Iterator iterador = ImageIO.getImageWritersByFormatName("png");
//                      ImageWriter writer = ((ImageWriter)iterador.next());
//                        ImageOutputStream output = ImageIO.createImageOutputStream(archivo);
//                      writer.setOutput(output);
//                      writer.write(fingerprint);
//                      output.close();
//                      writer.dispose();
//                        return archivo.getName();
//              } catch (IOException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//                        return "";
//              }
//
//      }
        // Saves the fingerprint image to a file using an ImageWriterSpi.
        // See ImageIO API.
//      public void guardarHuellaDesdeMenu(File file, ImageWriterSpi spi) {
//
//              // Save image.
//              try {
//                      ImageWriter writer = spi.createWriterInstance();
//                      ImageOutputStream output = ImageIO.createImageOutputStream(file);
//                      writer.setOutput(output);
//                      writer.write(fingerprint);
//                      output.close();
//                      writer.dispose();
//              } catch (IOException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }
//
////    // carga una foto seleccionada al perfil actual identificado
////    public void cargarFotoDesdeMenu(File file, ImageReaderSpi spi) {
//              try {
//                      ImageReader reader = spi.createReaderInstance();
//                      ImageInputStream input = ImageIO.createImageInputStream(file);
//                      reader.setInput(input);
//                      BufferedImage img = reader.read(0);
//                      reader.dispose();
//                      input.close();
//                      // creates and processes the fingerprint image
//                        procesarFoto(img);
//
//                       // guardarFoto(file.getAbsolutePath());
//              } catch (IOException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              } catch (IllegalArgumentException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }
        //carga la foto de un investigador identificado, si tiene el pathFoto seteado
        //sino carga foto de desconocido
//        public BufferedImage cargarFoto(){
//            try{
//                  if(investigadorIdentificado == null){
//                      File fileFoto = new File(pathFoto + "noidentificado.jpg");
//                      return ImageIO.read(fileFoto);
//                  }
//                  if(investigadorIdentificado.getPathFoto()  != null)
//                  {
//                        File fileFoto = new File(pathFoto + investigadorIdentificado.getPathFoto());
//                        return ImageIO.read(fileFoto);
//                  }
//                  else {
//                        File fileFoto = new File(pathFoto + "incognita.jpg");
//                        return ImageIO.read(fileFoto);
//                    }
//                }catch (NullPointerException e) {
//                   ui.writeLog("No hay un investigador identificado");
//                    return null;
//                } catch(IOException e){
//                    ui.writeLog("No se puede cargar la foto " + investigadorIdentificado.getPathFoto());
//                    return null;
//                }
//        }
//
//        public void guardarFoto(BufferedImage foto){
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
        //Metodo que me devuelve una bufferedimage a partir de una imagen
//    public static BufferedImage toBufferedImage(Image imagen) {
//        if (imagen instanceof BufferedImage) {
//            return (BufferedImage)imagen;
//        }
//
//        // This code ensures that all the pixels in the image are loaded
//        imagen = new ImageIcon(imagen).getImage();
//
//        // Determine if the image has transparent pixels; for this method's
//        // implementation, see e661 Determining If an Image Has Transparent Pixels
//        boolean hasAlpha = false;//hasAlpha(imagen);
//
//        // Create a buffered image with a format that's compatible with the screen
//        BufferedImage bimage = null;
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        try {
//            // Determine the type of transparency of the new buffered image
//            int transparency = Transparency.OPAQUE;
//            if (hasAlpha) {
//                transparency = Transparency.BITMASK;
//            }
//
//            // Create the buffered image
//            GraphicsDevice gs = ge.getDefaultScreenDevice();
//            GraphicsConfiguration gc = gs.getDefaultConfiguration();
//            bimage = gc.createCompatibleImage(
//                imagen.getWidth(null), imagen.getHeight(null), transparency);
//        } catch (HeadlessException e) {
//            // The system does not have a screen
//        }
//
//        if (bimage == null) {
//            // Create a buffered image using the default color model
//            int type = BufferedImage.TYPE_INT_RGB;
//            if (hasAlpha) {
//                type = BufferedImage.TYPE_INT_ARGB;
//            }
//            bimage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), type);
//        }
//
        // Copy image to buffered image
//        Graphics g = bimage.createGraphics();
//
//        // Paint the image onto the buffered image
//        g.drawImage(imagen, 0, 0, null);
//        g.dispose();
//
//        return bimage;
//    }

//        // Sets match parameters
//      public void setParemeters(int identifyThreshold,
//                      int identifyRotationTolerance, int verifyThreshold,
//                      int verifyRotationTolorance) {
//              try {
//                      matchContext.setIdentificationThreshold(identifyThreshold);
//                      matchContext.setIdentificationRotationTolerance(identifyRotationTolerance);
//                      matchContext.setVerificationRotationTolerance(verifyRotationTolorance);
//                      matchContext.setVerificationThreshold(verifyThreshold);
//
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }
//
//      public int getVerifyRotationTolerance() {
//
//              try {
//                      return matchContext.getVerificationRotationTolerance();
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//              return 0;
//      }
//
//      public int getVerifyThreshold() {
//
//              try {
//                      return matchContext.getVerificationThreshold();
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//              return 0;
//      }
//
//      public int getIdentifyRotationTolerance() {
//
//              try {
//                      return matchContext.getIdentificationRotationTolerance();
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//              return 0;
//      }
//
//      public int getIdentifyThreshold() {
//
//              try {
//                      return matchContext.getIdentificationThreshold();
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//              return 0;
//      }
//
//      // Sets the colors of biometric display
//      public void setBiometricDisplayColors(Color minutiaeColor,
//                      Color minutiaeMatchColor, Color segmentColor,
//                      Color segmentMatchColor, Color directionColor,
//                      Color directionMatchColor) {
//
//              try {
//                      // set new colors for BiometricDisplay
//                      GrFingerJava.setBiometricImageColors(minutiaeColor,
//                                      minutiaeMatchColor, segmentColor, segmentMatchColor,
//                                      directionColor, directionMatchColor);
//              } catch (GrFingerJavaException e) {
//                      // write error to log
//                      ui.writeLog(e.toString());
//              }
//
//      }



//      public RenderedImage getFingerprint() {
//              return fingerprint;
//      }
//        public RenderedImage getFoto() {
//              return foto;
//      }
//        public Investigador getInvestigador(){
//            return investigadorIdentificado;
//        }
//        public void setInvestigador(Investigador investigador){
//            this.investigadorIdentificado = investigador;
//        }
//}