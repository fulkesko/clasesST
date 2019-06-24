
package modelo;

/**
 *
 * @author Fulvio
 */
public class Usuario {
    private String nombre;
    private String password;
    private String estado;
    private String nivelUsuario;

    public Usuario(String nombre, String password, String estado, String nivelUsuario) {
        this.nombre = nombre;
        this.password = password;
        this.estado = estado;
        this.nivelUsuario = nivelUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(String nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + ", estado=" + estado + ", nivelUsuario=" + nivelUsuario + '}';
    }
    
}
