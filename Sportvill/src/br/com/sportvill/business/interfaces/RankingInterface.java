package br.com.sportvill.business.interfaces;
import br.com.sportvill.dominio.Ranking;


public interface RankingInterface {
    
    public Ranking salvarRanking(Ranking ranking);
    public Ranking buscarRanking (Integer id);    
    
}
