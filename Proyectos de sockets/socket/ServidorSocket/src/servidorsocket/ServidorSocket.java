package servidorsocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {

    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socketCliente;
        DataInputStream in;
        DataOutputStream out;
        String mensaje;
        
        try
            {
                serverSocket = new ServerSocket(5000);
                System.out.println("Esperando una conexión:");
                while(true)
                    {
                        socketCliente = serverSocket.accept();
                        in = new DataInputStream(socketCliente.getInputStream());
                        mensaje = in.readUTF();
                        System.out.println(mensaje);
                        
                        if(mensaje.equals("peticion"))
                            {
                                out = new DataOutputStream(socketCliente.getOutputStream());
                                out.writeUTF("peticion realizada");
                                out.close();
                            }
                        
                        in.close();
                        socketCliente.close();
                    }
            }
        catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
    }
}
