
package datos;

import conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import principal.Principal;
import subPaneles.Monto_Final;
import subPaneles.Monto_Inicial;


public class DatosCaja {
    
    public ResultSet buscarCajaAbierta() throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        //estado = 1 y pertenece a la sucursal
       
        int id_sucursal;
        id_sucursal = Integer.parseInt(principal.Principal.Sucursal_ID.getText());
        System.out.println("id_sucursal caja:"+id_sucursal);
        String SQL = "Select * from caja WHERE estado = 1 and id_sucursal= "+id_sucursal+"";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;
    }
    
    public void iniciarCaja(double montoInicial) throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        DatosUsuario xtt= new DatosUsuario();
        System.out.println("es este el nombre de abajo");//el problema esta en el label la concha de su hermana
            System.out.println(Principal.nombre_loc.getText().trim());
           int sucursal=xtt.buscarUsuario(Principal.nombre_loc.getText());
           int sucursal2=Integer.parseInt(Monto_Inicial.Ingreso_cod_sucursal_IM.getText());
           System.out.println(sucursal);
    
        String SQL = "INSERT INTO caja (monto_inicial, monto_final, fecha, estado,id_sucursal) VALUES ("+montoInicial+", "+montoInicial+" , NOW(), 1,"+sucursal2+")";
        
        Statement insertar = miConexion.createStatement();
        
        insertar.executeUpdate(SQL);
        System.out.println("llego a iniciar caja");
    }
    
    public void cerrarCaja() throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        String SQL = "UPDATE caja SET estado = 0 WHERE estado = 1";
        
        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
        
    }
    
    public void actualizarMontoTotal(double monto) throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        String SQL = "UPDATE caja SET monto_final = "+monto+" WHERE estado = 1";
        
        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
    
}
