/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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

    /**
     * Test of numrandom method, of class Data.
    
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
 */
    /**
     * Test of generarTarjeta method, of class Data.
     
    @Test
    public void testGenerarTarjeta() {
        System.out.println("generarTarjeta");
        String cadena = "";
        Data instance = new Data();
        instance.generarTarjeta(cadena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    /**
     * Test of insertarTarjeta method, of class Data.
    */
    @Test
    public void testInsertarTarjeta() throws Exception {
        System.out.println("insertarTarjeta");
        String a = "";
        String b = "";
        String ce = "";
        String d = "";
        String e = "";
        Data instance = new Data();
        instance.insertarTarjeta(a, b, ce, d, e);
        // TODO review the generated test code and remove the default call to fail.
    
    }
    /**
     * Test of buscarTarjeta method, of class Data.
     */
    @Test
    public void testBuscarTarjeta() throws Exception {
        System.out.println("buscarTarjeta");
        int id = 3;
        Data instance = new Data();
        Tarjeta expResult = new Tarjeta();
        Tarjeta result = instance.buscarTarjeta(id);
        assertEquals(expResult.getClass(), result.getClass());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of existeUsuario method, of class Data.
     
    @Test
    public void testExisteUsuario() throws Exception {
        System.out.println("existeUsuario");
        String nom = "";
        String pass = "";
        Data instance = new Data();
        instance.existeUsuario(nom, pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
