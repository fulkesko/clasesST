package proyectoreflectionmejorado;

public class ClaseSimple {

    public String unaVariableString = "Un Texto Simplecito";
    
    private int unaVariableInt = 8;

    public String getUnaVariableString(String concatenar) {
        return unaVariableString + concatenar;
    }

    private int getUnaVariableInt(int suma) {
        return unaVariableInt + suma;
    }
    
    public String metodoDosParametros(String nombre, String apellido){
        return nombre+" - "+apellido;
    }
    
    private String metodoTresParametros(String nombre, String apellido, int edad){
        return nombre+" - "+apellido+" - "+String.valueOf(edad);
    }
}
