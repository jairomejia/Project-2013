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
        PanelDatosPaciente = new javax.swing.JPanel();
        Foto = new javax.swing.JLabel();
        LabelTipId = new javax.swing.JLabel();
        LabelNom1 = new javax.swing.JLabel();
        LabelNumId = new javax.swing.JLabel();
        LabelApe2 = new javax.swing.JLabel();
        LabelFechaNa = new javax.swing.JLabel();
        LabelDepto = new javax.swing.JLabel();
        LabelMuni = new javax.swing.JLabel();
        Apellido2 = new javax.swing.JTextField();
        Nombre1 = new javax.swing.JTextField();
        NumeroId = new javax.swing.JTextField();
        LabelTitulo = new javax.swing.JLabel();
        LabelSexo = new javax.swing.JLabel();
        BotonFoto = new javax.swing.JButton();
        TipoDoc = new javax.swing.JComboBox();
        Sexo = new javax.swing.JComboBox();
        LabelNom2 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JTextField();
        LabelApe1 = new javax.swing.JLabel();
        Apellido1 = new javax.swing.JTextField();
        Municipio = new javax.swing.JComboBox();
        Departamento = new javax.swing.JComboBox();
        LabelGrupSang = new javax.swing.JLabel();
        GrupoSanguineo = new javax.swing.JComboBox();
        LabelTel = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        LabelCorreo = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        FechaNacimiento = new com.toedter.calendar.JDateChooser();
        PanelBotonesAccion = new javax.swing.JPanel();
        BotonNuevaBusqueda = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        PanelDatosAfiliacion = new javax.swing.JPanel();
        LabelEstado = new javax.swing.JLabel();
        LabelTipoAfilia = new javax.swing.JLabel();
        LabelEntidad = new javax.swing.JLabel();
        LabelFechaAfilia = new javax.swing.JLabel();
        LabelRegimen = new javax.swing.JLabel();
        Estado = new javax.swing.JComboBox();
        LabelEstrato = new javax.swing.JLabel();
        Entidad = new javax.swing.JComboBox();
        Estrato = new javax.swing.JComboBox();
        Regimen = new javax.swing.JComboBox();
        FechaAfilia = new com.toedter.calendar.JDateChooser();
        TipoAfiliado = new javax.swing.JComboBox();

        setTitle("Sistema Integrado de salud");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDatosPaciente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Paciente"));
        PanelDatosPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Places-user-identity-icon.png"))); // NOI18N
        Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelDatosPaciente.add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 136));

        LabelTipId.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelTipId.setText("Tipo de identificación:");
        PanelDatosPaciente.add(LabelTipId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        LabelNom1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelNom1.setText("Primer Nombre:");
        PanelDatosPaciente.add(LabelNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        LabelNumId.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelNumId.setText("Número de ID:");
        PanelDatosPaciente.add(LabelNumId, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        LabelApe2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelApe2.setText("Segundo Apellido:");
        PanelDatosPaciente.add(LabelApe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        LabelFechaNa.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelFechaNa.setText("Fecha de Nacimiento:");
        PanelDatosPaciente.add(LabelFechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        LabelDepto.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelDepto.setText("Departamento:");
        PanelDatosPaciente.add(LabelDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        LabelMuni.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelMuni.setText("Municipio:");
        PanelDatosPaciente.add(LabelMuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        Apellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido2KeyTyped(evt);
            }
        });
        PanelDatosPaciente.add(Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 130, -1));

        Nombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre1KeyTyped(evt);
            }
        });
        PanelDatosPaciente.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 130, -1));

        NumeroId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroIdActionPerformed(evt);
            }
        });
        NumeroId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroIdKeyTyped(evt);
            }
        });
        PanelDatosPaciente.add(NumeroId, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 130, -1));

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelTitulo.setText("Información basica del afiliado");
        PanelDatosPaciente.add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        LabelSexo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelSexo.setText("Sexo:");
        PanelDatosPaciente.add(LabelSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        BotonFoto.setText("Foto");
        BotonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFotoActionPerformed(evt);
            }
        });
        PanelDatosPaciente.add(BotonFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        TipoDoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cédula de Ciudadania", "Tarjeta de Identidad", "Cedula de Extrangeria", "Pasaporte", "Registro Civil", "N° Unico de Id. Personal", "Adulto sin Identificación", "Menor sin Identificación" }));
        TipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDocActionPerformed(evt);
            }
        });
        PanelDatosPaciente.add(TipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 160, -1));

        Sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        PanelDatosPaciente.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        LabelNom2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelNom2.setText("Segundo Nombre:");
        PanelDatosPaciente.add(LabelNom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        Nombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre2KeyTyped(evt);
            }
        });
        PanelDatosPaciente.add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 140, 130, -1));

        LabelApe1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelApe1.setText("Primer Apellido:");
        PanelDatosPaciente.add(LabelApe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        Apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido1KeyTyped(evt);
            }
        });
        PanelDatosPaciente.add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 130, -1));

        Municipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Armenia", "Buenavista", "Calarcá", "Circasia", "Córdoba", "Filandia", "Génova", "La Tebaida", "Montenegro", "Pijao", "Quimbaya", "Salento" }));
        PanelDatosPaciente.add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        Departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quindío" }));
        PanelDatosPaciente.add(Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        LabelGrupSang.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelGrupSang.setText("Grupo Sanguineo:");
        PanelDatosPaciente.add(LabelGrupSang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        GrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AB+", "AB-", "A+", "A-", "B+", "B-", "O+", "O-" }));
        PanelDatosPaciente.add(GrupoSanguineo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 70, -1));

        LabelTel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelTel.setText("Teléfono:");
        PanelDatosPaciente.add(LabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });
        PanelDatosPaciente.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 130, -1));

        LabelCorreo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelCorreo.setText("Correo Electrónico:");
        PanelDatosPaciente.add(LabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CorreoKeyTyped(evt);
            }
        });
        PanelDatosPaciente.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 140, -1));
        PanelDatosPaciente.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 130, -1));

        BotonNuevaBusqueda.setText("Nuevo registro");
        BotonNuevaBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevaBusquedaActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonGuardar.setText("Guardar");

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBotonesAccionLayout = new javax.swing.GroupLayout(PanelBotonesAccion);
        PanelBotonesAccion.setLayout(PanelBotonesAccionLayout);
        PanelBotonesAccionLayout.setHorizontalGroup(
            PanelBotonesAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesAccionLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(BotonNuevaBusqueda)
                .addGap(63, 63, 63)
                .addComponent(BotonGuardar)
                .addGap(61, 61, 61)
                .addComponent(BotonLimpiar)
                .addGap(46, 46, 46)
                .addComponent(BotonSalir)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        PanelBotonesAccionLayout.setVerticalGroup(
            PanelBotonesAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBotonesAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBotonesAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevaBusqueda)
                    .addComponent(BotonSalir)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelDatosAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Afiliación"));
        PanelDatosAfiliacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelEstado.setText("Estado:");
        PanelDatosAfiliacion.add(LabelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 53, -1, -1));

        LabelTipoAfilia.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelTipoAfilia.setText("Tipo Afiliado:");
        PanelDatosAfiliacion.add(LabelTipoAfilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        LabelEntidad.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelEntidad.setText("Entidad:");
        PanelDatosAfiliacion.add(LabelEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        LabelFechaAfilia.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelFechaAfilia.setText("Fecha Afiliacion Entidad:");
        PanelDatosAfiliacion.add(LabelFechaAfilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        LabelRegimen.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelRegimen.setText("Régimen:");
        PanelDatosAfiliacion.add(LabelRegimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        Estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
        PanelDatosAfiliacion.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        LabelEstrato.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        LabelEstrato.setText("Estrato:");
        PanelDatosAfiliacion.add(LabelEstrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        Entidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Compensar EPS", "Famisanar LTDA", "Colmédica", "Humana Vivir", "Salud Coop", "Coomeva", "Cruz Blanca", "Saludvida", "Red Salud", "Salud Colpatria", "Salud Total", "Solsalud", "Sanitas", "Cafesalud", "SOS", "Golden Group S.A. EPS", "Unicajas", "Ecoopsos", "Caprecom", "Colsubsidio", "Salud Tota", "Solsalud", "Salud Condor" }));
        PanelDatosAfiliacion.add(Entidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        Estrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1: Bajo-bajo", "2: Bajo", "3: Medio-bajo", "4: Medio", "5: medio-Alto", "6: Alto" }));
        PanelDatosAfiliacion.add(Estrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        Regimen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Subsidiado", "Contributivo" }));
        PanelDatosAfiliacion.add(Regimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));
        PanelDatosAfiliacion.add(FechaAfilia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 130, -1));

        TipoAfiliado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ADOLESCENTE DESVINCULADO DE GRUPOS ARMADOS ORGANIZ", "ADOLESCENTE EN CONFLICTO CON LA LEY PENAL", "ADOLESCENTE TRABAJADOR", "AFROCOLOMBIANOS DESPLAZADOS POR LA VIOLENCIA", "AFROCOLOMBIANOS DESPLAZADOS POR LA VIOLENCIA CABEZ", "ARTESANOS", "DESPLAZADOS DISCAPACITADOS", "DESPLAZADOS POR FENOMENOS NATURALES", "DESPLAZADOS POR FENÓMENOS NATURALES CABEZA DE FAMI", "DESPLAZADOS POR LA VIOLENCIA", "DESPLAZADOS POR LA VIOLENCIA CABEZA DE FAMILIA", "DISCAPACITADO COGNITIVO", "DISCAPACITADO COGNITIVO O MENTAL", "DISCAPACITADO LIMITACION AUDITIVA O SORDA", "DISCAPACITADO LIMITACION FISICA O MOTORA", "DISCAPACITADO LIMITACION VISUAL O CIEGA", "DISCAPACITADO MENTAL", "DISCAPACITADOS", "EMPRENDEDORES", "INDIGENAS", "INDÍGENAS DESPLAZADOS POR LA VIOLENCIA", "INDÍGENAS DESPLAZADOS POR LA VIOLENCIA CABEZA DE F", "INPEC", "JOVENES VULNERABLES", "LIDERES DEL DESARROLLO", "MICROEMPRESAS", "MUJER CABEZA DE FAMILIA", "NEGRITUDES", "REINSERTADOS", "REMITIDOS POR EL CIE", "REMITIDOS POR EL PAL", "SOBREVIVIENTES MINAS ANTIPERSONALES", "SOLDADOS CAMPESINOS", "TERCERA EDAD", "NINGUNA" }));
        PanelDatosAfiliacion.add(TipoAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        javax.swing.GroupLayout datosPacienteLayout = new javax.swing.GroupLayout(datosPaciente);
        datosPaciente.setLayout(datosPacienteLayout);
        datosPacienteLayout.setHorizontalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDatosAfiliacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDatosPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosPacienteLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(PanelBotonesAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        datosPacienteLayout.setVerticalGroup(
            datosPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDatosPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatosAfiliacion, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelBotonesAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(datosPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NumeroIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroIdActionPerformed
        
    }//GEN-LAST:event_NumeroIdActionPerformed

    //con esta opcion se sale del dormulario
    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
      this.dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    //Esta obcion permitira ir a consultar un nuevo registro
    private void BotonNuevaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevaBusquedaActionPerformed
     this.dispose();
    consultar con = new consultar();
    con.setVisible(true);
       
    }//GEN-LAST:event_BotonNuevaBusquedaActionPerformed

    
    //Aqui se subira la foto para ser guardada en la bvase de datos
    private void BotonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFotoActionPerformed
      
        JFileChooser img = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "gif","png"); 
        img.setFileFilter(filtro); 
        img.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        int option = img.showOpenDialog(this);
        
        if(option==JFileChooser.APPROVE_OPTION){
        
            String fil = img.getSelectedFile().getPath();
            
            String file = img.getSelectedFile().toString();
            
            Foto.setIcon(new ImageIcon(fil));
            
            ImageIcon icon = new ImageIcon(fil);
            
            Image im = icon.getImage();
            
            Image newimg = im.getScaledInstance(130, 130, java.awt.Image.SCALE_SMOOTH);
            
            ImageIcon newicon = new ImageIcon(newimg);
            
            Foto.setIcon(newicon);
            Foto.setSize(130,130);
            
//            rutaimagen = "";  
        }
        
    }//GEN-LAST:event_BotonFotoActionPerformed

    private void TipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoDocActionPerformed

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void Nombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre1KeyTyped
       char car = evt.getKeyChar(); 
       if(Nombre1.getText().length()>=20) evt.consume();
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
    }//GEN-LAST:event_Nombre1KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void Nombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre2KeyTyped
    char car = evt.getKeyChar(); 
    if(Nombre2.getText().length()>=20) evt.consume();
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
    }//GEN-LAST:event_Nombre2KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void Apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido1KeyTyped
      char car = evt.getKeyChar(); 
    if(Apellido1.getText().length()>=20) evt.consume();
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
    }//GEN-LAST:event_Apellido1KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void Apellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido2KeyTyped
        char car = evt.getKeyChar(); 
    if(Apellido2.getText().length()>=20) evt.consume();
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
    }//GEN-LAST:event_Apellido2KeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto 
    private void CorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorreoKeyTyped
      if(Correo.getText().length()>=20) evt.consume();
    }//GEN-LAST:event_CorreoKeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void NumeroIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroIdKeyTyped
    char car = evt.getKeyChar();
if(NumeroId.getText().length()>=15) evt.consume();
if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_NumeroIdKeyTyped

    //aqui se limita el numero de caracteres que ingresan al campo de texto y el tipo
    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
       char car = evt.getKeyChar();
if(Telefono.getText().length()>=15) evt.consume();
if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_TelefonoKeyTyped

    //esta accion limpiara los campos de texto si hay un error
    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
       NumeroId.setText(null);
       Nombre1.setText(null);
       Nombre2.setText(null);
       Apellido1.setText(null);
       Apellido2.setText(null);
       Telefono.setText(null);
       Correo.setText(null);
      
    }//GEN-LAST:event_BotonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido1;
    private javax.swing.JTextField Apellido2;
    private javax.swing.JButton BotonFoto;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JButton BotonNuevaBusqueda;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JTextField Correo;
    private javax.swing.JComboBox Departamento;
    private javax.swing.JComboBox Entidad;
    private javax.swing.JComboBox Estado;
    private javax.swing.JComboBox Estrato;
    private com.toedter.calendar.JDateChooser FechaAfilia;
    private com.toedter.calendar.JDateChooser FechaNacimiento;
    private javax.swing.JLabel Foto;
    private javax.swing.JComboBox GrupoSanguineo;
    private javax.swing.JLabel LabelApe1;
    private javax.swing.JLabel LabelApe2;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelDepto;
    private javax.swing.JLabel LabelEntidad;
    private javax.swing.JLabel LabelEstado;
    private javax.swing.JLabel LabelEstrato;
    private javax.swing.JLabel LabelFechaAfilia;
    private javax.swing.JLabel LabelFechaNa;
    private javax.swing.JLabel LabelGrupSang;
    private javax.swing.JLabel LabelMuni;
    private javax.swing.JLabel LabelNom1;
    private javax.swing.JLabel LabelNom2;
    private javax.swing.JLabel LabelNumId;
    private javax.swing.JLabel LabelRegimen;
    private javax.swing.JLabel LabelSexo;
    private javax.swing.JLabel LabelTel;
    private javax.swing.JLabel LabelTipId;
    private javax.swing.JLabel LabelTipoAfilia;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JComboBox Municipio;
    private javax.swing.JTextField Nombre1;
    private javax.swing.JTextField Nombre2;
    private javax.swing.JTextField NumeroId;
    private javax.swing.JPanel PanelBotonesAccion;
    private javax.swing.JPanel PanelDatosAfiliacion;
    private javax.swing.JPanel PanelDatosPaciente;
    private javax.swing.JComboBox Regimen;
    private javax.swing.JComboBox Sexo;
    private javax.swing.JTextField Telefono;
    private javax.swing.JComboBox TipoAfiliado;
    private javax.swing.JComboBox TipoDoc;
    private javax.swing.JPanel datosPaciente;
    // End of variables declaration//GEN-END:variables
}
