/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Mary Mena
 */
public class hiloConsulta extends Thread{
ServerSocket server2;
Socket cliente2;
DataInputStream in2;
DataOutputStream out, out2;
String mensaje, mensaje2;
    public hiloConsulta(ServerSocket serv2, Socket sockC2) 
    {
     this.cliente2= sockC2;
     this.server2 = serv2;
    }

    @Override
    public void run() 
    {
        
         try
            {
                 
                while(true)
                    {
                        cliente2 = server2.accept();                         
                        in2 = new DataInputStream(cliente2.getInputStream());
                        mensaje2 = in2.readUTF();
                        System.out.println(mensaje2);
                        
                        String arreglo[] = new String[3];
                        arreglo[0]="Arango ";
                        arreglo[1]="Sebas ";
                        arreglo[2]="Yulian";
              
                        out2 = new DataOutputStream(cliente2.getOutputStream());          
                        out2.writeUTF(arreglo[0]);
                        out2.writeUTF(arreglo[1]);
                        out2.writeUTF(arreglo[2]);
                        System.out.println("Esperando nueva conexion...");
          
                    }
            }
         
        catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
        
    }    
}
