package br.com.sportvill.dominio;
import java.util.List;
import java.util.Objects;


public class Modalidades {
    
    
   private String corrida;
   private String ciclismo;
   private String ginastica;
   private String futebol;

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

    public String getGinastica() {
        return ginastica;
    }

    public void setGinastica(String ginastica) {
        this.ginastica = ginastica;
    }

    public String getFutebol() {
        return futebol;
    }

    public void setFutebol(String futebol) {
        this.futebol = futebol;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.corrida);
        hash = 79 * hash + Objects.hashCode(this.ciclismo);
        hash = 79 * hash + Objects.hashCode(this.ginastica);
        hash = 79 * hash + Objects.hashCode(this.futebol);
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
        final Modalidades other = (Modalidades) obj;
        if (!Objects.equals(this.corrida, other.corrida)) {
            return false;
        }
        if (!Objects.equals(this.ciclismo, other.ciclismo)) {
            return false;
        }
        if (!Objects.equals(this.ginastica, other.ginastica)) {
            return false;
        }
        if (!Objects.equals(this.futebol, other.futebol)) {
            return false;
        }
        return true;
    }
   
   
    
    }

    
    
    




