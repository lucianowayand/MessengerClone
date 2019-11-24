
package trabalhofinal;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class principal extends javax.swing.JFrame implements ObservadorDeMensagem{
    Timestamp ts = new Timestamp(new Date().getTime());
    public principal() {

        initComponents();
        Servidor.getInstance().setObservadorDeMensagem(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chat = new javax.swing.JPanel();
        topInfo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nomeDestino = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeDestino1 = new javax.swing.JLabel();
        chatBoxx = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatBox = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        campoMensagem = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuariosOnline = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MSN");
        getContentPane().setLayout(new java.awt.CardLayout(23, 23));

        chat.setLayout(new java.awt.BorderLayout(10, 10));

        topInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        topInfo.setEnabled(false);
        topInfo.setLayout(new java.awt.GridLayout(3, 1, 10, 5));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome de usuário: ");
        jPanel1.add(jLabel1);

        nomeUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(nomeUsuario);

        topInfo.add(jPanel1);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Destinatario:");
        jLabel2.setEnabled(false);
        jPanel3.add(jLabel2);

        nomeDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(nomeDestino);
        jPanel3.add(jDesktopPane1);

        topInfo.add(jPanel3);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Status:");
        jLabel3.setEnabled(false);
        jPanel4.add(jLabel3);

        nomeDestino1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(nomeDestino1);

        topInfo.add(jPanel4);

        chat.add(topInfo, java.awt.BorderLayout.NORTH);

        chatBoxx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chatBoxx.setEnabled(false);
        chatBoxx.setLayout(new java.awt.BorderLayout(0, 10));

        chatBox.setEditable(false);
        chatBox.setColumns(20);
        chatBox.setRows(5);
        chatBox.setEnabled(false);
        chatBox.setFocusable(false);
        jScrollPane1.setViewportView(chatBox);

        chatBoxx.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setMinimumSize(new java.awt.Dimension(79, 30));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        campoMensagem.setEnabled(false);
        campoMensagem.setPreferredSize(new java.awt.Dimension(10, 20));
        campoMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMensagemActionPerformed(evt);
            }
        });
        jPanel2.add(campoMensagem);

        botaoEnviar.setText("Enviar");
        botaoEnviar.setEnabled(false);
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoEnviar);

        chatBoxx.add(jPanel2, java.awt.BorderLayout.SOUTH);

        chat.add(chatBoxx, java.awt.BorderLayout.CENTER);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Usuários online", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        usuariosOnline.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        usuariosOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariosOnlineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usuariosOnlineMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosOnlineMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(usuariosOnline);

        chat.add(jScrollPane2, java.awt.BorderLayout.WEST);

        getContentPane().add(chat, "card2");

        jMenu1.setText("Usuário");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosOnlineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosOnlineMousePressed

    }//GEN-LAST:event_usuariosOnlineMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        login ab = new login();
        ab.setLocationRelativeTo(null);
        ab.setVisible(true);
        Servidor.getInstance().interrupt();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        if (!campoMensagem.getText().equals("")){
            String a = campoMensagem.getText();
            ts.setTime(new Date().getTime());
            chatBox.append("["+ts.toString().substring(11, 16)+"] "+nomeUsuario.getText()+"->"+a+"\n");
            chatBox.setCaretPosition(chatBox.getText().length());
            try {
                Servidor.getInstance().enviarMensagemPara(usuariosOnline.getSelectedValue(), a);
                campoMensagem.setText("");
            } catch (IOException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            campoMensagem.grabFocus();
        }
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void campoMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMensagemActionPerformed
            botaoEnviarActionPerformed(evt);
    }//GEN-LAST:event_campoMensagemActionPerformed

    private void usuariosOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosOnlineMouseClicked

    }//GEN-LAST:event_usuariosOnlineMouseClicked

    private void usuariosOnlineMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosOnlineMouseReleased
        if (!usuariosOnline.isSelectionEmpty()) {
            String nomeDestino = usuariosOnline.getSelectedValue();
            this.nomeDestino.setText(nomeDestino);
            ativar(true);
        }
    }//GEN-LAST:event_usuariosOnlineMouseReleased


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviar;
    private javax.swing.JTextField campoMensagem;
    private javax.swing.JPanel chat;
    private javax.swing.JTextArea chatBox;
    private javax.swing.JPanel chatBoxx;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nomeDestino;
    private javax.swing.JLabel nomeDestino1;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPanel topInfo;
    private javax.swing.JList<String> usuariosOnline;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onMessageArrive(String message) {
        String [] array = message.split("->");
        if(array[0].equalsIgnoreCase("servidor")) {
            String atual = usuariosOnline.getSelectedValue();
            usuariosOnline.setListData(array[2].split(","));
            usuariosOnline.setSelectedValue(atual, true);
        }
        ts.setTime(new Date().getTime());
        chatBox.append("["+ts.toString().substring(11, 16)+"] "+message + "\n");
    }
    public void setarNome(String nome) {
        nomeUsuario.setText(nome);
    }

    /*ativa/desativa campos no menu principal.*/
    public void ativar(boolean a){
        jLabel2.setEnabled(a);
        jLabel3.setEnabled(a);
        chatBox.setEnabled(a);
        campoMensagem.setEnabled(a);
        botaoEnviar.setEnabled(a);
    }
}