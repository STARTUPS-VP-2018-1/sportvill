package br.com.sportvill.business.interfaces;

import br.com.sportvill.dominio.Cliente;
import br.com.sportvill.dominio.Modalidade;
import java.util.List;


public interface ClienteInterface {
    
    public Cliente salvarCliente (Cliente cliente);
    public Cliente buscarClientePorId (Integer id);
    public List<Cliente> buscarClientePorId (String nome);
    public List<Cliente> BuscarTodosClienteS();
    
    
}
