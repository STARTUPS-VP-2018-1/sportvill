/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.business;


import br.com.sportvill.business.interfaces.CadastroInterface;
import br.com.sportvill.repositorio.DataBase;
import br.com.sportvill.dominio.Cadastro;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author kevin
 */
public class CadastroBusiness implements CadastroInterface {
    
    DataBase conex = new DataBase();
    Cadastro cad = new Cadastro();
    
    @Override
    public void Salvar(Cadastro cad) {
        
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadastro(nome_usuario,senha_usuario) values(?,?)");
            pst.setString(1, cad.getNome());
            pst.setString(2, cad.getSenha());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados\nErro:"+ex);
        }
           conex.desconectar();
    }
    
    
    @Override
    public Cadastro buscarUsuario(Cadastro cad){
        
        
       conex.conexao();
       conex.executaSql("select *from cadastro where nome_usuario like'%"+cad.getPesquisa()+"%'");
       conex.executaSql("select *from cadastro where senha_usuario like'%"+cad.getPesquisa()+"%'");
 
        try {
            conex.rs.first();
            cad.setSenha(conex.rs.getString("senha_usuario"));
            cad.setNome(conex.rs.getString("nome_usuario"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuario:"+ex);
        }
       
       
       
       conex.desconectar();
        return cad;
        
        
    }    
    
    
}
