
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private String cod;
    private String letra;
    private ArrayList<String> coordenada;
    private int estado;

    public Tarjeta() {
        
    }

  

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public List getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(ArrayList coordenada) {
        this.coordenada = coordenada;
    }


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "cod=" + cod + ", letra=" + letra + ", coordenada=" + coordenada + ", estado=" + estado + '}';
    }
    
}
