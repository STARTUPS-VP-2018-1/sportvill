/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.business;
import br.com.sportvill.business.interfaces.ModalidadeInterface;
import br.com.sportvill.dominio.Modalidade;
import br.com.sportvill.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author internet
 */
public class ModalidadeBusiness implements ModalidadeInterface {

    @Override
    public Modalidade salvarModalidade(Modalidade modalidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Modalidade buscarModalidadePorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modalidade> buscarModalidadePorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Modalidade> buscarTodosProdutos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
