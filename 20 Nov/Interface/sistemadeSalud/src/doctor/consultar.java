/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import doctor.datosPaciente;

/**
 *
 * @author Jonathan_Taba
 */
public class consultar extends javax.swing.JInternalFrame {

    /**
     * Creates new form consultar
     */
    public consultar() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTipoDoc = new javax.swing.JLabel();
        LabelNum = new javax.swing.JLabel();
        NumeroId = new javax.swing.JTextField();
        BotonConsulta = new javax.swing.JButton();
        TipoDoc = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identificación"));

        LabelTipoDoc.setText("Tipo de documento:");

        LabelNum.setText("Número: ");

        NumeroId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroIdActionPerformed(evt);
            }
        });

        BotonConsulta.setText("Consultar");
        BotonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultaActionPerformed(evt);
            }
        });

        TipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cédula de Ciudadania", "Tarjeta de Identidad", "Cédula de Extrangeria", "Pasaporte", "Registro Civil", "N° Unico de Id. Personal", "Adulto sin Identificación", "Menor sin Identificación" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTipoDoc)
                            .addComponent(LabelNum))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumeroId, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(BotonConsulta)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNum)
                    .addComponent(NumeroId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(BotonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //en este boton lo que se hace es dar la accion del evento y instanciar el objeto y hacerlo visible
    private void BotonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultaActionPerformed
        this.dispose();
        datosPaciente data = new datosPaciente();
        data.setVisible(true);
    }//GEN-LAST:event_BotonConsultaActionPerformed

    private void NumeroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroIdActionPerformed
        // inserta el numero de documento
    }//GEN-LAST:event_NumeroIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConsulta;
    private javax.swing.JLabel LabelNum;
    private javax.swing.JLabel LabelTipoDoc;
    private javax.swing.JTextField NumeroId;
    private javax.swing.JComboBox TipoDoc;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
