/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import com.mysql.cj.protocol.Resultset;
import conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alex1
 */
public class DatosSucursal {
    //conexion a la base de datos
    
    
    
    public int ObtenerSucursal(int Sucursal){
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        try {
            java.sql.Statement miEstatement = miConexion.createStatement();
            
            String SQL = "SELECT * FROM sucursal WHERE id_sucursal ='"+ Sucursal +"'";
            ResultSet rs = miEstatement.executeQuery(SQL);
           
            
            while (rs.next()) {
                if(rs.getInt("id_sucursal")== Sucursal){
                    if(rs.getString("tipo").equals("Empleado")){
                        return 1;
                    }else{
                        return 2;
                    }
                }else{
                    return -1;
                }
            }


            miConexion.close();
            
            
            
            
        } catch (SQLException ex) {
            System.out.println("No conecta" + ex.getMessage());
        }
        
           return 0;
        
    }
   
    public int buscarUsuario(String usuario){
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        
        try {

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM usuario WHERE nombre= '" + usuario + "'";

            ResultSet rs = miEstatement.executeQuery(SQL);

            if (rs.next()) {
               return 1;
               
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.out.println("No conecta" + e.getMessage());
        }
        
        return 0;
    }
    
    public void insertarUsuario(String Dni,String tipo, String nombre, String apellido,String telefono,String estado,String domicilio,int id_sucursal ,String usuario, String pass) throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        


        String SQL = "INSERT INTO usuario (Dni,tipo,nombre, apellido,telefono,estado,domicilio,id_sucursal, usuario, clave) VALUES ('"+Dni+"','"+tipo
                +"','"+nombre+"','"+apellido+"', '"+telefono+"','"+estado+"','"+domicilio+"','"+id_sucursal+"','"+usuario+"', '"+pass+"')";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);

        con.cerrar(miConexion);
    }
    
    
     public static String devolverusuario(String usuario){
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        String nombreUsuario="";
        try {

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM usuario WHERE usuario.nombre = '" + usuario + "'";

            ResultSet rs = miEstatement.executeQuery(SQL);

            if (rs.next()) {
             nombreUsuario= rs.getString("nombre");
               
            } else {
                return "";
            }

        } catch (SQLException e) {
            System.out.println("No conecta" + e.getMessage());
        }
        
        return nombreUsuario;
    }
     
      public static int devolversucursal(String usuario){
        
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        int numerosucursal=0;
        try {

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM usuario WHERE usuario.nombre = '" + usuario + "'";

            ResultSet rs = miEstatement.executeQuery(SQL);

            if (rs.next()) {
             numerosucursal= rs.getInt("id_sucursal");
               
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.out.println("No conecta" + e.getMessage());
        }
        
        return numerosucursal;
    }
      
       public String devolverNombSucursal(int sucursalID) {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        String NombreSucursal = null ;
        try {

            Statement miEstatement = miConexion.createStatement();

            String SQL = "SELECT * FROM sucursal WHERE sucursal.id_sucursal = '" + sucursalID + "'";

            ResultSet rs = miEstatement.executeQuery(SQL);

            if (rs.next()) {
                NombreSucursal = rs.getString("nombre_Local");

            } 

        } catch (SQLException e) {
            System.out.println("No conecta" + e.getMessage());
        }

        return NombreSucursal;
    }
    
       


    
   
    
}
