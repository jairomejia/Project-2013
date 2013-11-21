/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorsocket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mary Mena
 */
public class formulario extends JFrame implements ActionListener{
  public JFrame ventana;
public JTextField campo1;
public JLabel texto;
public JButton boton, boton2,boton3;
public String a;

ServerSocket serverSocket, serverSocket2;
Socket socketCliente, socketCliente2;

        
    public formulario()
    {
        
        contenedor();
        socket();
   
    }
    
     public void contenedor()
    {
     ventana= new JFrame();
     ventana.setBounds(0, 0, 500, 500);
     ventana.setLayout(null);
     ventana.setVisible(true);
     
     campo1= new JTextField();
     campo1.setBounds(20, 20, 100, 20);
     ventana.add(campo1);
     campo1.setVisible(true);
     
     texto= new JLabel();
     texto.setBounds(150, 20, 100, 20);
     ventana.add(texto);
     texto.setVisible(true);
     
     boton = new JButton();
     boton.setBounds(20, 40, 100, 20);
     boton.setText("Enviar");
     ventana.add(boton);
     boton.setVisible(true);
     boton.addActionListener(this);
     
     boton2 = new JButton();
     boton2.setBounds(140, 40, 100, 20);
     boton2.setText("Desconectar");
     ventana.add(boton2);
     boton2.setVisible(true);
     boton2.addActionListener(this);
     
     boton3 = new JButton();
     boton3.setBounds(80, 90, 100, 20);
     boton3.setText("Conectar");
     ventana.add(boton3);
     boton3.setVisible(true);
     boton3.addActionListener(this);
     
     
    }
     
     public void socket()
     { 
        
        try
            {
                
                serverSocket = new ServerSocket(5000);                
                serverSocket2 = new ServerSocket(5001);
                System.out.println("Esperando una conexión:");            
                                
                hilos h = new hilos(serverSocket, socketCliente);
                h.start();
               
                hiloConsulta h2 = new hiloConsulta(serverSocket2, socketCliente2);
                h2.start();            
            }
        
        catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
         
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
    }
}
