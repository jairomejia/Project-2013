/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import doctor.consultar;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class nuevoPaciente extends javax.swing.JFrame {

   
    private int distanciaEntreMarcos;
    
    public nuevoPaciente() {
        initComponents();
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosPaciente = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ape = new javax.swing.JTextField();
        muni = new javax.swing.JTextField();
        fechaNa = new javax.swing.JTextField();
        dep = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        numId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        foto = new javax.swing.JButton();
        tipoDoc = new javax.swing.JComboBox();
        sex = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        nombres1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        nombres2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nuevaBusqueda = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        esta = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        afiliaFe = new javax.swing.JTextField();

        setTitle("Sistema Integrado de salud");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del paciente"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Places-user-identity-icon.png"))); // NOI18N
        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 136));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Tipo de identificacion:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Primer Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Numero de ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Segundo Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Departamento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Municipio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        jPanel1.add(ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 130, -1));
        jPanel1.add(muni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, -1));
        jPanel1.add(fechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 130, -1));
        jPanel1.add(dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 130, -1));
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, -1));

        numId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numIdActionPerformed(evt);
            }
        });
        jPanel1.add(numId, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Informacion basica del afiliado");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("Sexo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        foto.setText("Foto");
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        tipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula de Ciudadania", "Targeta de Identidad", "Cedula de Extrangeria", "Pasaporte", "Registro Civil", "N° Unico de Id. Personal", "Adulto sin Identificacion", "Menor sin Identificacion" }));
        tipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDocActionPerformed(evt);
            }
        });
        jPanel1.add(tipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 160, -1));

        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("Segundo Nombre:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));
        jPanel1.add(nombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 130, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("Primer apellido:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));
        jPanel1.add(nombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 130, -1));

        nuevaBusqueda.setText("Nuevo registro");
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

        jButton1.setText("Limpiar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(nuevaBusqueda)
                .addGap(63, 63, 63)
                .addComponent(guardar)
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(salir)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevaBusqueda)
                    .addComponent(salir)
                    .addComponent(guardar)
                    .addComponent(jButton1))
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
        jPanel3.add(esta, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 50, 117, -1));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 50, 142, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 131, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 142, -1));
        jPanel3.add(afiliaFe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 137, -1));

        javax.swing.GroupLayout datosPacienteLayout = new javax.swing.GroupLayout(datosPaciente);
        datosPaciente.setLayout(datosPacienteLayout);
        datosPacienteLayout.setHorizontalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPacienteLayout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPacienteLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        datosPacienteLayout.setVerticalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(datosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numIdActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
      this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void nuevaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaBusquedaActionPerformed
     this.dispose();
    consultar con = new consultar();
    con.setVisible(true);
       
    }//GEN-LAST:event_nuevaBusquedaActionPerformed

    
    //Aqui se subira la foto para ser guardada en la bvase de datos
    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
      
        JFileChooser img = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter(".jpg.gif & .png", "jpg", "gif","png"); 
        img.setFileFilter(filtro); 
        img.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        int option = img.showOpenDialog(this);
        
        if(option==JFileChooser.APPROVE_OPTION){
        
            String fil = img.getSelectedFile().getPath();
            
            String file = img.getSelectedFile().toString();
            
            imagen.setIcon(new ImageIcon(fil));
            
            ImageIcon icon = new ImageIcon(fil);
            
            Image im = icon.getImage();
            
            Image newimg = im.getScaledInstance(130, 130, java.awt.Image.SCALE_SMOOTH);
            
            ImageIcon newicon = new ImageIcon(newimg);
            
            imagen.setIcon(newicon);
            imagen.setSize(130,130);
            
//            rutaimagen = "";  
        }
        
    }//GEN-LAST:event_fotoActionPerformed

    private void tipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField afiliaFe;
    private javax.swing.JTextField ape;
    private javax.swing.JPanel datosPaciente;
    private javax.swing.JTextField dep;
    private javax.swing.JTextField esta;
    private javax.swing.JTextField fechaNa;
    private javax.swing.JButton foto;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField muni;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField nombres1;
    private javax.swing.JTextField nombres2;
    private javax.swing.JButton nuevaBusqueda;
    private javax.swing.JTextField numId;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox sex;
    private javax.swing.JComboBox tipoDoc;
    // End of variables declaration//GEN-END:variables
}
