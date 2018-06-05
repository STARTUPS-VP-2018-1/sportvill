package br.com.sportvill.dominio;
import java.util.ArrayList;
import java.util.Objects;


public class Ranking {
    
    private String colocação;
    private int pontuação;
    private float distanciaPorcorrida;
    private String nome;
    private String histórico;
    private String localidade;

    public String getColocação() {
        return colocação;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.colocação);
        hash = 19 * hash + this.pontuação;
        hash = 19 * hash + Float.floatToIntBits(this.distanciaPorcorrida);
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.histórico);
        hash = 19 * hash + Objects.hashCode(this.localidade);
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
        if (Float.floatToIntBits(this.distanciaPorcorrida) != Float.floatToIntBits(other.distanciaPorcorrida)) {
            return false;
        }
        if (!Objects.equals(this.colocação, other.colocação)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.histórico, other.histórico)) {
            return false;
        }
        if (!Objects.equals(this.localidade, other.localidade)) {
            return false;
        }
        return true;
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

    public float getDistanciaPorcorrida() {
        return distanciaPorcorrida;
    }

    public void setDistanciaPorcorrida(float distanciaPorcorrida) {
        this.distanciaPorcorrida = distanciaPorcorrida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistórico() {
        return histórico;
    }

    public void setHistórico(String histórico) {
        this.histórico = histórico;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    
    
    
}
