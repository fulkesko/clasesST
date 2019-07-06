package ventainterfaceiva;

/**
 *
 * @author Luis Martinez
 */
public class Accesorios implements Iva{
    public String nombre;

    public Accesorios(String nombre) {
        this.nombre = nombre;
    }

    public Accesorios() {
    }
    
    @Override
    public void calcularIva() {
        System.out.println("19%");
    }

}
