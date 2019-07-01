package controlador;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import modelo.Cliente;
import modelo.Tarjeta;
import modelo.Usuario;

public class Data {

    private Conexion c;

    public Data() {
        c = new Conexion();
    }

    public String numrandom() {
        String coorde = "";
        Random random = new Random();
        IntStream intStream = random.ints(50, 10, 99);
        Iterator iterator = intStream.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            //System.out.println("Random Number " + iterator.next());
            coorde = coorde + iterator.next() + "/";
            count++;
        }
        System.out.println("tamaño: " + count);
        return coorde;
    }

    public void generarTarjeta(String cadena) {
        String a = "";
        String b = "";
        String ce = "";
        String de = "";
        String e = "";
        String[] plit = cadena.split("/");
        //dejarlo mas bonito despues
        for (int i = 0; i < 50; i++) {
            if (i < 10) {
                a += plit[i] + "/";
            }
            if (i >= 10 && i < 20) {
                b += plit[i] + "/";
            }
            if (i >= 20 && i < 30) {
                ce += plit[i] + "/";
            }
            if (i >= 30 && i < 40) {
                de += plit[i] + "/";
            }
            if (i >= 40 && i < 50) {
                e += plit[i] + "/";
            }
        }
        try {
            insertarTarjeta(a, b, ce, de, e);
        } catch (SQLException ex) {
            System.out.println("no Insertado");
        }
    }

    public void insertarTarjeta(String a, String b, String ce, String d, String e) throws SQLException {
        //pasar por parametro el usuario id y estado
        String query = "INSERT INTO tarjeta VALUES (NULL,'" + a + "','" + b + "','" + ce + "','" + d + "','" + e + "',1,1)";
        //falta comprobar ya existente     
        System.out.println("tarjeta creada");
        c.ejecutar(query);

    }

    public Tarjeta buscarTarjeta(int id) throws SQLException {
        //falta recibir parametros para la busqueda WHERE codigo '"+id de tarjeta+"'
        String query = "SELECT * FROM banco.tarjeta WHERE id = '" + id + "'";

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

            System.out.println("se obtuvo");

        }
        return tar;

    }

    public int existeUsuario(String nom, String pass) throws SQLException {
        //cambiar el SELECT COUNT(*) FROM banco.usuario ; 
        //cambiar void para entregar para afuera mientras salida por consola;
        //usuario1, pass 123
        String query = "SELECT COUNT(*) AS existe FROM usuario WHERE nombreUsuario = '" + nom + "' AND pass = '" + pass + "' ";
        ResultSet rs = c.ejecutarSelect(query);
        if (rs.next()) {
            String a = rs.getString("existe");
            System.out.println("existe "+a);
            if ("1".equals(a)) {
                System.out.println("pass y usuario correcto");
                return 1;
            }
        }
        return 0;
    }

    public int comprobarNombreUsuario(String nom) throws SQLException {
        String query = "SELECT COUNT(*) AS existeNombre FROM usuario WHERE nombreUsuario = '" + nom + "'";
        ResultSet rs = c.ejecutarSelect(query);
        if (rs.next()) {
            String a = rs.getString("existeNombre");
            if ("1".equals(a)) {
                System.out.println("solo existe el nombre");
                return 1;
            }
        }
        return 0;
    }

    public int verificacionUsuario(String nom, String pass) throws SQLException {
        int existe = existeUsuario(nom, pass);
        switch (existe) {
            case(1):{
                System.out.println("todo bien");
                return 1;
            }
            case(0):{
                int existe2 = comprobarNombreUsuario(nom);
                if(existe2 == 1){
                    System.out.println("existe nombre, error en la pass");
                    return 2;
                }
                break;
            }default:{
                System.out.println("no existe ni clave ni usuario");
                return 3;
            }
            
        }

        return 0;
    }
    
    public  String tipoUsuario(String nom) throws SQLException{
        String query = "SELECT tipousuario.nombre as tipousuario "
                + "FROM banco.usuario INNER JOIN tipousuario "
                + "ON usuario.idTipoUsu = tipousuario.id "
                + "WHERE usuario.nombreUsuario = '"+nom+"'";
        ResultSet rs = c.ejecutarSelect(query);
        if(rs.next()){
            String tipo = rs.getString("tipousuario");
            System.out.println("tipo de usuario"+tipo);
            return tipo;
        }
    return "";
    }
    
    public void InsertarFormulario(Cliente cli) throws SQLException{
        
        String query = "INSERT INTO cliente VALUES (NULL,'"+cli.getRut()+"','"+cli.getNombre()+"','"+cli.getApellido()+"','"+cli.getSueldoLiquido()+"','"+cli.getEstado()+"')";
        System.out.println("cliente agregado como usuario");
        c.ejecutar(query);
        
    }
    public List<Cliente> Cliente() throws SQLException {
        List<Cliente> lista = new ArrayList<>();
        
        String query = "SELECT * FROM usuario";
        
        ResultSet rs = c.ejecutarSelect(query);
        
        while(rs.next()){
            Cliente usu = new Cliente();
            
            usu.setRut(rs.getNString(1));
            usu.setNombre(rs.getNString(2));
            usu.setApellido(rs.getNString(3));
            usu.setSueldoLiquido(rs.getInt(4));
            usu.setEstado(rs.getInt(5));
            
            lista.add(usu);
        }
        
        return lista;
    }
    
    
    
    
    
    
    
    
// me base en esto
//public List<Usuario> usuario() throws SQLException {
//        List<Usuario> lista = new ArrayList<>();
//
//        String query = "SELECT * FROM usuario ";
//        
//        ResultSet rs = c.ejecutar(query);
//
//        while (rs.next()) {
//
//            Usuario h = new Usuario();
//
//            h.setNombre(rs.getInt(1));
//            h.setEstado(;rs.getString(2));
//            h.setPassword(rs.getString(3));
//            h.setNivelUsuario(rs.getInt(4));
//
//            lista.add(h);
//        }
//
//        con.close();
//
//        return lista;
//    }


}



