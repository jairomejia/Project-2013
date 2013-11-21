package clientesocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClienteSocket {

    public static void main(String[] args) {
        Socket miSocket;
        DataOutputStream out;
        DataInputStream in;
        
        try
            {
                miSocket = new Socket("192.168.1.13", 5000);
                
                out = new DataOutputStream(miSocket.getOutputStream());
                out.writeUTF("peticion");
                
                in = new DataInputStream(miSocket.getInputStream());
                String mensajeRecibido = in.readUTF();
                
                System.out.println(mensajeRecibido);
                
                in.close();
                out.close();
                miSocket.close();
            }
        catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
    }
}
