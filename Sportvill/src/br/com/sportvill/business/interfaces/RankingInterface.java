package br.com.sportvill.business.interfaces;
import br.com.sportvill.dominio.Ranking;
import br.com.sportvill.dominio.Cliente;
import br.com.sportvill.dominio.Modalidade;
import java.util.List;

public interface RankingInterface {
    
    public Ranking salvarRanking(Ranking ranking);
    public Ranking buscarRankingPorId (Integer id);
    public List<Ranking> buscarRankingPorId (String nome);
    public List<Ranking> BuscarTodosRankingS();
    
    
}
