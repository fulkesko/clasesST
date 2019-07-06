package ventainterfaceiva;

public abstract class Motor {

    public String cilindrada;

    public Motor(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindrada=" + cilindrada + '}';
    }
    
}
