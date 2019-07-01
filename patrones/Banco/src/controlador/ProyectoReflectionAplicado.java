package controlador;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;//Tipo - Alc
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoReflectionAplicado {

    public static void main(String[] args) {
        Data d = new Data();
        Class clase = d.getClass();
        
        try {
            
            Field[] variable1 = clase.getDeclaredFields();
            for (int i = 0; i < 10; i++) {
               System.out.println(variable1[i]); 
            }
        
        } catch (SecurityException | IllegalArgumentException ex) {
            Logger.getLogger(ProyectoReflectionAplicado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
