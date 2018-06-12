package br.com.sportvill.business.interfaces;
import br.com.sportvill.dominio.Eventos;
import br.com.sportvill.dominio.Modalidade;
import java.util.List;

public interface EventosInterface {
    
    public Eventos salvarEventos (Eventos eventos);
    public Eventos buscarEventosPorId (Integer id);
    public List<Eventos> buscarEventosPorId (String nome);
    public List<Eventos> BuscarTodosEventos();
    
    
    
}
