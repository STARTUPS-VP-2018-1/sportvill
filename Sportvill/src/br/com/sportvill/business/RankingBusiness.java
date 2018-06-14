package br.com.sportvill.business;
import br.com.sportvill.dominio.Ranking;
import br.com.sportvill.business.interfaces.RankingInterface;


public class RankingBusiness implements RankingInterface{

    @Override
    public Ranking salvarRanking(Ranking ranking) {
        return ranking;
    }

    @Override
    public Ranking buscarRanking(Integer id) {
        return null;
    }

}
