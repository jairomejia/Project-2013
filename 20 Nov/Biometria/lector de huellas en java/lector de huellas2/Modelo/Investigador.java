/*
 * Investigador.java
 *
 * Created on 15 de febrero de 2007, 13:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author PC
 */
import Controlador.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.LinkedList;
import javax.imageio.ImageIO;


public class Investigador {

    private int id;
    private String nombre;
    private String apellido;
    private String dni; //el dni deberia ser string, pero esta seteado en la BD como un int
    private String telefono;
    private String telefono2;
    private String observacion;
    private String email;
    private boolean esEncargado;

    private BufferedImage foto;
    private BufferedImage huella;
    private Asistencia asistencia;

    private boolean logeado;



    /** Creates a new instance of Investigador */
    public Investigador(int id, String nombre, String apellido, String dni, String telefono, String telefono2, String email, String observacion, boolean esEncargado ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;

        this.logeado = false;

        this.setTelefono2(telefono2);
        this.observacion = observacion;
        this.esEncargado = esEncargado;
        this.asistencia = null;
        this.foto = null;
        this.huella = null;
    }

    //constructor que nos crea un investigador a partir de cierto id que se encuentra en la base de datos
    public Investigador(int id) throws NullPointerException, SQLException{
        this.id = id;
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = null;
        ps = conLIS.getCon().prepareStatement("SELECT numero_documento, nombre, apellido, telefono, telefono2, email, observaciones, es_encargado  FROM Investigador WHERE id = ? ;" );
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();


        if(rs.next()){

            this.nombre = rs.getString("nombre");
            this.apellido = rs.getString("apellido");
            this.dni = rs.getString("numero_documento");

            this.telefono = rs.getString("telefono");
            this.setTelefono2(rs.getString("telefono2"));
            this.email = rs.getString("email");
            this.observacion = rs.getString("observaciones");
            this.esEncargado = rs.getBoolean("es_encargado");

            this.asistencia = null;
            this.foto = null;
            this.huella = null;
        }
        else {
            System.out.println("error al buscar un investigador por id");
            throw new NullPointerException();
        }

    }
    //este constructor crea un investigador en base a un DNI de la BD, se pasa string pq ya existe el constructor con int
    public Investigador(String dni) throws SQLException, NullPointerException{
        ResultSet rs;
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = null;

        ps = conLIS.getCon().prepareStatement("SELECT id, nombre, apellido, telefono, telefono2, desactivado, email, observaciones, es_encargado  FROM Investigador WHERE numero_documento = ? ;");
        ps.setString(1, dni);

        rs = ps.executeQuery();


        if(rs.next()){
            this.id = rs.getInt("id");
            this.nombre = rs.getString("nombre");
            this.apellido = rs.getString("apellido");
            this.dni = dni;
            this.telefono = rs.getString("telefono");
            this.setTelefono2(rs.getString("telefono2"));
            this.email = rs.getString("email");
            this.observacion = rs.getString("observaciones");
            this.esEncargado = rs.getBoolean("es_encargado");

            if(rs.getBoolean("desactivado"))
                throw new NullPointerException(); //encontro uno pero esta desactivado, se puede pisar
        }
        else{

           // no encuentra ningun investigador con ese numero de documento
           throw new NullPointerException();
        }

        }

    public BufferedImage getFoto() throws SQLException{
        if(this.foto != null)
            return this.foto;

        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = conLIS.getCon().prepareStatement("SELECT foto FROM Investigador WHERE id = ? AND foto IS NOT NULL ;") ;
        ps.setInt(1, this.id);
        ResultSet rs = ps.executeQuery();


        if(rs.next()){
            byte[] bytesFoto = rs.getBytes("foto");

            try{
                BufferedImage imagenFoto = ImageIO.read( new ByteArrayInputStream( bytesFoto ) );
                //crea la huella en base al png
                this.foto = imagenFoto ;
                return this.foto;
            }catch(IOException e){
                e.printStackTrace();
                return null;
            }
        }
        //no se encontro la foto
        return null;

    }

    //constructor que crea un investigador en blanco y deslogeado
    public Investigador() {
        this.logeado = false;
    }

    public void hacerAlta() throws SQLException{
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = null ;

        ps = conLIS.getCon().prepareStatement("INSERT INTO Investigador ( nombre, apellido, numero_documento, telefono, telefono2, email, observaciones, es_encargado) VALUES ( ?, ?, ?, ?, ?, ?, ?, ? )");
        ps.setString(1, this.getNombre());
        ps.setString(2, this.getApellido());
        ps.setString(3, this.getDni());
        ps.setString(4, this.getTelefono());
        ps.setString(5, this.getTelefono2());
        ps.setString(6, this.getEmail());
        ps.setString(7, this.getObservaciones());
        ps.setBoolean(8, this.esEncargado());

        ps.executeUpdate();

        //traigol a fila insertada
        PreparedStatement ps2 = conLIS.getCon().prepareStatement("SELECT @@IDENTITY AS id FROM Investigador ;") ;

        ResultSet rs = ps2.executeQuery();



        rs.next();
        this.id = rs.getInt("id");
    }

    public boolean setFoto(BufferedImage foto){
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = null;
        try{
            ps = conLIS.getCon().prepareStatement("UPDATE Investigador SET foto = ? WHERE id = ? ;") ;

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                ImageIO.write(foto, "png", baos);
                baos.flush();
                byte[] imageBytes = baos.toByteArray();
                baos.close();
                ps.setBytes(1, imageBytes);
            }catch(IOException e){
                e.printStackTrace();
                return false;
            }

            ps.setInt(2, this.id);
            ps.executeUpdate();


            this.foto = foto;

            return true;
        }catch(SQLException e){

            return false;
        }
    }

    public BufferedImage getHuella() throws SQLException{
        if(this.huella != null){
            return this.huella;
        }
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = conLIS.getCon().prepareStatement("SELECT huella FROM Investigador WHERE id = ? ;") ;
        ps.setInt(1, this.id);
        ResultSet rs = ps.executeQuery();

        if(rs.next()){
            byte[] bytesHuella = rs.getBytes("huella");

            try{

                this.huella = ImageIO.read ( new ByteArrayInputStream ( bytesHuella ) );
                //crea la huella en base al png
                //this.huella = new FingerprintImage(imagenHuella, 500);
                return this.huella;
            }catch(IOException e){
                e.printStackTrace();
                return null;
            }
        }
        //no se encontro la huella
        return null;
    }

    public boolean setHuella(BufferedImage huella){
        try{
            ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
            PreparedStatement ps = null;

            ps = conLIS.getCon().prepareStatement("UPDATE Investigador SET huella = ? WHERE id = ?");
            // O P E N
            ByteArrayOutputStream baos = new ByteArrayOutputStream( );

            // W R I T E
            try{
                ImageIO.write( huella, "png" /* "png" "jpeg" format desired, no "gif" yet. */,
                            baos );
                // C L O S E
                baos.flush();
                byte[] imageAsRawBytes = baos.toByteArray();
                baos.close();
                ps.setBytes(1, imageAsRawBytes);
            }catch(IOException e){
                e.printStackTrace();
                return false;
            }


            ps.setInt(2, this.id);

            ps.executeUpdate();


            this.huella = huella;
            return true;

        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }

    }

    public void setEstado(boolean estado){
        this.logeado = estado;
    }

    public boolean getEstado(){
        return this.logeado;
    }

    public boolean esEncargado(){
       return esEncargado;
    }

    public void setEncargado(boolean esEncargado){
       this.esEncargado = esEncargado;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDni(){
        return dni;
    }

    public String getEmail(){
        return email;
    }

    public String getTelefono(){
        return telefono;
    }

    public int getId(){
        return id;
    }

   public boolean registrarMovimiento() throws SQLException{
        if(this.getAsistenciaActual() == null){
            setAsistencia(new Asistencia(this)); //el constructor marca la entrada
            this.setEstado(true);
            return true;
        }
        else{
            this.asistencia.doSalida();
            this.setEstado(false);
            return false;
        }
    }



    public Timestamp getHoraEntrada(){
        return this.getAsistenciaActual().getHoraEntrada();
    }

    public Timestamp getHoraSalida(){
        return this.getAsistenciaActual().getHoraSalida();
    }


    public String getObservaciones() throws SQLException{
        if(this.observacion.compareTo("") != 0)
            return this.observacion;

        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = conLIS.getCon().prepareStatement("SELECT observaciones FROM Investigador where id = ? ;");
        ps.setInt(1, this.id);
        ResultSet rs = ps.executeQuery();


        if(rs.next()){
        this.observacion = rs.getString("observaciones");
        conLIS.cerrar();
        return this.observacion;
        }

        return "";
    }


    //ver bien (!) corregir
   public static LinkedList getInvestigadoresLogeados() throws SQLException{
        //modificar esto despues...es circular
        LinkedList lista = new LinkedList();
        LinkedList asist = Asistencia.getAsistenciasPendientes();
        for(int i = 0; i < asist.size(); i++){
            lista.add(((Asistencia)asist.get(i)).getInvestigador());
        }
        return lista;
    }

    public static LinkedList getListaInvestigadores() throws SQLException{
        LinkedList lista = new LinkedList();
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = conLIS.getCon().prepareStatement("SELECT id, nombre, apellido, numero_documento, telefono, telefono2, email, observaciones, es_encargado FROM Investigador where desactivado <> 1 ;") ;

        ResultSet rs = ps.executeQuery();



        while(rs.next()){
            Investigador inv = new Investigador(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"),
                    rs.getString("numero_documento"), rs.getString("telefono"), rs.getString("telefono2"),
                    rs.getString("email"), rs.getString("observaciones"), rs.getBoolean("es_encargado") );
            lista.add(inv);
        }

        return lista;
    }
    public void borrarInvestigador() throws SQLException{
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = null;
        ps = conLIS.getCon().prepareStatement("UPDATE Investigador SET desactivado = 1, huella = NULL, foto = NULL WHERE id = ?;");
        ps.setInt(1, this.getId());
        ps.executeUpdate();



    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    public Asistencia getAsistenciaActual(){
        if(this.asistencia != null)
            return this.asistencia;
        else{
            try{
                this.asistencia = Asistencia.getAsistenciaXInvestigador(this);
                return this.asistencia;
            }catch(SQLException e){
                e.printStackTrace();
                return null;
            }
        }
    }
    public void actualizarInvestigador() throws SQLException{
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        PreparedStatement ps = null;
        ps = conLIS.getCon().prepareStatement("UPDATE Investigador SET nombre = ?, apellido = ?, telefono = ?, telefono2 = ?, email = ?, numero_documento = ?, observaciones = ?, es_encargado = ? WHERE id = ?;");
        ps.setString(1, this.getNombre());
        ps.setString(2, this.getApellido());
        ps.setString(3, this.getTelefono());
        ps.setString(4, this.getTelefono2());
        ps.setString(5, this.getEmail());
        ps.setString(6, this.getDni());
        ps.setString(7, this.getObservaciones());
        ps.setBoolean(8, this.esEncargado());
        ps.setInt(9, this.getId());

        ps.executeUpdate();


    }

    public void setAsistencia(Asistencia asist){
        this.asistencia = asist;
    }

}