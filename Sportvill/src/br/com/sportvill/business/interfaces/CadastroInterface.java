/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.business.interfaces;
import br.com.sportvill.business.CadastroBusiness;
import br.com.sportvill.dominio.Cadastro;

/**
 *
 * @author kevin
 */
public interface CadastroInterface {
    
   public void Salvar(Cadastro cad);
   
   public Cadastro buscarUsuario(Cadastro cad);
    
    
}
