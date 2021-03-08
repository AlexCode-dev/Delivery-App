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
public class DatosClienteTest {
    
    public DatosClienteTest() {
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
     * Test of BuscarClienteTelefono method, of class DatosCliente.
     */
    @Test
    public void testBuscarClienteTelefono() {
        System.out.println("BuscarClienteTelefono");
        long telefono = 0L;
        DatosCliente instance = new DatosCliente();
        ResultSet expResult = null;
        ResultSet result = instance.BuscarClienteTelefono(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of BuscarClienteID method, of class DatosCliente.
     */
    @Test
    public void testBuscarClienteID() {
        System.out.println("BuscarClienteID");
        int id = 0;
        DatosCliente instance = new DatosCliente();
        ResultSet expResult = null;
        ResultSet result = instance.BuscarClienteID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of BuscarCliente method, of class DatosCliente.
     */
    @Test
    public void testBuscarCliente() throws Exception {
        System.out.println("BuscarCliente");
        long telefono = 0L;
        DatosCliente instance = new DatosCliente();
        ResultSet expResult = null;
        ResultSet result = instance.BuscarCliente(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of insertarCliente method, of class DatosCliente.
     */
    @Test
    public void testInsertarCliente() throws Exception {
        System.out.println("insertarCliente");
        String tipo = "";
        String nombre = "";
        String apellido = "";
        long telefono = 0L;
        String domicilio = "";
        String barrio = "";
        int zona = 0;
        int sucursal = 0;
        DatosCliente instance = new DatosCliente();
        instance.insertarCliente(tipo, nombre, apellido, telefono, domicilio, barrio, zona, sucursal);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of obtenerClientes method, of class DatosCliente.
     */
    @Test
    public void testObtenerClientes() throws Exception {
        System.out.println("obtenerClientes");
        DatosCliente instance = new DatosCliente();
        ResultSet expResult = null;
        ResultSet result = instance.obtenerClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of eliminarCliente method, of class DatosCliente.
     */
    @Test
    public void testEliminarCliente() throws Exception {
        System.out.println("eliminarCliente");
        String telefono = "";
        DatosCliente instance = new DatosCliente();
        instance.eliminarCliente(telefono);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of ModificarCliente method, of class DatosCliente.
     */
    @Test
    public void testModificarCliente() throws Exception {
        System.out.println("ModificarCliente");
        String tipo = "";
        String nombre = "";
        String apellido = "";
        long telefono = 0L;
        String calle = "";
        String barrio = "";
        int zona = 0;
        int sucursal = 0;
        DatosCliente instance = new DatosCliente();
        instance.ModificarCliente(tipo, nombre, apellido, telefono, calle, barrio, zona, sucursal);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
