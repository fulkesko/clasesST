package ventainterfaceiva;

/**
 *
 * @author Luis Martinez
 */
public class Auto extends Motor implements Iva{
    public String marca;
    public String modelo;
    public int cantPersonas;

    public Auto(String marca, String modelo, int cantPersonas, String cilindrada) {
        super(cilindrada);
        this.marca = marca;
        this.modelo = modelo;
        this.cantPersonas = cantPersonas;
    }

    public Auto(String cilindrada) {
        super(cilindrada);
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public void calcularIva() {
        System.out.println("19%+5%");
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", cantPersonas=" + cantPersonas + ", cilindrada: " +cilindrada+ '}';
    }
    
    

}
