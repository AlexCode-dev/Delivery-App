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
 * @author ALAN
 */
public class DatosZona {

    public void AgregarZona(String nombreZona, float tarifa) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO zona (nombreZona, tarifaE, estado) VALUES ('" + nombreZona
                + "',' " + tarifa + "', 1)";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);

        con.cerrar(miConexion);
    }

    public ResultSet buscarZonaPorNombre(String zona) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        String SQL = "SELECT * FROM zona WHERE nombre = '"+ zona +"'";
        
        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        
        return rs;

    }
    
     public ResultSet buscarZonaPorID(int id) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        String SQL = "SELECT * FROM zona WHERE IDZona = '"+ id +"'";
        

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        
        return rs;

    }
    
    public ResultSet obtenerZonas() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM zona WHERE estado = 1";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
    public void eliminarZona(String Nombre) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE zona SET estado = '0' WHERE nombreZona = '" + Nombre + "'";

        Statement eliminar = miConexion.createStatement();

        eliminar.executeUpdate(SQL);
        
    }
    
    public void ModificarZona(String nombreZona, float tarifa, String nombreActual) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE zona SET nombreZona = '"+nombreZona+"', tarifaE = "+tarifa+" WHERE nombreZona = '" + nombreActual + "'";

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
    
    public ResultSet obtenerPeriodoParaEntregasZonas(String desde, String hasta) throws SQLException{
          Conectar con = new Conectar();
        Connection miConexion = con.conexion();
         
        String SQL = "SELECT * FROM pedido WHERE fecha >= '"+desde+"' AND fecha <= '"+hasta+"' AND estado = 1";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        return rs;
      }

}
