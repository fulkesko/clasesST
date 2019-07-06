package controlador;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.Tarjeta;

public class Data {
    private final Conexion c;
    
    public Data(){
        c = new Conexion();
    }
    
    public void insertarTarjeta() throws SQLException{
        String query = "INSERT INTO tarjeta VALUES(NULL, 'tarjeta 1', 'A', '00,00,00,00,00,00,00,00,00,00', 1), "
                     + "(NULL, 'tarjeta 1', 'B', '11,11,11,11,11,11,11,11,11,11', 1), "
                     + "(NULL, 'tarjeta 1', 'C', '22,22,22,22,22,22,22,22,22,22', 1), "
                     + "(NULL, 'tarjeta 1', 'D', '33,33,33,33,33,33,33,33,33,33', 1), "
                     + "(NULL, 'tarjeta 1', 'E', '44,44,44,44,44,44,44,44,44,44', 1)";
              
                     
        c.ejecutar(query);
        
    }
    public void buscarTarjeta() throws SQLException{
      
        String query = "SELECT * FROM banco.tarjeta WHERE codigo = 'tarjeta 1'";
       
         ResultSet rs = c.ejecutarSelect(query);
         while(rs.next()){
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
}