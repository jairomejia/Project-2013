/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import doctor.consultar;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class nuevoPaciente extends javax.swing.JFrame {

   
    
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
        apellido2 = new javax.swing.JTextField();
        nombre1 = new javax.swing.JTextField();
        numId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        foto = new javax.swing.JButton();
        tipoDoc = new javax.swing.JComboBox();
        sex = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        apellido1 = new javax.swing.JTextField();
        fechadenaci = new javax.swing.JFormattedTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
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
        jTextField8 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        fechaafilia = new javax.swing.JFormattedTextField();

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
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Departamento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Municipio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        apellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido2KeyTyped(evt);
            }
        });
        jPanel1.add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 130, -1));

        nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre1KeyTyped(evt);
            }
        });
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, -1));

        numId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numIdActionPerformed(evt);
            }
        });
        numId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numIdKeyTyped(evt);
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

        nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre2KeyTyped(evt);
            }
        });
        jPanel1.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 130, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel16.setText("Primer apellido:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido1KeyTyped(evt);
            }
        });
        jPanel1.add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 130, -1));

        try {
            fechadenaci.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(fechadenaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 60, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Armenia", "Buenavista", "Calarcá", "Circasia", "Córdoba", "Filandia", "Génova", "La Tebaida", "Montenegro", "Pijao", "Quimbaya", "Salento" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quindio" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel18.setText("Grupo sanguineo:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-" }));
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 70, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel19.setText("Telefono:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 130, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel20.setText("Correo Electronico:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 130, -1));

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("Fecha afiliacion entidad:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 91, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("Regimen:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 142, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Estrato:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compensar EPS", "Famisanar LTDA", "Colmédica", "Humana Vivir", "Salud Coop", "Coomeva", "Cruz Blanca", "Saludvida", "Red Salud", "Salud Colpatria", "Salud Total", "Solsalud", "Sanitas", "Cafesalud", "SOS", "Golden Group S.A. EPS", "Unicajas", "Ecoopsos", "Caprecom", "Colsubsidio", "Salud Tota", "Solsalud", "Salud Condor" }));
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1: Bajo-bajo", "2: Bajo", "3: Medio-bajo", "4: Medio", "5: medio-Alto", "6: Alto" }));
        jPanel3.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Subcidiado", "Contributivo" }));
        jPanel3.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        try {
            fechaafilia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(fechaafilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 50, -1));

        javax.swing.GroupLayout datosPacienteLayout = new javax.swing.GroupLayout(datosPaciente);
        datosPaciente.setLayout(datosPacienteLayout);
        datosPacienteLayout.setHorizontalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPacienteLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPacienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        datosPacienteLayout.setVerticalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(datosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numIdActionPerformed

    //con esta obcion se sale del dormulario
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
      this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    //Esta obcion permitira ir a consultar un nuevo registro
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

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre1KeyTyped
       char car = evt.getKeyChar(); 
       if(nombre1.getText().length()>=20) evt.consume();
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
    )
{      
  evt.consume();   
}
    }//GEN-LAST:event_nombre1KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre2KeyTyped
    char car = evt.getKeyChar(); 
    if(nombre2.getText().length()>=20) evt.consume();
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
    )
{      
  evt.consume();   
}
    }//GEN-LAST:event_nombre2KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido1KeyTyped
      char car = evt.getKeyChar(); 
    if(apellido1.getText().length()>=20) evt.consume();
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
  )
{      
  evt.consume();   
}
    }//GEN-LAST:event_apellido1KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void apellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido2KeyTyped
        char car = evt.getKeyChar(); 
    if(apellido2.getText().length()>=20) evt.consume();
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
   )
{      
  evt.consume();   
}
    }//GEN-LAST:event_apellido2KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto 
    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
      if(correo.getText().length()>=20) evt.consume();
    }//GEN-LAST:event_correoKeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void numIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numIdKeyTyped
    char car = evt.getKeyChar();
if(numId.getText().length()>=15) evt.consume();
if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_numIdKeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
       char car = evt.getKeyChar();
if(telefono.getText().length()>=15) evt.consume();
if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_telefonoKeyTyped

    //esta accion limpiara los campos de texto si hay un error
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       numId.setText(null);
       nombre1.setText(null);
       nombre2.setText(null);
       apellido1.setText(null);
       apellido2.setText(null);
       telefono.setText(null);
       correo.setText(null);
       fechadenaci.setText(null);
       fechaafilia.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido1;
    private javax.swing.JTextField apellido2;
    private javax.swing.JTextField correo;
    private javax.swing.JPanel datosPaciente;
    private javax.swing.JFormattedTextField fechaafilia;
    private javax.swing.JFormattedTextField fechadenaci;
    private javax.swing.JButton foto;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
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
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JButton nuevaBusqueda;
    private javax.swing.JTextField numId;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox sex;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox tipoDoc;
    // End of variables declaration//GEN-END:variables
}
