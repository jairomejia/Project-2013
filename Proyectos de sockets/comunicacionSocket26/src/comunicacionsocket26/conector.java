/*sirve para comunicar dos programas de modelo cliente-servidor
 */
package comunicacionsocket26;
// permiten establecer las conexiones
import java.net.*;
import java.io.*;

/**
 *
 * @author Administrador
 */
public class conector {
    
    Socket cliente;
    //hace referencia al puerto que se va a conectar del servidor
    int puerto = 9000;
    String ip= "127.0.0.1";
    // guarda la informacion que venga del exterior
    BufferedReader entrada, teclado;
    //sirve para enviar datos, de preferencia texto
    PrintStream salida;
    
    public void inicio()
    {
        try
        {
            /* se instacia el cliente con parametros que sirven para establecer 
            donde se conectara*/
            cliente = new Socket(ip, puerto);
            //guarda datos entrantes
            entrada = new BufferedReader
                    (new InputStreamReader(cliente.getInputStream()));
            teclado = new BufferedReader
                    (new InputStreamReader(System.in));
            //recibe un texto escrito desde el teclado que es el que envia
            String tec = teclado.readLine();
            //envia el texto recibido
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(tec);
            //recibe un texto proveniente desde el servidor y lo imprime
            String msg = entrada.readLine();
            System.out.println(msg);
            
            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();
        }
        catch(Exception e){}
    }
    
    
}
