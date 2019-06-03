
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {
    private int id;
    private ArrayList<String> letraA;
    private ArrayList<String> letraB;
    private ArrayList<String> letraC;
    private ArrayList<String> letraD;
    private ArrayList<String> letraE;
    private String usuario;
    private int estado;

    public Tarjeta() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getLetraA() {
        return letraA;
    }

    public void setLetraA(ArrayList<String> letraA) {
        this.letraA = letraA;
    }

    public ArrayList<String> getLetraB() {
        return letraB;
    }

    public void setLetraB(ArrayList<String> letraB) {
        this.letraB = letraB;
    }

    public ArrayList<String> getLetraC() {
        return letraC;
    }

    public void setLetraC(ArrayList<String> letraC) {
        this.letraC = letraC;
    }

    public ArrayList<String> getLetraD() {
        return letraD;
    }

    public void setLetraD(ArrayList<String> letraD) {
        this.letraD = letraD;
    }

    public ArrayList<String> getLetraE() {
        return letraE;
    }

    public void setLetraE(ArrayList<String> letraE) {
        this.letraE = letraE;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "id=" + id + ", letraA=" + letraA + ", letraB=" + letraB + ", letraC=" + letraC + ", letraD=" + letraD + ", letraE=" + letraE + ", usuario=" + usuario + ", estado=" + estado + '}';
    }

}