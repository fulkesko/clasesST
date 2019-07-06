package ventainterfaceiva;

/**
 *
 * @author Luis Martinez
 */
public class VentaInterfaceIva {

    public static void main(String[] args) {
        Auto a = new Auto("2.0");
        a.calcularIva();
        Accesorios acc = new Accesorios();
        acc.calcularIva();
        
        Iva iva_auto = new Auto("1.6");
        Iva iva_acce = new Accesorios();
        iva_auto.calcularIva();
        iva_acce.calcularIva();
        System.out.println("----"+a);
    }
    
}
