/*
 * Asistencia.java
 *
 * Created on 31 de mayo de 2007, 10:17
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Modelo;

import Controlador.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.LinkedList;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

/**
 *
 * @author mfrias
 */
public class Asistencia {

    private int id;
    private Investigador inv;
    private Timestamp horaEntrada;
    private Timestamp horaSalida;

    private PreparedStatement ps;


    public Asistencia(int id, Timestamp horaEntrada, Timestamp horaSalida, Investigador inv){
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.inv = inv;
        this.id = id;
    }

    //crea una asistencia ante una entrada
    public Asistencia(Investigador inv ) throws SQLException{
        this.inv = inv;
        Calendar now = Calendar.getInstance(); //trae el calendario
        horaEntrada = new Timestamp(now.getTime().getTime());
        horaSalida = null;
        this.ps = null;
        doEntrada(); //setea la id

    }

    //trae una asistencia creada con el id
    public Asistencia(int id) throws NullPointerException, SQLException {
        this.id = id;
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();

        ps = conLIS.getCon().prepareStatement("SELECT h_entrada, h_salida, id_investigador FROM Asistencia where id = ? ");
        ps.setInt(1, this.id);
        ResultSet rs = ps.executeQuery();


        if(rs.next()){

            this.horaEntrada = rs.getTimestamp("h_entrada");
            this.horaSalida = rs.getTimestamp("h_salida");
            this.inv = new Investigador(rs.getInt("id_investigador"));

        }
        else {
            throw new NullPointerException();
        }

    }

    public void doSalida() throws SQLException{
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();

        Calendar salida = Calendar.getInstance();
        horaSalida = new Timestamp(salida.getTime().getTime());

        ps = conLIS.getCon().prepareStatement("UPDATE Asistencia SET h_salida = ? WHERE id = ? ");
        ps.setTimestamp(1, horaSalida);
        ps.setInt(2, id);
        ps.executeUpdate();

    }

    public void doEntrada() throws SQLException{
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        ps = conLIS.getCon().prepareStatement("INSERT INTO Asistencia(h_entrada, id_investigador) VALUES ( ? , ? );");
        ps.setTimestamp(1, horaEntrada);
        ps.setInt(2, inv.getId());
        ps.executeUpdate();

        //ResultSet rs =  conLIS.consulta("select @@identity AS id from Asistencia;"); para msaccess
        PreparedStatement ps2 = conLIS.getCon().prepareStatement("SELECT id FROM Asistencia WHERE id = @@identity;");
        ResultSet rs =  ps2.executeQuery();


        rs.next();
        this.id = rs.getInt("id");


    }

    public static LinkedList getAsistenciasPendientes() throws SQLException{
        LinkedList lista = new LinkedList();
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();

        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 1);
        //se setea a today como la fecha con hora 0 minuto 1

        Timestamp todayTS= new Timestamp(today.getTime().getTime());
        PreparedStatement ps = conLIS.getCon().prepareStatement("SELECT * FROM Asistencia WHERE h_entrada > ? and h_salida is NULL ;");
        ps.setTimestamp(1, todayTS);
        ResultSet rs = ps.executeQuery();

        while(rs.next() != false){

            Asistencia a = new Asistencia(rs.getInt("id"), rs.getTimestamp("h_entrada"), null, new Investigador(rs.getInt("id_investigador")));

            a.getInvestigador().setAsistencia(a); // aca
            //(!) ver esta parte y continuar arriba, la de setasistencia y setestado
            a.getInvestigador().setEstado(true);
            lista.add(a);
        }
        return lista;
    }

    public Investigador getInvestigador(){
        return this.inv;
    }
    public static Asistencia getAsistenciaXInvestigador (Investigador inv) throws SQLException{
        ControladorBaseDeDatos conLIS = ControladorBaseDeDatosFactory.instance();
        //solo devuelve una asistencia en la que el investigador no esta deslogueado...es decir..entro, pero no salio
        PreparedStatement ps = null;

        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 1);
        //se setea a today como la fecha con hora 0 minuto 1
        Timestamp todayTS= new Timestamp(today.getTime().getTime());


        ps = conLIS.getCon().prepareStatement("SELECT h_entrada, id FROM Asistencia WHERE id_investigador = ? AND h_entrada > ? AND h_salida IS NULL ; ");
        ps.setInt(1, inv.getId());
        ps.setTimestamp(2, todayTS);
        ResultSet rs = ps.executeQuery();


        if(rs.next()){

            Asistencia a = new Asistencia(rs.getInt("id"), rs.getTimestamp("h_entrada"), null, inv );
            return a;

        }
        else {
            return null;
        }
    }

        public Timestamp getHoraEntrada(){
        return this.horaEntrada;
    }

    public Timestamp getHoraSalida(){
        return this.horaSalida;
    }

    public void setHoraEntrada(Timestamp hora){
        this.horaEntrada = hora;
    }

    public void setHoraSalida(Timestamp hora){
        this.horaSalida = hora;
    }
}