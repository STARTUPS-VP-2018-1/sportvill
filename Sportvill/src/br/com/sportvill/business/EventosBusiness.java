package br.com.sportvill.business;
import br.com.sportvill.dominio.Eventos;
import br.com.sportvill.business.interfaces.EventosInterface;
import java.util.List;


public class EventosBusiness implements EventosInterface{

    @Override
    public Eventos salvarEventos(Eventos eventos) {
        return eventos;
    }

    @Override
    public Eventos buscarEventos(Integer id) {
        return null;
    }

   

  
    
    
}

