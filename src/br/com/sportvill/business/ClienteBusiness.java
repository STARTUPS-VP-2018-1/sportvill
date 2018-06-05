/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sportvill.business;
import br.com.sportvill.business.interfaces.ClienteInterface;
import br.com.sportvill.dominio.Cliente;
import java.util.List;
import br.com.sportvill.repositorio.Repositorio;


/**
 *
 * @author internet
 */
public class ClienteBusiness implements ClienteInterface {

    @Override
    public Cliente salvarCliente(Cliente cliente) {
       if(validarCliente(cliente)){
           Repositorio.clienteDBFake.add(cliente);  
            System.out.println("Cliente cadastrado!");
        }else{
            System.err.println("Cliente com dados inválido");
        }
        return null;
    }

    @Override
    public Cliente buscarClientePorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> buscarClientePorId(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> BuscarTodosClienteS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        
    }
    
    public boolean validarCliente(Cliente cliente){
        boolean clienteValido=false;
        if(cliente !=null){
            if(   (cliente.getNome()!=null && 
                   !cliente.getNome().equals(""))){
                clienteValido= true;
            }
        }        
        return clienteValido;
    
    }
    
    public boolean validarCliente2(Cliente cliente){
        boolean clienteValido=true;
        if(cliente !=null){
            if(cliente.getNome()==null ||
               cliente.getNome().equals("")){
                clienteValido= false;
            }
                     
        }        
        return clienteValido;
    }
    
}
