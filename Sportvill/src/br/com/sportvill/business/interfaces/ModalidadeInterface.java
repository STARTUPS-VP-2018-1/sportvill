package br.com.sportvill.business.interfaces;

import br.com.sportvill.dominio.Modalidade;
import java.util.List;




public interface ModalidadeInterface {
    
    public Modalidade salvarModalidade (Modalidade modalidade);
    public Modalidade buscarModalidadePorId (Integer id);
    public List<Modalidade> buscarModalidadePorNome (String nome);
    public List<Modalidade> buscarTodosProdutos();
    
    
    
    
    
}
