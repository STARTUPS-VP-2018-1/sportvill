/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.tela;
import java.sql.*;
import br.com.sportvill.BD.conexaoBD;

import javax.swing.JOptionPane;



/**
 *
 * @author kevin
 */
public class SportvillTelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form SportvillTelaLogin
     */
    
  conexaoBD con = new conexaoBD();
    
    
    public SportvillTelaLogin() {
        initComponents();
        con.conexao();
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoEntrar = new javax.swing.JButton();
        CampoSenha = new javax.swing.JPasswordField();
        CampoNome = new javax.swing.JTextField();
        CadastroOutraTela = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Sportvill Login");
        getContentPane().setLayout(null);

        BotaoEntrar.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        BotaoEntrar.setForeground(new java.awt.Color(255, 0, 0));
        BotaoEntrar.setText("Entrar");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoEntrar);
        BotaoEntrar.setBounds(220, 220, 110, 40);
        getContentPane().add(CampoSenha);
        CampoSenha.setBounds(210, 180, 130, 27);
        getContentPane().add(CampoNome);
        CampoNome.setBounds(210, 130, 130, 27);

        CadastroOutraTela.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        CadastroOutraTela.setForeground(java.awt.Color.white);
        CadastroOutraTela.setText("Clique aqui para criar uma conta");
        CadastroOutraTela.setContentAreaFilled(false);
        CadastroOutraTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroOutraTelaActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroOutraTela);
        CadastroOutraTela.setBounds(110, 260, 290, 29);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 180, 90, 21);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 130, 90, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sportvill/tela/imagens/t2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 500, 519);

        setSize(new java.awt.Dimension(511, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed
    
       
      try {
          
          //Se ele encontrou o usuário no banco de dados, ele vai cair para o If
          con.executaSql("select *from cadastro where nome_usuario='"+CampoNome.getText()+"'");
          //Vai pegar o primeiro resultado e salvar no rs
          con.rs.first(); 
             //Está comparando com o que o usuário digitou
          if (con.rs.getString("senha_usuario").equals(CampoSenha.getText())) {
              SportvillTelaPrincipal tela = new SportvillTelaPrincipal();
              tela.setVisible(true);
              dispose();
          } else {
              JOptionPane.showMessageDialog(rootPane, "Usuario não cadastrado");
          }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(rootPane, "Usuario não cadastrado");
      }
        
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void CadastroOutraTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroOutraTelaActionPerformed
       
        SportvillTelaCadastro ChamarTelaCadastro = new SportvillTelaCadastro();
        
    //Chama a outra Jframe
        ChamarTelaCadastro.setVisible(true); 
        
    //Encerra a Jframe anterior
        dispose();
         
        
        
    }//GEN-LAST:event_CadastroOutraTelaActionPerformed

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
            java.util.logging.Logger.getLogger(SportvillTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SportvillTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SportvillTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SportvillTelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SportvillTelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JButton CadastroOutraTela;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}