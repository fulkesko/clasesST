package controlador;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;
import modelo.Tarjeta;

public class Data {

    private final Conexion c;

    public Data() {
        c = new Conexion();
    }

    public String numrandom(){
        String coorde = "";
        Random random = new Random();
        IntStream intStream = random.ints(50, 10, 99);
        Iterator iterator = intStream.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            //System.out.println("Random Number " + iterator.next());
            coorde = coorde + iterator.next()+"/";
            
            count++;
        }
        System.out.println("tamaño: " + count);
        return coorde;
    }
    
//    public void numrandom(){
//           ArrayList li = new ArrayList();
//        Random random = new Random();
//        IntStream intStream = random.ints(100, 10, 99);
//        Iterator iterator = intStream.iterator();
//        int count = 0;
//        while (iterator.hasNext()) {
//            System.out.println("Random Number " + iterator.next());
//            li.add(iterator.next());
//            System.out.println("tamaño: " + count);
//            count++;
//        }
//        System.out.println(li);
//    } 
    
    public void insertarTarjeta(String a, String b,String ce,String d,String e) throws SQLException {
        String query = "INSERT INTO tarjeta VALUES (NULL,'"+a+"','"+b+"','"+ce+"','"+d+"','"+e+"',1,1)";
        //falta comprobar ya existente     
        System.out.println("tarjeta creada");
        c.ejecutar(query);

    }

    public void buscarTarjeta() throws SQLException {
        //falta recibir parametros para la busqueda WHERE codigo '"+id de tarjeta+"'
        String query = "SELECT * FROM banco.tarjeta WHERE codigo = 'tarjeta 1'";

        ResultSet rs = c.ejecutarSelect(query);
        while (rs.next()) {
            Tarjeta tar = new Tarjeta();
            String coor = rs.getString("coordenada");
            tar.setCod(rs.getString("codigo"));
            tar.setLetra(rs.getString("letra"));
            String[] coordenada = coor.split(",");
            ArrayList li = new ArrayList();
            //netbean recomendacion
            li.addAll(Arrays.asList(coordenada));
            tar.setCoordenada(li);
            tar.setEstado(rs.getByte("estado"));

            System.out.println(tar);

        }

//             tar.setCoordenada(rs.getString("coordenada"));
//         String[] sop = cod.split(",|%",-1);
//             id = rs.getInt(1);
//             cod = rs.getString(2);
//             estado = rs.getInt(3);       
    }

    public void buscarCliente() {
        //cambiar el SELECT COUNT(*) FROM banco.usuario ; 
        //cambiar void para entregar para afuera mientras salida por consola;
        String query = "SELECT COUNT(*) FROM banco.usuario;  ";
    }
}