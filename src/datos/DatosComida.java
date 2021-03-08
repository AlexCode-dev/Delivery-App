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
public class DatosComida {

    public void AgregarComida(String nombre,String tipoComida,String Descripcion ,float precio,String estado,int id_sucursal) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO comida (nombreComida,tipoComida,descripcion,precioxUnidad,estado,id_sucursal) VALUES ('"+nombre
                + "','"+tipoComida + "','"+Descripcion + "','"+precio + "','"+estado + "','"+id_sucursal + "')";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);

        con.cerrar(miConexion);

    }

    public ResultSet obtenerComidas() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM comida WHERE estado = 'En venta' and tipoComida='Comida'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
    public ResultSet obtenerBebidas() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM comida WHERE estado = 'En venta' and tipoComida='Bebida'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
     public ResultSet obtenerPostre() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM comida WHERE estado = 'En venta' and tipoComida='Postre'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
    
    public void eliminarComida(String Nombre) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE comida SET estado = 'No venta' WHERE nombreComida = '" + Nombre + "'";

        Statement eliminar = miConexion.createStatement();

        eliminar.executeUpdate(SQL);
        
    }
    
    public ResultSet BuscarComidaNombre(String nombre) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM comida WHERE nombreComida = '" + nombre + "'";

            ResultSet rs = miEstatement.executeQuery(SQL);


        return rs;
    }
    
     public ResultSet BuscarComidaID(String id) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM comida WHERE id_comida ="+id +"";

            ResultSet rs = miEstatement.executeQuery(SQL);


        return rs;
    }
     
    public void ModificarComida(String Nombre, String nombre, float precio) throws SQLException{
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE comida SET nombreComida = '"+nombre+"', precioxUnidad = '"+precio+"' WHERE nombreComida = '" + Nombre + "'";

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
    
    public ResultSet buscarZonaPorNombre(String zona) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        String SQL = "SELECT * FROM zona WHERE nombreZona = '"+ zona +"'";
        
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
     
      public ResultSet obtenerCadetes() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM cadete WHERE estado = 'Disponible'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
}
