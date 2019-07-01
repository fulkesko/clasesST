/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import modelo.Tarjeta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fulvio
 */
public class DataTest {
    
    public DataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*
    @Test
    public void testNumrandom() {
        System.out.println("numrandom");
        Data instance = new Data();
        String expResult = "";
        String result = instance.numrandom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGenerarTarjeta() {
        System.out.println("generarTarjeta");
        String cadena = "";
        String rut = "";
        int estado = 0;
        Data instance = new Data();
        instance.generarTarjeta(cadena, rut, estado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    @Test
    public void testInsertarTarjeta() throws Exception {
        System.out.println("insertarTarjeta");
        String a = "";
        String b = "";
        String ce = "";
        String d = "";
        String e = "";
        String rut = "";
        int estado = 0;
        Data instance = new Data();
        instance.insertarTarjeta(a, b, ce, d, e, rut, estado);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    @Test
    public void testBuscarTarjeta() throws Exception {
        System.out.println("buscarTarjeta");
        int id = 0;
        Data instance = new Data();
        Tarjeta expResult = null;
        Tarjeta result = instance.buscarTarjeta(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    @Test
    public void testGetId() throws Exception {
        System.out.println("getId");
        String rut = "";
        Data instance = new Data();
        int expResult = 0;
        int result = instance.getId(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    */
    @Test
    public void testVerificacionUsuario() throws Exception {
        System.out.println("verificacionUsuario");
        String nom = "";
        String pass = "";
        Data instance = new Data();
        //cuando no existe
        int expResult = 3;
        int result = instance.verificacionUsuario(nom, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

   
    @Test
    public void testTipoUsuario() throws Exception {
        System.out.println("tipoUsuario");
        String nom = "";
        Data instance = new Data();
        String expResult = "";
        String result = instance.tipoUsuario(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    /*
   
    @Test
    public void testInsertarFormulario() throws Exception {
        System.out.println("InsertarFormulario");
        Cliente cli = new Cliente();
        Data instance = new Data();
        instance.InsertarFormulario(cli);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    @Test
    public void testGetClientes() throws Exception {
        System.out.println("getClientes");
        Data instance = new Data();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    */
}
