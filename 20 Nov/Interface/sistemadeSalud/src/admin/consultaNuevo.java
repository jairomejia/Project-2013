/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

/**
 *
 * @author Jonathan_Taba
 */
public class consultaNuevo extends javax.swing.JInternalFrame {

    /**
     * Creates new form consultar
     */
    public consultaNuevo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        TipoDoc = new javax.swing.JComboBox();
        Label2 = new javax.swing.JLabel();
        NumeroId = new javax.swing.JTextField();
        BotonConsultar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        Contenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificación"));

        Label1.setText("Tipo de Documento:");

        TipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cédula de Ciudadania", "Tarjeta de Identidad", "Cédula de Extrangeria", "Pasaporte", "Registro Civil", "N° Unico de Id. Personal", "Adulto sin Identificación", "Menor sin Identificación" }));

        Label2.setText("Número:");

        NumeroId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroIdKeyTyped(evt);
            }
        });

        BotonConsultar.setText("Consultar");
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label1)
                            .addComponent(Label2))
                        .addGap(37, 37, 37)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TipoDoc, 0, 154, Short.MAX_VALUE)
                            .addComponent(NumeroId)))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(BotonConsultar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(NumeroId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(BotonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este boton abre el registro del paciente
    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
        this.dispose();
        nuevoPaciente paci = new nuevoPaciente();
        paci.setVisible(true);
    }//GEN-LAST:event_BotonConsultarActionPerformed

    
    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void NumeroIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroIdKeyTyped
      char car = evt.getKeyChar();
 if(NumeroId.getText().length()>=15) evt.consume();
if((car<'0' || car>'9')) evt.consume();
       
       
    }//GEN-LAST:event_NumeroIdKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsultar;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JTextField NumeroId;
    private javax.swing.JComboBox TipoDoc;
    // End of variables declaration//GEN-END:variables
}
