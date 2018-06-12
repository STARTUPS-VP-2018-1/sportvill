package br.com.sportvill.business;
import br.com.sportvill.dominio.Eventos;
import br.com.sportvill.business.interfaces.EventosInterface;
import java.util.List;
import br.com.sportvill.repositorio.Repositorio;

public class EventosBusiness implements EventosInterface{

    @Override
    public Eventos salvarEventos(Eventos eventos) {
        if(validarEventos(eventos)){
           Repositorio.eventosDBFake.add(eventos);  
            System.out.println("Evento cadastrado!");
        }else{
            System.err.println("Evento com dados inválido");
        }
        return null;
    }

    @Override
    public Eventos buscarEventosPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventos> buscarEventosPorId(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Eventos> BuscarTodosEventos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean validarEventos(Eventos eventos){
        boolean eventosValido=false;
        if(eventos !=null){
            if(   (eventos.getNomeDoEvento()!=null && 
                   !eventos.getNomeDoEvento().equals(""))){
                eventosValido= true;
            }
        }        
        return eventosValido;
    
    }
    
    public boolean validarEventos2(Eventos eventos){
        boolean eventosValido=true;
        if(eventos !=null){
            if(eventos.getNomeDoEvento()==null ||
               eventos.getNomeDoEvento().equals("")){
                eventosValido= false;
            }
                     
        }        
        return eventosValido;
    
    } 
}
