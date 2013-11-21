
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.MemoryImageSource;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;


public class CanvasEfecto extends JPanel implements Runnable {

  Thread thread;

  Image image;

  BufferedImage bi;

  Graphics gr;

  private int avance = 10;

  private int alturaPanel;

  private int alturaAcum;
  private int anchoPanel;

  public CanvasEfecto(Image imagen, int anchoPanel, int alturaPanel) {
    setBackground(Color.white);
    //setSize(450, 400);

    this.image = imagen;
    this.alturaPanel = alturaPanel;

    MediaTracker mt = new MediaTracker(this);
    mt.addImage(image, 1);
    try {
      mt.waitForAll();
    } catch (Exception e) {
      System.out.println("Exception while loading image.");
    }

    if (image  == null) {
      System.out.println("No hay imagen ");
    }

    this.alturaAcum = 0;
    this.anchoPanel = anchoPanel;
  }

  public void step(int avance) {

      if((alturaAcum =+ avance) < alturaPanel ){
          this.gr = image.getGraphics().create(0, 0, image.getWidth(this), alturaAcum);
          System.out.println("testoinmg");
      }System.out.println("testoifvfgunmg");
  }

  public void paint(Graphics g) {
    super.paint(g);

    //super.paintComponent(gr);
    if (image == null)
        g.drawString("No hay huella", anchoPanel/2 - 40, alturaPanel/2-10 );
    Dimension d = getSize();

    bi = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_ARGB);
    Graphics2D big = bi.createGraphics();


    step(this.avance);
    big.drawImage(image, 0, 0, this);
    Graphics2D g2D = (Graphics2D) g;
    g2D.drawImage(bi, 0, 0, null);
    g2D.setBackground(new Color(255,255,255));
    g2D.drawRect(0, alturaAcum, anchoPanel, alturaPanel);

    big.dispose();
  }

  public void start() {
    thread = new Thread(this);
    thread.setPriority(Thread.MIN_PRIORITY);
    thread.start();
  }

  public void stop() {
    if (thread != null)
      thread.interrupt();
    thread = null;
  }

  public void run() {
    Thread me = Thread.currentThread();
    while (thread == me) {
      repaint();
    }
    thread = null;
  }
}
