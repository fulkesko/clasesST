package proyectoreflectionmejorado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier; //Alcance
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoReflectionMejorado {

    public static void main(String[] args) {

        ClaseSimple objetoDeMiClase = new ClaseSimple();
        Class ClaseObjetoInformacion = objetoDeMiClase.getClass();

        try {
            //           =====OBTENER VARIABLE=====
            Field variableString = ClaseObjetoInformacion.getField("unaVariableString");//Publica

            Field variableInt = ClaseObjetoInformacion.getDeclaredField("unaVariableInt");//Privada

            //           =====OBTENER VARIABLE=====
            //           =====OBTENER METODOS=====
            Method metodoGetString = ClaseObjetoInformacion.getMethod("metodoDosParametros", String.class, String.class);//Publico
            //Se deben pasar la misma cantidad de parametros que tenga
            Method metodoGetInt = ClaseObjetoInformacion.getDeclaredMethod("getUnaVariableInt", int.class);//Privado

            //           =====OBTENER METODOS=====
        } catch (NoSuchFieldException | SecurityException | NoSuchMethodException ex) {
            Logger.getLogger(ProyectoReflectionMejorado.class.getName()).log(Level.SEVERE, null, ex);
        }

        //     -------------- TODOS LOS METODOS --------------
        //array con todas las variables públicas de nuestra clase
        Method[] todosLosMetodosPublicos = ClaseObjetoInformacion.getMethods();

        //array con todos los métodos, independientemente de si son privados o no
        Method[] todosLosMetodosDeclarados = ClaseObjetoInformacion.getDeclaredMethods();

        System.out.println("==METODOS==");
        for (Method metodo : todosLosMetodosDeclarados) {
            System.out.println("Nombre del MÉTODO: " + metodo.getName());
            System.out.println("Cantidad de parámetros: " + metodo.getParameterCount());
        }

        //     -------------- TODOS LOS METODOS --------------
        
        //     -------------- TODAS LAS VARIABLES --------------
        //array con todas las variables públicas de nuestra clase
        Field[] todasLasVariables = ClaseObjetoInformacion.getFields();

        //array con todas las variables, independientemente de si son privadas o no
        Field[] todasLasVariablesDeclaradas = ClaseObjetoInformacion.getDeclaredFields();

        System.out.println("===VARIABLES===");
        for (Field variable : todasLasVariablesDeclaradas) {
            System.out.println("== DATOS VARIABLE ==");
            int modificador = variable.getModifiers();
            String nombreVariable = variable.getName();
            System.out.println("\nNombre: " + nombreVariable);
            
            Type tipo = variable.getGenericType();
            String nombreTipoVariable = tipo.getTypeName();
            System.out.println("Tipo: "+nombreTipoVariable);

            Boolean esPublic = Modifier.isPublic(modificador);
            System.out.println("¿Es public? " + esPublic);

            Boolean esPrivate = Modifier.isPrivate(modificador);
            System.out.println("¿Es private? " + esPrivate);
            
            try {
                variable.setAccessible(true);
                Object textoObtenido = variable.get(objetoDeMiClase); // Object General
                System.out.println("Variable nombre: "+nombreVariable+" Tipo: "+nombreTipoVariable+" Valor: "+textoObtenido);
                
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                Logger.getLogger(ProyectoReflectionMejorado.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        //     -------------- TODAS LAS VARIABLES --------------
        //     -------------- TODOS LOS CONSTRUCTORES --------------
        //Si queremos obtener un array con todos los constructores publicos de nuestra clase
        Constructor[] todosLosConstructoresPublicos = ClaseObjetoInformacion.getConstructors();

        //Si queremos obtener todos los métodos, independientemente de si son privados o no
        Constructor[] todosLosConstructores = ClaseObjetoInformacion.getDeclaredConstructors();
        //     -------------- TODOS LOS CONSTRUCTORES --------------
        
        System.out.println("===============================");
        
        
        try {
            //========================VER VALORES DE VARIABLES===========================
            
            // == Variable Publica ==
            Field variableString = ClaseObjetoInformacion.getField("unaVariableString");//Publica
            String textoObtenido = (String) variableString.get(objetoDeMiClase);
            System.out.println("Texto --> "+textoObtenido);
            // == Variable Publica ==
            
            // == Variable Privada ==
            Field variableInt = ClaseObjetoInformacion.getDeclaredField("unaVariableInt");
            variableInt.setAccessible(true);
            int intObtenido = variableInt.getInt(objetoDeMiClase);
            System.out.println("INT privado --> "+intObtenido);
            // == Variable Privada ==
            
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(ProyectoReflectionMejorado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
