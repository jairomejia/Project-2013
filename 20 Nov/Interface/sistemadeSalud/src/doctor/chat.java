/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

/**
 *
 * @author SENA
 */
public class chat extends javax.swing.JInternalFrame {

    /**
     * Creates new form chat
     */
    public chat() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        BotonPrivado = new javax.swing.JButton();
        ContenedorMenChat = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaConverChat = new javax.swing.JTextArea();
        LabelMensajeChat = new javax.swing.JLabel();
        BotonEnvioChat = new javax.swing.JButton();
        MensajeChat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        MiembrosChat = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Chat Sistema de Salud");

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonPrivado.setText("Privado");
        Contenedor.add(BotonPrivado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 84, -1));

        ContenedorMenChat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        AreaConverChat.setColumns(20);
        AreaConverChat.setLineWrap(true);
        AreaConverChat.setRows(5);
        AreaConverChat.setEnabled(false);
        jScrollPane1.setViewportView(AreaConverChat);

        javax.swing.GroupLayout ContenedorMenChatLayout = new javax.swing.GroupLayout(ContenedorMenChat);
        ContenedorMenChat.setLayout(ContenedorMenChatLayout);
        ContenedorMenChatLayout.setHorizontalGroup(
            ContenedorMenChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorMenChatLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ContenedorMenChatLayout.setVerticalGroup(
            ContenedorMenChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        );

        Contenedor.add(ContenedorMenChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 240));

        LabelMensajeChat.setText("Ingrese Mensaje a Enviar:");
        Contenedor.add(LabelMensajeChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        BotonEnvioChat.setText("Enviar");
        Contenedor.add(BotonEnvioChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));
        Contenedor.add(MensajeChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 260, -1));

        MiembrosChat.setColumns(20);
        MiembrosChat.setLineWrap(true);
        MiembrosChat.setRows(5);
        MiembrosChat.setEnabled(false);
        MiembrosChat.setPreferredSize(new java.awt.Dimension(164, 50));
        jScrollPane2.setViewportView(MiembrosChat);

        Contenedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 120, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaConverChat;
    private javax.swing.JButton BotonEnvioChat;
    private javax.swing.JButton BotonPrivado;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel ContenedorMenChat;
    private javax.swing.JLabel LabelMensajeChat;
    private javax.swing.JTextField MensajeChat;
    private javax.swing.JTextArea MiembrosChat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
