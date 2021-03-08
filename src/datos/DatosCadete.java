
package datos;

import conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatosCadete {
    
    public void AgregarCadete(long DNI, long telefono, String nombre, String apellido,String carnet_estado, int id_vehiculo, int id_sucursal) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO cadete (cuit_cadete, nombre, apellido, telefono, carnet_estado, estado, id_vehiculo,id_sucursal) VALUES ('" + DNI+ "','"+nombre+"', '"+apellido+"', '" + telefono+ "',  '"+carnet_estado+"','Disponible', '"+id_vehiculo+"', '"+id_sucursal+"' )";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);

        con.cerrar(miConexion);

    }
    
     public ResultSet obtenerCadetes() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM cadete WHERE estado = 'Disponible' ";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
     
      public ResultSet buscarCadetePorNombre(String cadete) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        String SQL = "SELECT * FROM cadete WHERE nombre = '"+ cadete +"'";
        
        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        
        return rs;

    }
      
       public ResultSet buscarCadetePorDni(String dni) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        String SQL = "SELECT * FROM cadete WHERE cuit_cadete = "+ dni +"";
        
        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        
        return rs;

    }
     
     public void eliminarCadete(String Nombre) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE cadete SET estado = 'No disponible' WHERE nombre = '" + Nombre + "'";

        Statement eliminar = miConexion.createStatement();

        eliminar.executeUpdate(SQL);
        
    }
     //no toque este MODIFICAR...
     public void ModificarCadete(long telefono, String barrio, String calle, String nombre) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE cadetes SET telefono = "+telefono+", barrio = '"+barrio+"', calle = '"+calle+"' WHERE nombre = '" + nombre + "'";

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
    
     public void ActualizarEstadoCadete(int dni, String estado) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE cadete SET estado = '" + estado + "' WHERE cuit_cadete = "+dni;

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
     
     
}
