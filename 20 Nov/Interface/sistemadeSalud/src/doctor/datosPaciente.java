/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class datosPaciente extends javax.swing.JFrame {

    CardLayout card = new CardLayout();
    private int distanciaEntreMarcos;
    diagnosti dia = new diagnosti();
    
    public datosPaciente() {
        initComponents();
        
        contenedor.setLayout(card);
        
        contenedor.add(datosPaciente,"1");
        contenedor.add(historiaclinica,"2");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        datosPaciente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        numId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nuevaBusqueda = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        historiaclinica = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        especialista = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        historiaClinica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnostico = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setTitle("Sistema Integrado de salud");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del paciente"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Places-user-identity-icon.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 67, -1, 136));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Tipo de identificacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Nombres:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Numero de identificacion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Apellidos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Departamento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Municipio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jTextField1.setEnabled(false);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 130, -1));

        jTextField2.setEnabled(false);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, -1));

        jTextField3.setEnabled(false);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 130, -1));

        jTextField4.setEnabled(false);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 130, -1));

        nombres.setEnabled(false);
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 130, -1));

        jTextField10.setEnabled(false);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 130, -1));

        numId.setEnabled(false);
        jPanel1.add(numId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Informacion basica del afiliado");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 27, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("Sexo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        sexo.setEnabled(false);
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel26.setText("Estrato social");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, -1));

        jTextField13.setEnabled(false);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel24.setText("Rh");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 30, -1));

        jTextField9.setEnabled(false);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 130, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel25.setText("Correo electronico");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 140, -1));

        jTextField11.setEnabled(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 130, -1));

        nuevaBusqueda.setText("Nueva busqueda");
        nuevaBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaBusquedaActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(nuevaBusqueda)
                .addGap(54, 54, 54)
                .addComponent(guardar)
                .addGap(79, 79, 79)
                .addComponent(salir)
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaBusqueda)
                    .addComponent(salir)
                    .addComponent(guardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la afiliacion"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setText("Estado:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 53, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel11.setText("Tipo afiliado:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel12.setText("Entidad:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 53, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Fecha afiliacion entidad:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 91, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("Regimen:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 53, -1, -1));

        jTextField5.setEnabled(false);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 50, 117, -1));

        jTextField6.setEnabled(false);
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 50, 142, -1));

        jTextField7.setEnabled(false);
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 131, -1));

        jTextField8.setEnabled(false);
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 142, -1));

        jTextField12.setEnabled(false);
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 137, -1));

        javax.swing.GroupLayout datosPacienteLayout = new javax.swing.GroupLayout(datosPaciente);
        datosPaciente.setLayout(datosPacienteLayout);
        datosPacienteLayout.setHorizontalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addGroup(datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        datosPacienteLayout.setVerticalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Historia Clinica"));
        jPanel5.setToolTipText("");
        jPanel5.setPreferredSize(new java.awt.Dimension(850, 643));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("Fecha");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 96, 104, 33));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("Especialista de la salud");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 140, 160, 32));

        jLabel19.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel19.setText("Diagnostico:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 113, 41));

        especialista.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        especialista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                especialistaKeyTyped(evt);
            }
        });
        jPanel5.add(especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 300, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel20.setText("Historia Clinica N°");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 30, -1, -1));

        historiaClinica.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        historiaClinica.setEnabled(false);
        historiaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historiaClinicaActionPerformed(evt);
            }
        });
        jPanel5.add(historiaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 27, 88, -1));

        diagnostico.setColumns(20);
        diagnostico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        diagnostico.setLineWrap(true);
        diagnostico.setRows(5);
        jScrollPane1.setViewportView(diagnostico);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 370, 130));

        jLabel21.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel21.setText("Codigo Paciente");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jTextField14.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jTextField14.setEnabled(false);
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 27, 120, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel22.setText("Hora Entrada");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel23.setText("Hora Salida");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jTextField15.setEnabled(false);
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 76, -1));

        jTextField16.setEnabled(false);
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 81, -1));

        jButton1.setText("Diagnosticos anteriores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel18.setText("Nombre IPS:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, -1));
        jPanel5.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 110, -1));

        javax.swing.GroupLayout historiaclinicaLayout = new javax.swing.GroupLayout(historiaclinica);
        historiaclinica.setLayout(historiaclinicaLayout);
        historiaclinicaLayout.setHorizontalGroup(
            historiaclinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historiaclinicaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        historiaclinicaLayout.setVerticalGroup(
            historiaclinicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historiaclinicaLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(historiaclinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(datosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contenedorLayout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(historiaclinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 19, Short.MAX_VALUE)))
        );

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 850, 660));

        jButton2.setText("Datos Paciente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Historia Clinica");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(628, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
      this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void nuevaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaBusquedaActionPerformed
     this.dispose();
    consultar con = new consultar();
    con.setVisible(true);
       
    }//GEN-LAST:event_nuevaBusquedaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       card.show(contenedor, "1");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     card.show(contenedor, "2");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void historiaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historiaClinicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historiaClinicaActionPerformed

    private void especialistaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_especialistaKeyTyped
     char car = evt.getKeyChar(); 
 
if(especialista.getText().length()>=40) evt.consume();
if((car<'a' || car>'z') && (car<'A' || car>'Z')             
    && car !='á' //Minúsculas             
    && car !='é'            
    && car !='í'            
    && car !='ó'           
    && car !='ú'   
    && car !='Á' //Mayúsculas             
    && car !='É'            
    && car !='Í'            
    && car !='Ó'           
    && car !='Ú' 
    && (car != (char) KeyEvent.VK_SPACE)
        )
{      
  evt.consume();   
}
        
        
    }//GEN-LAST:event_especialistaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      dia.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel datosPaciente;
    private javax.swing.JTextArea diagnostico;
    private javax.swing.JTextField especialista;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField historiaClinica;
    private javax.swing.JPanel historiaclinica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField nombres;
    private javax.swing.JButton nuevaBusqueda;
    private javax.swing.JTextField numId;
    private javax.swing.JButton salir;
    private javax.swing.JTextField sexo;
    // End of variables declaration//GEN-END:variables
}
