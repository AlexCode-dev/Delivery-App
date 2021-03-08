/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex1
 */
public class DatosCajaTest {
    
    public DatosCajaTest() {
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
     * Test of buscarCajaAbierta method, of class DatosCaja.
     */
    @Test
    public void testBuscarCajaAbierta() throws Exception {
        System.out.println("buscarCajaAbierta");
        DatosCaja instance = new DatosCaja();
        int expResult = 1;
        ResultSet result = instance.buscarCajaAbierta();
        assertEquals(expResult, result.getInt("estado"));
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of iniciarCaja method, of class DatosCaja.
     */
    @Test
    public void testIniciarCaja() throws Exception {
        System.out.println("iniciarCaja");
        String montoInicial = "0.0";
        double monto = Double.parseDouble(montoInicial);
        DatosCaja instance = new DatosCaja();
        instance.iniciarCaja(monto);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of cerrarCaja method, of class DatosCaja.
     */
    @Test
    public void testCerrarCaja() throws Exception {
        System.out.println("cerrarCaja");
        DatosCaja instance = new DatosCaja();
        instance.cerrarCaja();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of actualizarMontoTotal method, of class DatosCaja.
     */
    @Test
    public void testActualizarMontoTotal() throws Exception {
        System.out.println("actualizarMontoTotal");
        double monto = 0.0;
        DatosCaja instance = new DatosCaja();
        instance.actualizarMontoTotal(monto);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
