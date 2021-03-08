/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
public class DatosSucursalTest {
    
    public DatosSucursalTest() {
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
     * Test of ObtenerSucursal method, of class DatosSucursal.
     */
    @Test
    public void testObtenerSucursal() {
        System.out.println("ObtenerSucursal");
        int Sucursal = 0;
        DatosSucursal instance = new DatosSucursal();
        int expResult = 0;
        int result = instance.ObtenerSucursal(Sucursal);
        assertEquals(expResult, result);

    }

    /**
     * Test of buscarUsuario method, of class DatosSucursal.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String usuario = "Alejo";
        DatosSucursal instance = new DatosSucursal();
        int expResult = 1;
        int result = instance.buscarUsuario(usuario);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of insertarUsuario method, of class DatosSucursal.
     */
    @Test
    public void testInsertarUsuario() throws Exception {
        System.out.println("insertarUsuario");
        String Dni = "";
        String tipo = "";
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String estado = "";
        String domicilio = "";
        int id_sucursal =1;
        String usuario = "";
        String pass = "";
        DatosSucursal instance = new DatosSucursal();
        instance.insertarUsuario(Dni, tipo, nombre, apellido, telefono, estado, domicilio, id_sucursal, usuario, pass);
       
    }

    /**
     * Test of devolverusuario method, of class DatosSucursal.
     */
    @Test
    public void testDevolverusuario() {
        System.out.println("devolverusuario");
        String usuario = "";
        String expResult = "";
        String result = DatosSucursal.devolverusuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of devolversucursal method, of class DatosSucursal.
     */
    @Test
    public void testDevolversucursal() {
        System.out.println("devolversucursal");
        String usuario = "";
        int expResult = 1;
        int result = DatosSucursal.devolversucursal(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
