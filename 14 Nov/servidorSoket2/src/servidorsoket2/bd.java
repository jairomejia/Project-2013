package servidorsoket2;


import base.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import servidorsoket2.ServidorSoket2View.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johana
 */
public class bd {
    DefaultTableModel modelo;  
    JTable tabla;
    JScrollPane ps;
    public String cadena;
    public bd(int ced)
    {
        baseD(ced);
    }
    
   public void baseD(int ced)
    {
        String sq = "";
        String titulos[]={"Documento", "Nombre", "apellido", "Edad", "Eps", "Regimen"};
        modelo= new DefaultTableModel(null, titulos);
        String arreglo[]= new String[6];
        //String a="", b="", c="", d="", e="", f="";
        ConexionMySQL sql = new ConexionMySQL();
        Connection cn = sql.Conectar();
      
        
       sq="SELECT * FROM pacientes WHERE documento="+ced; 
       
        try 
        {
         Statement st = cn.createStatement();
         ResultSet rs = st.executeQuery(sq);
         
         while(rs.next())
            {
               arreglo[0]= rs.getString("documento");
               arreglo[1]= rs.getString("nombre");
               arreglo[2]= rs.getString("apellido");
               arreglo[3]= rs.getString("edad");
               arreglo[4]= rs.getString("eps");
               arreglo[5]= rs.getString("regimen");  
               
               modelo.addRow(arreglo);
               
            }
         cadena=arreglo[0]+";"+arreglo[1]+";"+arreglo[2]+";"+arreglo[3]+";"+arreglo[4]+";"+arreglo[5];
         //tabla.setModel(modelo);
            System.out.println(cadena);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }

    public String getCadena() {
        return cadena;
    }
    
}
