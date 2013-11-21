/*
 * ControladorBaseDeDatos.java
 *
 * Created on 15 de febrero de 2007, 12:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Controlador;

/**
 * Se encarga de centralizar todos los accesos a la base de datos.
 *
 * @author Ing. Valerio Frittelli
 * @version Octubre de 2004
 * @modificada por Martin Farias para LISBioID del Labopratorio de Investigacion de Software
 * @Febrero de 2007
 *
 */

import java.sql.*;

public class ControladorBaseDeDatos
{
    private Connection con;

    public Connection getCon() {
        return con;
    }
    private Statement  st;
    private ResultSet  res;
    private PreparedStatement ps ;

    public PreparedStatement getPs() {
        return ps;
    }
    //mylaptop server begin
    private final String url = "jdbc:sqlserver://";
    private final String serverName= "localhost";
    private final String portNumber = "2461";
    private final String databaseName= "lisbioid";
    private final String instance = "MARTIN\\tuza";
    private final String userName = "sa";
    private final String password = "eltuza";
    private final String selectMethod = "cursor";
    //mylaptop server end

    //mslabs begin
//    private final String url = "jdbc:sqlserver://";
//    private final String serverName= "MSLABS\\PRODUCCION";
//    private final String portNumber = "3341";
//    private final String databaseName= "lisbioid";
//    private final String instance = "MSLABS\\PRODUCCION";
//    private final String userName = "lisbioid";
//    private final String password = "energianuclear";
//    private final String selectMethod = "cursor";
    //mslabs end

    public ControladorBaseDeDatos()//String baseDato) la base ahora se configura en odbc
    {

         try
         {
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //setear ususario, password y base por defecto en la conexion obds de windows
               con = DriverManager.getConnection(getConnectionUrl(), userName, password);
         }

         catch(Exception e)
         {
               System.out.println("Error general: " + e.getMessage());
               e.printStackTrace();
         }
    }
    public Connection getC(){
        return this.con;
    }

    private String getConnectionUrl(){
         return url+serverName+":" + portNumber + ";"+"databaseName="+databaseName +";" + "selectMethod="+selectMethod+";"+"instance="+instance+";";

     }
    public ResultSet consulta( String query )
    {
        try
        {
            res = st.executeQuery( query );
        }
        catch( Exception e )
        {
            res = null;
            System.out.println( e.toString()  + "\n" + "En consulta" );
            e.printStackTrace();
        }

        return res;
    }

    public ResultSet getResult() {
        return res;
    }

    public boolean insertar( String query )
    {
        try
        {
            st.executeUpdate( query );
        }
        catch( Exception e )
        {
            System.out.println( e.toString() );
            return false;
        }

        return true;
    }

    public void cerrar()
    {
        try
        {
            st.close();
            con.close();
        }

        catch(Exception e)
        {
            System.out.println("Error al cerrar las bases de datos: "  +  e.getMessage());
        }
    }
}

