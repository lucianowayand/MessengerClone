
package trabalhofinal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class principal extends javax.swing.JFrame implements ObservadorDeMensagem{

    public principal() {

        initComponents();
        Servidor.getInstance().setObservadorDeMensagem(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuariosOnline = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MSN");

        jPanel6.setPreferredSize(new java.awt.Dimension(50, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Usuários online", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 169));

        usuariosOnline.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Jaasiel", "Luciano", "Fenandinha" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        usuariosOnline.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        usuariosOnline.setPreferredSize(new java.awt.Dimension(67, 0));
        usuariosOnline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuariosOnlineMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariosOnlineMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(usuariosOnline);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.WEST);

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
        if (!usuariosOnline.getSelectedValue().equals("")) {
            String nomeDestino = usuariosOnline.getSelectedValue();
            Chat jPanel5 = new Chat(nomeDestino);
//            ativar(true);  
            jTabbedPane1.addTab(nomeDestino, jPanel5);
        
        }
    }//GEN-LAST:event_usuariosOnlineMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        login ab = new login();
        ab.setVisible(true);
        ab.setLocationRelativeTo(null);
        //Servidor.getInstance().interrupt();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void usuariosOnlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariosOnlineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usuariosOnlineMouseClicked


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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> usuariosOnline;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onMessageArrive(String message) {
        String [] array = message.split("->");
        if(array[0].equalsIgnoreCase("servidor")) {
            usuariosOnline.setListData(array[2].split(","));
        }
//        chatBox.append(message + "\n");
    }
//    public void setarNome(String nome) {
//        nomeUsuario.setText(nome);
//    }

    /*ativa/desativa campos no menu principal.*/

}