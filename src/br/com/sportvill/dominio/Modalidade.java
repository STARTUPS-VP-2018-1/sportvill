package br.com.sportvill.dominio;
import java.util.Objects;


public class Modalidade {
    
    private String corrida;
    private String ciclismo;
    private String exercicio;

    public String getCorrida() {
        return corrida;
    }

    public void setCorrida(String corrida) {
        this.corrida = corrida;
    }

    public String getCiclismo() {
        return ciclismo;
    }

    public void setCiclismo(String ciclismo) {
        this.ciclismo = ciclismo;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.corrida);
        hash = 29 * hash + Objects.hashCode(this.ciclismo);
        hash = 29 * hash + Objects.hashCode(this.exercicio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Modalidade other = (Modalidade) obj;
        if (!Objects.equals(this.corrida, other.corrida)) {
            return false;
        }
        if (!Objects.equals(this.ciclismo, other.ciclismo)) {
            return false;
        }
        if (!Objects.equals(this.exercicio, other.exercicio)) {
            return false;
        }
        return true;
    }
    
    
    
}
