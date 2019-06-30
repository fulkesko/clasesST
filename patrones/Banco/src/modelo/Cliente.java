
package modelo;

public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    private int sueldoLiquido;
    private int estado;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSueldoLiquido() {
        return sueldoLiquido;
    }

    public void setSueldoLiquido(int sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldoLiquido=" + sueldoLiquido + ", estado=" + estado + '}';
    }

    public Cliente() {
    }

}

