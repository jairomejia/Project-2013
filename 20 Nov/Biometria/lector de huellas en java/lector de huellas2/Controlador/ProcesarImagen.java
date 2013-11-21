/*
 * ProcesarImagen.java
 *
 * Created on 6 de marzo de 2007, 14:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Controlador;


import Vista.VentanaPrincipal;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
/**
 *
 * @author PC
 */
public class ProcesarImagen extends JPanel {

    private Insets insets;
    private Image imagen;
    private VentanaPrincipal ui;

    /** Creates a new instance of ProcesarImagen */
    public ProcesarImagen(VentanaPrincipal ui) {
       super();
       this.ui = ui;
       this.imagen = ui.getFoto();
       this.setBorder(BorderFactory.createLoweredBevelBorder());

    }

    public void paint(Graphics g){
        super.paint(g);
        if (insets == null) {
            insets = this.getInsets();
        }
        if (imagen != null){
            //this.imagen = ui.getFoto();
            g.drawImage(imagen, insets.left, insets.top, this);
            System.out.println("elooo");}
        else{
            g.drawString("No hay fotografía", this.getWidth() / 2 - 40, this.getHeight() / 2 - 10 );

            }
        }

    public void resizear() {

        this.imagen = ui.getFoto();
        Image original = imagen;
        if (imagen != null) {
        imagen = original.getScaledInstance(this.getWidth() , -1, Image.SCALE_FAST);
        repaint();
        descansar();
        // Arriba despacio
        imagen = original.getScaledInstance(this.getWidth() , -1, Image.SCALE_SMOOTH);
        repaint();
        descansar();
        }

    }

    private void descansar() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException ignorar) {
    }
  }


}