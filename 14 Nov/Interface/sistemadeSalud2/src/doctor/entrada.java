package doctor;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import doctor.consultar;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import longin.logeo;

/**
 *
 * @author Jonathan_Taba
 */
public class entrada extends javax.swing.JFrame {
    private int distanciaEntreMarcos;
    private int xSigMarco;
    private int ySigMarco;

    /**
     * Creates new form entrada
     */
    public entrada() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        consultar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logeo = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(new java.awt.Color(204, 204, 255));

        consultar.setText("Consulta");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        consultar.setBounds(220, 230, 80, 23);
        jDesktopPane.add(consultar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Archivo");

        logeo.setText("Logeo");
        logeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logeoActionPerformed(evt);
            }
        });
        jMenu1.add(logeo);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
     System.exit(0);
             
    }//GEN-LAST:event_salirActionPerformed

    //Esta accion permitira volver al logeo para iniciar con un nuevo usuario
    private void logeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logeoActionPerformed
       this.dispose();
        logeo lo = new logeo();
        lo.setVisible(true);
    }//GEN-LAST:event_logeoActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
       agregarMarcoInterno(new consultar());
    }//GEN-LAST:event_consultarActionPerformed


    
      private void agregarMarcoInterno(JInternalFrame marco) { 
    
        marco.setLocation(xSigMarco, ySigMarco); 
        marco.setVisible(true); 
        jDesktopPane.add(marco);

        try { 
            marco.setSelected(true); 
        } catch (PropertyVetoException ex) { 
        }

        if (distanciaEntreMarcos == 0) 
            distanciaEntreMarcos = marco.getHeight() - marco.getContentPane().getHeight();

        xSigMarco += distanciaEntreMarcos; 
        ySigMarco += distanciaEntreMarcos; 
        if (xSigMarco + marco.getWidth() > jDesktopPane.getWidth()) xSigMarco = 0; 
        if (ySigMarco + marco.getHeight() > jDesktopPane.getHeight()) ySigMarco = 0; 
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultar;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logeo;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
