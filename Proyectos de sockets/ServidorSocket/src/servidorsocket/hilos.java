/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johana
 */
public class hilos extends Thread{
    ServerSocket server ;
    Socket cliente;
    DataInputStream in;
    DataOutputStream out;
    String mensaje;
    
    public hilos(ServerSocket serv, Socket sockC)
    {
       this.cliente = sockC;
       this.server = serv;
       //run();
        
    }
    
    public void run()
    {
        
        try
            {
                
                while(true)
                    {
                        cliente = server.accept();                       
                        in = new DataInputStream(cliente.getInputStream());
                        mensaje = in.readUTF();
                        System.out.println(mensaje);
                                
                        out = new DataOutputStream(cliente.getOutputStream());          
                        out.writeUTF("ud hiso una Consulta");
          
                    }
            }
        catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
        
    }
}

