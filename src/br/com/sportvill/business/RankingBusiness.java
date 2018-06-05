package br.com.sportvill.business;
import br.com.sportvill.dominio.Ranking;
import br.com.sportvill.business.interfaces.RankingInterface;
import br.com.sportvill.repositorio.Repositorio;
import java.util.ArrayList;
import java.util.List;

public class RankingBusiness implements RankingInterface{

    @Override
    public Ranking salvarRanking(Ranking ranking) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ranking buscarRankingPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ranking> buscarRankingPorId(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Ranking> BuscarTodosRankingS() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
