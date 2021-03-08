
package datos;

import conexion.Conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatosTicket {
    
     public void AgregarTicket(int id_pedido, long DNICadete, double monto, double tarifa) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO tickets (id_pedido, DNICadete, montoT, tarifaE, estadoT, fecha) VALUES ("+id_pedido+ ","+DNICadete+","+monto+","+tarifa+",1,NOW())";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);

        con.cerrar(miConexion);

    }
     
     public ResultSet obtenerTicketPorIdPedido(int id_pedido) throws SQLException{
          Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM tickets WHERE id_pedido ="+id_pedido+"";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;
     }
    
     public ResultSet obtenerTicketCadete(String dni_cadete) throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM tickets WHERE DNICadete ="+dni_cadete+" AND estadoT = 1";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;
     }
     
     public void ActualizarEstadoTicket(String dni) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE tickets SET estadoT = 0 WHERE DNICadete = "+dni+" AND estadoT = 1";

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
     
      public void TicketNoPagado(String id_ticket) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE tickets SET estadoT = 0 WHERE id_ticket = "+id_ticket;

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
      
      public ResultSet obtenerPeriodoParaEntregasCadetes(String desde, String hasta) throws SQLException{
          Conectar con = new Conectar();
        Connection miConexion = con.conexion();
         
        String SQL = "SELECT * FROM tickets WHERE fecha >= '"+desde+"' AND fecha <= '"+hasta+"' AND estadoT = 1";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        return rs;
      }
}
