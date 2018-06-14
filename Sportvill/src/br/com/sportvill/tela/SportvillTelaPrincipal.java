/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.tela;
import br.com.sportvill.tela.SportvillTelaFutebol;
import br.com.sportvill.tela.SportvillTelaCiclismo;
import br.com.sportvill.tela.SportvillTelaGinastica;
import br.com.sportvill.tela.SportvillTelaRanking;


/**
 *
 * @author kevin
 */
public class SportvillTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form SportvillTelaPrincipal
     */
    public SportvillTelaPrincipal() {
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

        jLabel2 = new javax.swing.JLabel();
        BotaoRanking4 = new javax.swing.JButton();
        BotaoCorrida3 = new javax.swing.JButton();
        BotaoGinastica2 = new javax.swing.JButton();
        BotaoCiclismo1 = new javax.swing.JButton();
        BotaoFutebol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Sportvill Principal");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 239, 105));
        jLabel2.setText("Modalidades");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 30, 200, 32);

        BotaoRanking4.setText("Ranking");
        BotaoRanking4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRanking4ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoRanking4);
        BotaoRanking4.setBounds(340, 400, 130, 50);

        BotaoCorrida3.setText("Corrida");
        BotaoCorrida3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCorrida3ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCorrida3);
        BotaoCorrida3.setBounds(180, 300, 130, 50);

        BotaoGinastica2.setText("Ginástica");
        BotaoGinastica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGinastica2ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoGinastica2);
        BotaoGinastica2.setBounds(180, 230, 130, 50);

        BotaoCiclismo1.setText("Ciclismo");
        BotaoCiclismo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCiclismo1ActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoCiclismo1);
        BotaoCiclismo1.setBounds(180, 160, 130, 50);

        BotaoFutebol.setText("Futebol");
        BotaoFutebol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFutebolActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoFutebol);
        BotaoFutebol.setBounds(180, 90, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sportvill/tela/imagens/Principal.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1, 0, 500, 500);

        setSize(new java.awt.Dimension(497, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFutebolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFutebolActionPerformed
        // TODO add your handling code here:
        
        SportvillTelaFutebol tela = new SportvillTelaFutebol();
        tela.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_BotaoFutebolActionPerformed

    private void BotaoCiclismo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCiclismo1ActionPerformed
        // TODO add your handling code here:
        
        SportvillTelaCiclismo tela2 = new SportvillTelaCiclismo();
        tela2.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoCiclismo1ActionPerformed

    private void BotaoGinastica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGinastica2ActionPerformed
        SportvillTelaGinastica tela3 = new SportvillTelaGinastica();
        tela3.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoGinastica2ActionPerformed

    private void BotaoCorrida3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCorrida3ActionPerformed
        SportvillTelaCorrida tela4 = new SportvillTelaCorrida();
        tela4.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_BotaoCorrida3ActionPerformed

    private void BotaoRanking4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoRanking4ActionPerformed
        
        
        SportvillTelaRanking tela4 = new SportvillTelaRanking();
        tela4.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_BotaoRanking4ActionPerformed

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
            java.util.logging.Logger.getLogger(SportvillTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SportvillTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SportvillTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SportvillTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SportvillTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCiclismo1;
    private javax.swing.JButton BotaoCorrida3;
    private javax.swing.JButton BotaoFutebol;
    private javax.swing.JButton BotaoGinastica2;
    private javax.swing.JButton BotaoRanking4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
