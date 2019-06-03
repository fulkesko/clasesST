package controlador;

import gui.GUI;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public void generarTarjeta(String cadena){
    String a = "";
        String b = "";
        String ce = "";
        String de = "";
        String e = "";
        String[] plit = cadena.split("/");
        //dejarlo mas bonito despues
        for (int i = 0; i < 50; i++) {
            if(i<10){
            a+= plit[i]+"/";
            }
            if(i>=10 && i<20){
            b+= plit[i]+"/";
            }
            if(i>=20 && i<30){
            ce+= plit[i]+"/";
            }
            if(i>=30 && i<40){
            de+= plit[i]+"/";
            }
            if(i>=40 && i<50){
            e+= plit[i]+"/";
            }
        }
        try {
            insertarTarjeta(a, b, ce, de, e);
        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void insertarTarjeta(String a, String b,String ce,String d,String e) throws SQLException {
        //pasar por parametro el usuario id y estado
        String query = "INSERT INTO tarjeta VALUES (NULL,'"+a+"','"+b+"','"+ce+"','"+d+"','"+e+"',1,1)";
        //falta comprobar ya existente     
        System.out.println("tarjeta creada");
        c.ejecutar(query);

    }

    public void buscarTarjeta() throws SQLException {
        //falta recibir parametros para la busqueda WHERE codigo '"+id de tarjeta+"'
        String query = "SELECT * FROM banco.tarjeta WHERE id = '2'";

        ResultSet rs = c.ejecutarSelect(query);
        Tarjeta tar = new Tarjeta();
        ArrayList la = new ArrayList();
        ArrayList lb = new ArrayList();
        ArrayList lc = new ArrayList();
        ArrayList ld = new ArrayList();
        ArrayList le = new ArrayList();
        while (rs.next()) {
            tar.setId(rs.getInt("id"));
            //cambiar para obtener rut del cliente
            tar.setUsuario(rs.getString("usuario_id_fk"));
            tar.setEstado(rs.getInt("estado"));
            
            String coorA = rs.getString("a");
            String[] cordeA = coorA.split("/");
            la.addAll(Arrays.asList(cordeA));
            tar.setLetraA(la);
            
            String coorB = rs.getString("b");
            String[] cordeB = coorB.split("/");
            lb.addAll(Arrays.asList(cordeB));
            tar.setLetraB(lb);
            
            String coorC = rs.getString("c");
            String[] cordeC = coorC.split("/");
            lc.addAll(Arrays.asList(cordeC));
            tar.setLetraC(lc);
            
            String coorD = rs.getString("d");
            String[] cordeD = coorD.split("/");
            ld.addAll(Arrays.asList(cordeD));
            tar.setLetraD(ld);
            
            String coorE = rs.getString("e");
            String[] cordeE = coorE.split("/");
            le.addAll(Arrays.asList(cordeE));
            tar.setLetraE(le);
            
            System.out.println(tar);

        }

 }

    public int buscarCliente(String nom, String pass) throws SQLException {
        //cambiar el SELECT COUNT(*) FROM banco.usuario ; 
        //cambiar void para entregar para afuera mientras salida por consola;
        String query = "SELECT COUNT(*) AS Existe FROM banco.usuario WHERE nombre = '"+nom+"' AND pass = '"+pass+"' ";
        ResultSet rs = c.ejecutarSelect(query);
        
        int a = rs.getInt("Existe");
        //mejorar con boleano? comprobar despues
        return a;
    }
}