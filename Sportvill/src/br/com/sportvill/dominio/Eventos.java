package br.com.sportvill.dominio;
import java.util.List;
import java.util.Objects;

public class Eventos {
   
    private float data;
    private float horário;
    private String local;
    private String nomeDoEvento;

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }

    public float getHorário() {
        return horário;
    }

    public void setHorário(float horário) {
        this.horário = horário;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Float.floatToIntBits(this.data);
        hash = 47 * hash + Float.floatToIntBits(this.horário);
        hash = 47 * hash + Objects.hashCode(this.local);
        hash = 47 * hash + Objects.hashCode(this.nomeDoEvento);
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
        final Eventos other = (Eventos) obj;
        if (Float.floatToIntBits(this.data) != Float.floatToIntBits(other.data)) {
            return false;
        }
        if (Float.floatToIntBits(this.horário) != Float.floatToIntBits(other.horário)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        if (!Objects.equals(this.nomeDoEvento, other.nomeDoEvento)) {
            return false;
        }
        return true;
    }

   
    
    
    
}
