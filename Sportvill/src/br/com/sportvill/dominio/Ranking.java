package br.com.sportvill.dominio;
import java.util.Objects;


public class Ranking {
    
    private String colocação;
    private int pontuação;

    public String getColocação() {
        return colocação;
    }

    public void setColocação(String colocação) {
        this.colocação = colocação;
    }

    public int getPontuação() {
        return pontuação;
    }

    public void setPontuação(int pontuação) {
        this.pontuação = pontuação;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.colocação);
        hash = 97 * hash + this.pontuação;
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
        final Ranking other = (Ranking) obj;
        if (this.pontuação != other.pontuação) {
            return false;
        }
        if (!Objects.equals(this.colocação, other.colocação)) {
            return false;
        }
        return true;
    }
   
    
    
}
