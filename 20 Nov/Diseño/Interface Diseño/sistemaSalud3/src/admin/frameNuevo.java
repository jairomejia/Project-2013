/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import javax.swing.Timer;
import longin.logeo;

/**
 *
 * @author Jonathan_Taba
 */
public class frameNuevo extends javax.swing.JFrame {
    private int distanciaEntreMarcos;
    private int xSigMarco;
    private int ySigMarco;

    /**
     * Creates new form entrada
     */
    public frameNuevo() {
        initComponents();
       // Timer timer = new Timer(20, new ActionListener() { public void actionPerformed(ActionEvent e) { panelCurves1.animate(); } }); timer.start();
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        nuevoRegis = new org.edisoncor.gui.button.ButtonSeven();
        edicion = new org.edisoncor.gui.button.ButtonSeven();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNuevoregistro = new javax.swing.JMenuItem();
        editregis = new javax.swing.JMenuItem();
        logeo = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        jDesktopPane.setBackground(new java.awt.Color(204, 204, 255));

        nuevoRegis.setBackground(new java.awt.Color(153, 204, 255));
        nuevoRegis.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(204, 255, 255)));
        nuevoRegis.setText("Ingreso Nuevo Registro");
        nuevoRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoRegisActionPerformed(evt);
            }
        });
        nuevoRegis.setBounds(510, 250, 190, 39);
        jDesktopPane.add(nuevoRegis, javax.swing.JLayeredPane.DEFAULT_LAYER);

        edicion.setBackground(new java.awt.Color(153, 204, 255));
        edicion.setText("Edicion de Registro");
        edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionActionPerformed(evt);
            }
        });
        edicion.setBounds(80, 240, 150, 35);
        jDesktopPane.add(edicion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        panelCurves1.setBackground(new java.awt.Color(204, 255, 255));
        panelCurves1.setBounds(0, 0, 780, 450);
        jDesktopPane.add(panelCurves1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Archivo");

        menuNuevoregistro.setText("Nuevo registro");
        menuNuevoregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoregistroActionPerformed(evt);
            }
        });
        jMenu1.add(menuNuevoregistro);

        editregis.setText("Edicion registro");
        editregis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editregisActionPerformed(evt);
            }
        });
        jMenu1.add(editregis);

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

    
     //Aqui se ingresan los datos de un nuevo registro
    private void menuNuevoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoregistroActionPerformed
     nuevoPaciente pacien = new nuevoPaciente();
        pacien.setVisible(true);
    }//GEN-LAST:event_menuNuevoregistroActionPerformed

    
        //Aqui se consulta los registros actuales para ser modificados
    private void editregisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editregisActionPerformed
       agregarMarcoInterno(new consultaNuevo());
    }//GEN-LAST:event_editregisActionPerformed

    private void nuevoRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoRegisActionPerformed
       nuevoPaciente pacien = new nuevoPaciente();
        pacien.setVisible(true);
    }//GEN-LAST:event_nuevoRegisActionPerformed

    private void edicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionActionPerformed
agregarMarcoInterno(new consultaNuevo());        // TODO add your handling code here:
    }//GEN-LAST:event_edicionActionPerformed


    //aqui se añade los internalframe al destop pane
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
    private org.edisoncor.gui.button.ButtonSeven edicion;
    private javax.swing.JMenuItem editregis;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logeo;
    private javax.swing.JMenuItem menuNuevoregistro;
    private org.edisoncor.gui.button.ButtonSeven nuevoRegis;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
