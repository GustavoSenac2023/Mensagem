package view;


import controller.mensagemController;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 182210135
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMensagem = new javax.swing.JButton();
        jLabelCabecalho = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMensagemTexto = new javax.swing.JTextArea();
        jButtonEnviarMensagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonMensagem.setText("Resgatar Mensagem");
        jButtonMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMensagemActionPerformed(evt);
            }
        });

        jLabelCabecalho.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelCabecalho.setText("Mensagens");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mensagem");

        jTextMensagemTexto.setColumns(20);
        jTextMensagemTexto.setRows(5);
        jScrollPane1.setViewportView(jTextMensagemTexto);

        jButtonEnviarMensagem.setText("Enviar Mensagem");
        jButtonEnviarMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarMensagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabelCabecalho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMensagem)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEnviarMensagem)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelCabecalho)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEnviarMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButtonMensagem)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMensagemActionPerformed
        mensagemController mensagemControler = new mensagemController();
        JOptionPane.showMessageDialog(null,mensagemControler.outputMensagem());
    }//GEN-LAST:event_jButtonMensagemActionPerformed

    private void jButtonEnviarMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarMensagemActionPerformed
        mensagemController mensagemControler = new mensagemController();
        mensagemControler.inputMensagem(jTextMensagemTexto.getText());
        JOptionPane.showMessageDialog(null, "Enviada");
        jTextMensagemTexto.setText("");
    }//GEN-LAST:event_jButtonEnviarMensagemActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviarMensagem;
    private javax.swing.JButton jButtonMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCabecalho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextMensagemTexto;
    // End of variables declaration//GEN-END:variables
}
