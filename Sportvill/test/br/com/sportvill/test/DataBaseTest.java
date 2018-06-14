/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.test;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class DataBaseTest {
        
    public Statement stm;
    //Statement, vai ser o responsavel pela pesquisa no banco de dados
    
    public ResultSet rs;
    //ResultSet, ele vai armazenar o resultado da pesquisa (na qual eu busquei)
        
    private String driver = "org.postgresql.Driver";
    //driver, ele vai identificar o serviço do banco de dados (padrão do postgre)
       
    private String caminho = "jdbc:postgresql://localhost:5432/sportvill";
    //caminho, ele vai dizer onde está o banco de dados 
    
    private String usuario = "postgres";
    private String senha = "kevin";
    
    public Connection con;
    //Connection, vai ser responsavel pela conexão com o banco de dados
    
    public void conexao() {
         
        //Antes o "System.setProperty("jdbc.Drivers", driver);" estava aqui
        
        //Circundar instrução com try and catch
        try {
            
            //Responsavel por "settar" a propriedade do driver de conexão
            System.setProperty("jdbc.Drivers", driver);
            
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!");
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n"+ex.getMessage());
        }    
        
    }
    
        public void executaSql(String sql){
            
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
//"TYPE_SCROLL_INSENSITIVE" vai diferenciar maiusculo de minusculo
//"CONCUR_READ_ONLY"vai permitir "settar" o primeiro registro do banco quanto tanto o ultimo
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro do executaSql:\n"+ex.getMessage());
        }
                    
                    
                    
                    
                    
        }
      
        public void desconectar() {
            
            //con.close();
                  
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o BD:\n"+ex.getMessage());
        }            
        }
}
