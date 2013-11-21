/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacionsocket25;

import java.net.*;
import java.io.*;

public class conector {
    ServerSocket server;
    Socket socket;
    int puerto = 9000;
    DataOutputStream salida;
    BufferedReader entrada;
    
    public void iniciar()
    {
        try{
            server = new ServerSocket(puerto);
            socket = new Socket();
            socket = server.accept();
            
            entrada = new BufferedReader
                    (new InputStreamReader(socket.getInputStream()));
            String mensaje = entrada.readLine();
            System.out.println(mensaje);
            salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF("Adios ADSI 24 horas");
            socket.close();

        }
        catch(Exception e){}
    }
}
