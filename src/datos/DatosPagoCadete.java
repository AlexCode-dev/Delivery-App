/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alex1
 */
public class DatosPagoCadete {
    
    
    public void AgregargananciaDiaCadete(String fecha, int cuit_cadete,float pago) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO gananciaDiaCadete (fecha,cuit_cadete,estado,pago) VALUES ('" + fecha + "', '" + cuit_cadete + "', 'No pagado', '" + pago + "')";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);

        con.cerrar(miConexion);

    }

    public ResultSet obtenergananciaDiaCadete() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM gananciaDiaCadete WHERE estado = 'No pagado' ";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
    public void ActualizargananciaDiaCadete(int dni, String estado) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE gananciaDiaCadete SET estado = '" + estado + "' WHERE cuit_cadete = "+dni;

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
    
  

}
