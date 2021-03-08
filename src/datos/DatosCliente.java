package datos;

import conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatosCliente {

    public ResultSet BuscarClienteTelefono(long telefono) {

        ResultSet rs = null;

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        try {

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM cliente WHERE telefono = " + telefono;

            rs = miEstatement.executeQuery(SQL);

        } catch (SQLException e) {
            System.out.println("error en Statement" + e.getMessage());
        }
        return rs;
    }
    
    public ResultSet BuscarClienteID(int id) {

        ResultSet rs = null;

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        try {

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM cliente WHERE id_cliente = "+id;

            rs = miEstatement.executeQuery(SQL);

        } catch (SQLException e) {
            System.out.println("error en Statement" + e.getMessage());
        }
        return rs;
    }

    public ResultSet BuscarCliente(long telefono) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        Statement miEstatement = miConexion.createStatement();

        String SQL = "SELECT * FROM cliente WHERE telefono = '"+ telefono +"'";

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;
    }

    public void insertarCliente(String tipo,String nombre,String apellido, long telefono,String domicilio,String barrio, int zona,int sucursal) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO cliente (tipo,nombre,apellido,telefono,domicilio,barrio,id_zona,id_sucursal,estado) VALUES ('" + tipo
                + "', '" + nombre + "','" + apellido + "', '" + telefono + "', '" + domicilio+ "', '" + barrio + "',"+zona+", '" + sucursal + "', '1')";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);
    }

    public ResultSet obtenerClientes() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM cliente WHERE estado = 1";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }

    public void eliminarCliente(String telefono) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        int tel = Integer.parseInt(telefono);

        String SQL = "UPDATE cliente SET estado = '0' WHERE nombre = '" + tel+ "'";

        Statement eliminar = miConexion.createStatement();

        eliminar.executeUpdate(SQL);

    }
    //cambiar esto para modificar
     public void ModificarCliente(String tipo,String nombre,String apellido, long telefono,String calle,String barrio, int zona,int sucursal) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE cliente SET tipo = '"+tipo+"', nombre = '"+nombre+"', apellido = '"+apellido+"',telefono = '"+telefono+"',domicilio = '"+calle+"', barrio = '"+barrio+"', id_zona = '"+zona+"' WHERE telefono = '"+telefono+"'";

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
}
