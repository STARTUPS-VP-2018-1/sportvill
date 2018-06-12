package br.com.sportvill.test;

import br.com.sportvill.business.ClienteBusiness;
import br.com.sportvill.dominio.Cliente;
import java.util.ArrayList;

public class ClienteBusinessMock {
    
    
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Fulano");
        
        novoCliente.setTelefones(new ArrayList<Integer>());
        novoCliente.getTelefones().add(48849492);
        novoCliente.getTelefones().add(92037610);
        novoCliente.getTelefones().add(36910293);
        
        ClienteBusiness clienteBusiness = new ClienteBusiness(); 
        
        Cliente segundoNovoCliente = null;
        try{
            clienteBusiness.salvarCliente(novoCliente);
            clienteBusiness.salvarCliente(segundoNovoCliente);
        }catch(UnsupportedOperationException exc){
            System.out.println(exc.getMessage());
        
        
        
        
        }
        
    }
}

