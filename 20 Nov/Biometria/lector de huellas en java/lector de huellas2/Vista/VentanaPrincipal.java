/*
 * VentanaPrincipal.java
 *
 * Created on 14 de febrero de 2007, 00:19
 */

package Vista;


import Controlador.ControladorVentanaPrincipal;
import Vista.Buscar;
import Vista.FormOptions;
import Modelo.Investigador;

import com.griaule.grfingerjava.FingerprintImage;
import javax.swing.*;

import com.griaule.grfingerjava.GrFingerJava;
import com.griaule.grfingerjava.GrFingerJavaException;
import com.griaule.grfingerjava.IFingerEventListener;
import com.griaule.grfingerjava.IImageEventListener;
import com.griaule.grfingerjava.IStatusEventListener;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import java.io.FileInputStream;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.imageio.spi.IIORegistry;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.spi.ImageReaderWriterSpi;
import sun.audio.*;

import javax.swing.BorderFactory;


/**
 *
 * @author  PC
 */
public class VentanaPrincipal extends javax.swing.JFrame implements IStatusEventListener, IImageEventListener,
                IFingerEventListener {

    private FormOptions pane = null;
    private ControladorVentanaPrincipal principal;

    private VentanaLogeados ventanaLogeados;


    private static String audioError = "C:/biometrico/error.wav"; //copiar a la carpeta


    /** Creates new form VentanaPrincipal */
    public VentanaPrincipal(ControladorVentanaPrincipal principal) {
        super();
        //this.util = principal;
        this.principal = principal;
        initComponents();
        this.setIconImage(new ImageIcon("c:/biometrico/lis.jpg").getImage());
        ventanaLogeados = new VentanaLogeados();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelDatos = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labelEvento = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuMenu = new javax.swing.JMenu();
        menuItemCargarFoto = new javax.swing.JMenuItem();
        menuItemDni = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        menuItemSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuOpciones = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuVersion = new javax.swing.JMenuItem();

        jScrollPane4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setToolTipText("");
        jScrollPane4.setAutoscrolls(true);
        jScrollPane4.setMaximumSize(new java.awt.Dimension(32767, 61));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(166, 140));
        jScrollPane4.setWheelScrollingEnabled(false);
        jTextArea10.setColumns(20);
        jTextArea10.setLineWrap(true);
        jTextArea10.setRows(5);
        jTextArea10.setPreferredSize(new java.awt.Dimension(164, 120));
        jTextArea10.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(jTextArea10);
        jTextArea10.getAccessibleContext().setAccessibleParent(jScrollPane4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISBioID");
        setBounds(new java.awt.Rectangle(0, 0, 515, 650));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(500, 550));
        setName("");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 220));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        //JPanel a = getPanelHuella();
        //a.setBackground(new Color(255,255,255));
        jPanel1.add(getPanelFoto());
        jPanel1.add(getPanelHuella());

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(166, 110));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(188, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(119, 90));
        jPanel3.setPreferredSize(new java.awt.Dimension(119, 30));
        jButton1.setText("Registrar Huella");
        jButton1.setEnabled(false);
        jButton1.setHideActionText(true);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.add(jButton1);

        jPanel2.add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel4.setLayout(new java.awt.GridLayout(3, 0));

        jPanel4.setMinimumSize(new java.awt.Dimension(69, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 130));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setMaximumSize(new java.awt.Dimension(2147483647, 70));
        labelNombre.setFont(new java.awt.Font("Arial", 1, 24));
        labelNombre.setText("ID:");
        jPanel6.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 50));

        jPanel4.add(jPanel6);

        jPanel7.setLayout(null);

        labelDatos.setFont(new java.awt.Font("Tahoma", 0, 18));
        labelDatos.setText("Dni:");
        jPanel7.add(labelDatos);
        labelDatos.setBounds(10, 0, 350, 40);

        jPanel4.add(jPanel7);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(100, 33));
        labelEvento.setFont(new java.awt.Font("Tahoma", 1, 18));
        labelEvento.setText("Evento:");
        labelEvento.setVerifyInputWhenFocusTarget(false);
        jPanel5.add(labelEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 30));

        jPanel4.add(jPanel5);

        jPanel2.add(jPanel4, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar2.setName("menuBar");
        menuMenu.setText("Principal");
        menuMenu.setPreferredSize(new java.awt.Dimension(50, 30));
        menuMenu.setRequestFocusEnabled(false);
        menuMenu.setRolloverEnabled(false);
        menuItemCargarFoto.setText("Cargar foto");
        menuItemCargarFoto.setEnabled(false);
        menuItemCargarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCargarFotoActionPerformed(evt);
            }
        });

        menuMenu.add(menuItemCargarFoto);

        menuItemDni.setText("Cargar usuario por DNI");
        menuItemDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDniActionPerformed(evt);
            }
        });

        menuMenu.add(menuItemDni);

        menuMenu.add(jSeparator1);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });

        menuMenu.add(menuItemSalir);

        jMenuBar2.add(menuMenu);

        jMenu3.setText("Investigadores");
        jMenuItem1.setText("Asistencias");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Listado de Investigadores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });

        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Opciones");
        menuOpciones.setText("Parametros");
        menuOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpcionesActionPerformed(evt);
            }
        });

        jMenu1.add(menuOpciones);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Ayuda");
        menuVersion.setText("Version");
        menuVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVersionActionPerformed(evt);
            }
        });

        jMenu2.add(menuVersion);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);
        jMenuBar2.getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ListadoInvestigador linv = new ListadoInvestigador();
        linv.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ventanaLogeados.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuItemDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDniActionPerformed
        String dni = JOptionPane.showInputDialog(this, "Ingrese el DNI del Investigador?",
                "N�mero de Documento", JOptionPane.QUESTION_MESSAGE);
        if(dni.compareTo("") == 0)
            return;
        try{
            Integer.parseInt(dni);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Formato invalido de DNI.\nEl dni debe contener solamente n�meros", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            principal.cargarInvestigadorDni(dni);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "DNI o C�digo no encontrado en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, "Error sql al buscar un investigador en la BD\n" + se.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.reconocer();


    }//GEN-LAST:event_menuItemDniActionPerformed

    public void reconocer(){
    //extrae el template y muestra la huela
        this.procesarHuella();

        if(principal.identify()){
            //si identifica registra la accion
            try{
                principal.doAccion();
                actualizarUI();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error sql al marcar la entrada/salida\n" + e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }
        else{
            writeLog("Huella NO identificada!!!");
            showDatos(); //muestra los datos "no identificado" y se mantiene la huella ingresada
            disableFoto();
        }
        showFoto();

    }


    // esta funcion procesa una huella
    private void procesarHuella() {
            // muestra la huella en la interfaz, prematuramente....
            //VER SI ES NECESARIA; PROBAR SACARLA
            showHuella();

            //extrayendo el template automaticamente de la huella (this.fingerprint)
            try{
                String msg = principal.extract();
                writeLog(msg);
            } catch(SQLException e){
                 JOptionPane.showMessageDialog(this, "Error al extraer la huella del investigador de la base de datos", "Error de base de datos", JOptionPane.ERROR_MESSAGE);
                 return;
            }


            // ya tenemos la huella digital
            //habilita los botones, ya que hay huella
            enableRegistrarHuella();
            try{
                //muestra minutiaes/segmentos/directiones en la imagen
                principal.setHuellaTemplate( GrFingerJava.getBiometricImage(principal.getTemplate(), principal.getFingerPrint()) );
            }catch(GrFingerJavaException e){}

            showHuella();

    }


    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
            try{
                principal.stop();
            }catch(GrFingerJavaException e){ //agarra algun error de las librerias al cerrar
                this.writeLog(e.getMessage());
            }
            System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
                principal.stop();
            }catch(GrFingerJavaException e){ //agarra algun error de las librerias al cerrar
                this.writeLog(e.getMessage());
            }
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Investigador inv = principal.getInvestigador();
        if(inv != null ){
            JOptionPane.showMessageDialog(this, "Esta huella ya esta enrolada al usuario " + inv.getApellido() + ", " + inv.getNombre() + ".\nSi asigna esta huella nuevamente estos datos se perder�n", "Huella enrolada", JOptionPane.WARNING_MESSAGE );
        }
        Buscar ventanaBuscar = new Buscar(principal);
        ventanaBuscar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    //muestra la version
    private void menuVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVersionActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Identificacion Biometrica version " +  principal.getMajorVersion() + " por Martin Farias.\nReportar errores a eltuza+lisbioid@gmail.com\n\n\nLaboratorio de Investigaci�n de Software.\nUniversidad Tecnol�gica Nacional \nFacultad Regional C�rdoba.\n", "LISBioID version " + principal.getMajorVersion()  ,JOptionPane.PLAIN_MESSAGE,  new ImageIcon("c:/biometrico/lisbioid.png"));
    }//GEN-LAST:event_menuVersionActionPerformed

    //opciones de configuracion, al vicio
    private void menuOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesActionPerformed
                   if (pane == null)
                        pane = new FormOptions();
                   JOptionPane.showMessageDialog(this, "Los parametros por defecto le garantizan un correcto funcionamiento de LISBioID.\nSi no esta seguro de los cambios que desea realizar, consulte la documentaci�n.\n\nSi modifica esto valores, la aplicacion podr�a funcionar inapropiadamente", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                        pane.saveState();

                                        pane.setIdentifyThreshold(principal.getIdentifyThreshold());
                                        pane.setIdentifyRotationTolerance(principal
                                                        .getIdentifyRotationTolerance());
                                        pane.setVerifyThreshold(principal.getVerifyThreshold());
                                        pane.setVerifyRotationTolorance(principal
                                                        .getVerifyRotationTolerance());

                                        JDialog dialog = pane.createDialog(rootPane, "Options");

                                        dialog.setVisible(true);
                                        dialog.dispose();

                                        if ((pane.getValue() != null)
                                                        && ((Integer) pane.getValue()).intValue() == JOptionPane.OK_OPTION) {
                                                try {
                                                        principal.setParemeters(pane.getIdentifyThreshold(),
                                                                        pane.getIdentifyRotationTolerance(), pane
                                                                                        .getVerifyThreshold(), pane
                                                                                        .getVerifyRotationTolorance());

                                                        Color minutiaeColor;
                                                        Color minutiaeMatchColor;
                                                        Color segmentColor;
                                                        Color segmentMatchColor;
                                                        Color directionColor;
                                                        Color directionMatchColor;

                                                        if (pane.mustShowMinutiae())
                                                                minutiaeColor = pane.getMinutiaeColor();
                                                        else
                                                                minutiaeColor = GrFingerJava.TRANSPARENT_COLOR;

                                                        if (pane.mustShowMinutiaeMatch())
                                                                minutiaeMatchColor = pane
                                                                                .getMinutiaeMatchColor();
                                                        else
                                                                minutiaeMatchColor = GrFingerJava.TRANSPARENT_COLOR;

                                                        if (pane.mustShowSegment())
                                                                segmentColor = pane.getSegmentColor();
                                                        else
                                                                segmentColor = GrFingerJava.TRANSPARENT_COLOR;

                                                        if (pane.mustShowSegmentMatch())
                                                                segmentMatchColor = pane.getSegmentMatchColor();
                                                        else
                                                                segmentMatchColor = GrFingerJava.TRANSPARENT_COLOR;

                                                        if (pane.mustShowDirection())
                                                                directionColor = pane.getDirectionColor();
                                                        else
                                                                directionColor = GrFingerJava.TRANSPARENT_COLOR;

                                                        if (pane.mustShowDirectionMatch())
                                                                directionMatchColor = pane
                                                                                .getDirectionMatchColor();
                                                        else
                                                                directionMatchColor = GrFingerJava.TRANSPARENT_COLOR;

                                                        principal.setBiometricDisplayColors(minutiaeColor,
                                                                        minutiaeMatchColor, segmentColor,
                                                                        segmentMatchColor, directionColor,
                                                                        directionMatchColor);

                                                } catch (NumberFormatException e1) {
                                                        JOptionPane.showMessageDialog(rootPane,
                                                                        "Invalid values.", "Error",
                                                                        JOptionPane.ERROR_MESSAGE);
                                                }
                                        } else {
                                                pane.restoreState();
                                        }

    }//GEN-LAST:event_menuOpcionesActionPerformed

    private void menuItemCargarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCargarFotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        Iterator iter = IIORegistry.getDefaultInstance().getServiceProviders(ImageReaderSpi.class, false);
        while (iter.hasNext()) {
                fileChooser.setFileFilter(new ImageFileFilter((ImageReaderSpi) iter.next()));
        }
        if (fileChooser.showOpenDialog(rootPane) == JFileChooser.APPROVE_OPTION) {
            try {
                ImageReaderSpi spi = (ImageReaderSpi) ((ImageFileFilter) fileChooser.getFileFilter()).getSpi();
                principal.cargarFotoDesdeMenu(fileChooser.getSelectedFile(), spi);
                //(!) actualizar pa que no floodee con imgs grandes
//                if(!principal.cargarFotoDesdeMenu(fileChooser.getSelectedFile(), spi)){
//                    JOptionPane.showMessageDialog(this, "La Imagen no debe superar los 100KB.", "Error", JOptionPane.ERROR_MESSAGE);
//                    return;
//                }


                showFoto();
            }  catch (IOException e) {
                // write error to log
                writeLog(e.toString());
            } catch (IllegalArgumentException e) {
                // write error to log
                writeLog(e.toString());
            }catch (Exception e) {
                writeLog(e.toString());
            }
        }
    }//GEN-LAST:event_menuItemCargarFotoActionPerformed

    private JPanel getPanelFoto() {
        if (panelFoto == null) {
            panelFoto = new javax.swing.JPanel(){
                private static final long serialVersionUID = 2L;
                @Override
                public void paint(Graphics arg0) {
                    super.paint(arg0);
                    try{
                        Image foto = (Image) principal.getFoto();
                        foto = foto.getScaledInstance(this.getWidth(), -1, Image.SCALE_FAST);

                        arg0.drawImage(foto, 0, 0, panelFoto.getWidth(), panelFoto.getHeight(), null);
                            //arg0.drawImage(foto, insets.left, insets.top, this);
                    }catch(Exception e){
                        e.printStackTrace();
                        arg0.drawString("No hay fotograf�a", panelHuella.getWidth()/2 - 55, panelHuella.getHeight()/2-10 );
                    }
                }
            };
            panelFoto.setBorder(BorderFactory.createLoweredBevelBorder());
        }
        return panelFoto;
    }

    private JPanel getPanelHuella() {
        if (panelHuella == null) {
            panelHuella = new JPanel() {
                private static final long serialVersionUID = 1L;
                @Override
                public void paint(Graphics arg0) {
                    super.paint(arg0);
                    if (principal.getHuella() != null) {
                        if(principal.getHuellaTemplate() != null)
                            arg0.drawImage(principal.getHuellaTemplate(), 0, 0, panelHuella.getWidth(), panelHuella.getHeight(), null);
                        else
                            arg0.drawImage(principal.getHuella(), 0, 0, panelHuella.getWidth(), panelHuella.getHeight(), null);

                        //estas lineas borran el "Unregistered Version" de la huella
                        // por ende, nos da la licencia FULL a la manera argentina
                        arg0.setColor(new Color(255,255,255));
                        arg0.fillRect(0 , 0 , panelHuella.getWidth() , 14);
                    }
                    else{
                        //arg0.setColor(new Color(204,204,204));
                        //arg0.fillRect(0,0, panelHuella.getWidth(), panelHuella.getHeight());
                        arg0.drawString("No hay huella", panelHuella.getWidth()/2 - 40, panelHuella.getHeight()/2-10 );
                    }
                }
            };
            panelHuella.setBorder(BorderFactory.createLoweredBevelBorder());
        }
        return panelHuella;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelEvento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JMenuItem menuItemCargarFoto;
    private javax.swing.JMenuItem menuItemDni;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JMenu menuMenu;
    private javax.swing.JMenuItem menuOpciones;
    private javax.swing.JMenuItem menuVersion;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JPanel panelFoto;
    private javax.swing.JPanel panelHuella;


    public void showHuella() {
        panelHuella.repaint();
    }
    public void showFoto() {
        panelFoto.repaint();
    }

    //muestra los datos por los labels...bulugaro
    public void showDatos(){
       if(principal.getInvestigador() == null){
           playAudio(audioError);
           labelNombre.setText("ID: NO IDENTIFICADO");
           labelNombre.setForeground(new Color(255,0,0));
           labelDatos.setText("Dni: NO IDENTIFICADO");
           labelDatos.setForeground(new Color(255,0,0));
           labelEvento.setText("");
           return;
       }
       //otherwise carga el investigador
       labelNombre.setText("ID: " + principal.getInvestigador().getApellido() + ", " + principal.getInvestigador().getNombre() );
       labelDatos.setText("Dni: " + String.valueOf(principal.getInvestigador().getDni()));
       labelNombre.setForeground(new Color(0,0,0));
       labelDatos.setForeground(new Color(0,0,0));
       boolean evt = principal.getInvestigador().getEstado();

       if(evt){
           labelEvento.setForeground(new Color(0,0,255));
           labelEvento.setText("ENTRADA al LIS a las " + ControladorVentanaPrincipal.getHora(principal.getInvestigador().getHoraEntrada()) + ".");
       }
       else{
           labelEvento.setForeground(new Color(255,0,0));
           labelEvento.setText("SALIDA del LIS a las " + ControladorVentanaPrincipal.getHora(principal.getInvestigador().getHoraSalida()) + ".");
       }
    }



    public void actualizarUI(){

        showFoto();
        showDatos();
        enableFoto();

        // muestra la huella con minutiaes, segmentos y sus direcciones display matching
        //q se le pasa desde la clase main, en base al template, huella y matchingContext
        showHuella();

        if(principal.getInvestigador().getEstado()){
            //si la accion es la entrada
            ventanaLogeados.insertarFila(principal.getInvestigador());
        }
        else {
            //si la accion es la salida
            ventanaLogeados.borrarFilaXDni(String.valueOf(principal.getInvestigador().getDni()));
        }
    }
    public void playAudio(String archivo){
        AudioPlayer p= AudioPlayer.player;
        AudioStream as;
        try
        {
            as =new AudioStream(new FileInputStream(archivo));
            p.start(as);
        } catch(IOException e){writeLog("Error al reproducir audio");}
    }

    public void writeLog(String text) {
                jTextArea1.append(text + "\n");
                Runnable autoscroll = new Runnable() {
                    public void run() {
                        JScrollBar vbar = jScrollPane1.getVerticalScrollBar();
                        vbar.setValue(vbar.getMaximum());
                    }
                };
                SwingUtilities.invokeLater(autoscroll);
        }

        //clase para el filtro de imagenes al seleccionar foto
        class ImageFileFilter extends FileFilter {

                private ImageReaderWriterSpi spi;

                private String[] suffixes;

                ImageFileFilter(ImageReaderWriterSpi spi) {
                        this.spi = spi;
                        suffixes = spi.getFileSuffixes();
                }

                public boolean accept(File f) {
                        if (f.isDirectory())
                                return true;
                        String fileName = f.getName();
                        int i = fileName.lastIndexOf('.');
                        String suffix = fileName.substring(i + 1);
                        for (i = 0; i < suffixes.length; i++)
                                if (suffix.equalsIgnoreCase(suffixes[i]))
                                        return true;
                        return false;

                }

                public String getDescription() {
                        StringBuffer buffer = new StringBuffer();
                        int i;
                        buffer.append(spi.getDescription(Locale.getDefault()));
                        buffer.append(" (");
                        for (i = 0; i < suffixes.length; i++) {
                                if (i != 0)
                                        buffer.append(", ");
                                buffer.append("*.");
                                buffer.append(suffixes[i]);
                        }
                        buffer.append(")");
                        return buffer.toString();
                }

                /**
                 * @return Returns the spi.
                 */
                public ImageReaderWriterSpi getSpi() {
                        return spi;
                }
        }

        public BufferedImage getFoto(){
            try{
                return principal.getInvestigador().getFoto();
            }catch(SQLException e){return null;}

        }

        public void enableFoto() {
            menuItemCargarFoto.setEnabled(true);
        }
        public void disableFoto(){
            menuItemCargarFoto.setEnabled(false);
        }


        public void enableRegistrarHuella() {
                jButton1.setEnabled(true);
        }

        // Se llama cuando se detecta un dedo en el sensor
    public void onFingerDown(String idSensor) {
        writeLog("Dedo apollado"); // en el sensor " + idSensor );
    }

    // Se llama cuando se remueve un dedo del sensor
    public void onFingerUp(String idSensor) {
        writeLog("Dedo retirado "); //del sensor " + idSensor);
    }

    // Se llama cada vez que un lector es enchufado
    public void onSensorPlug(String idSensor) {
        writeLog("Sensor " + idSensor + " conectado.");
        try {
                // Empieza a capturar desde el sensor
                GrFingerJava.startCapture(idSensor, this, this);
        } catch (GrFingerJavaException e) {
                // error to log
                writeLog(e.toString());
        }

    }

    // Se llama cuando el sensor es desenchufado.
    public void onSensorUnplug(String idSensor) {
        writeLog("Sensor " + idSensor + " desconectado.");
        try {
                //Deja de capturar de el sensor.
                GrFingerJava.stopCapture(idSensor);
        } catch (GrFingerJavaException e) {
                // error to log
                writeLog(e.toString());
        }
    }

    // Se llama cuando una imagen se adquiere del sensor
    public void onImageAcquired(String idSensor, FingerprintImage fingerprint) {
        // se reporta que ocurrio un evento con una imagen
        writeLog("Huella capturada "); //en el sensor " + idSensor);
        principal.setHuella(fingerprint);

        reconocer();
    }
}