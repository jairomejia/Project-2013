/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
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
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        BotonNuevoRegistro = new javax.swing.JButton();
        BotonEdicionRegistro = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        MenuNuevoregistro = new javax.swing.JMenuItem();
        MenuEdicionRegistro = new javax.swing.JMenuItem();
        MenuLogeo = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");

        jDesktopPane.setBackground(new java.awt.Color(204, 204, 255));

        BotonNuevoRegistro.setText("Ingreso Nuevo Registro");
        BotonNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoRegistroActionPerformed(evt);
            }
        });
        BotonNuevoRegistro.setBounds(90, 210, 170, 23);
        jDesktopPane.add(BotonNuevoRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BotonEdicionRegistro.setText("Edición Registro");
        BotonEdicionRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEdicionRegistroActionPerformed(evt);
            }
        });
        BotonEdicionRegistro.setBounds(430, 210, 130, 23);
        jDesktopPane.add(BotonEdicionRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        archivo.setText("Archivo");

        MenuNuevoregistro.setText("Nuevo registro");
        MenuNuevoregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuNuevoregistroActionPerformed(evt);
            }
        });
        archivo.add(MenuNuevoregistro);

        MenuEdicionRegistro.setText("Edición registro");
        MenuEdicionRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEdicionRegistroActionPerformed(evt);
            }
        });
        archivo.add(MenuEdicionRegistro);

        MenuLogeo.setText("Logeo");
        MenuLogeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLogeoActionPerformed(evt);
            }
        });
        archivo.add(MenuLogeo);

        MenuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        archivo.add(MenuSalir);

        BarraMenu.add(archivo);

        Ayuda.setText("Ayuda");
        BarraMenu.add(Ayuda);

        setJMenuBar(BarraMenu);

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

    //Esta acción permite salir del programa
    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
     System.exit(0);        
    }//GEN-LAST:event_MenuSalirActionPerformed

    //Esta accion permitira volver al logeo para iniciar con un nuevo usuario
    private void MenuLogeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLogeoActionPerformed
       this.dispose();
        logeo lo = new logeo();
        lo.setVisible(true);
    }//GEN-LAST:event_MenuLogeoActionPerformed

        //Aqui se ingresan los datos de un nuevo registro
    private void BotonNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoRegistroActionPerformed
        nuevoPaciente pacien = new nuevoPaciente();
        pacien.setVisible(true);
    }//GEN-LAST:event_BotonNuevoRegistroActionPerformed

    
    //Aqui se consulta los registros actuales para ser modificados
    private void BotonEdicionRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEdicionRegistroActionPerformed
        agregarMarcoInterno(new consultaNuevo());
    }//GEN-LAST:event_BotonEdicionRegistroActionPerformed

     //Aqui se ingresan los datos de un nuevo registro
    private void MenuNuevoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuNuevoregistroActionPerformed
     nuevoPaciente pacien = new nuevoPaciente();
        pacien.setVisible(true);
    }//GEN-LAST:event_MenuNuevoregistroActionPerformed

    
        //Aqui se consulta los registros actuales para ser modificados
    private void MenuEdicionRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEdicionRegistroActionPerformed
       agregarMarcoInterno(new consultaNuevo());
    }//GEN-LAST:event_MenuEdicionRegistroActionPerformed


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
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton BotonEdicionRegistro;
    private javax.swing.JButton BotonNuevoRegistro;
    private javax.swing.JMenuItem MenuEdicionRegistro;
    private javax.swing.JMenuItem MenuLogeo;
    private javax.swing.JMenuItem MenuNuevoregistro;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JMenu archivo;
    private javax.swing.JDesktopPane jDesktopPane;
    // End of variables declaration//GEN-END:variables
}
