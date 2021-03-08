package datos;



import conexion.Conectar;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import subPaneles.Eliminar_Pedido;

public class DatosPedido {

    public void guardarPedido(String dir_A_retirarP,String dir_A_dejar,String fecha_retiro,String fecha_entrega,String hora_retiro,String hora_Entrega, String Estado, float precio,int cuit_cadete,int id_cliente ) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO pedido (dir_retirar_pedido,dir_dejar_pedido,fecha_retiro,fecha_entrega,hora_retiro,hora_entrega,estado,precio,cuit_cadete,id_cliente) VALUES ('" + dir_A_retirarP
                + "', '" + dir_A_dejar + "','" + fecha_retiro + "', '" + fecha_entrega + "', '" + hora_retiro+ "', '" +hora_Entrega + "','"+Estado+"', '" + precio + "', '" + cuit_cadete + "','" + id_cliente + "')";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);
    }

    public ResultSet ultimoPedido() throws SQLException {
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "Select * from pedido order by id_pedido desc limit 1";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;
    }
/*
    public void insertarDetallePedido(int id_comida, int id_pedido, int cantidad, float precio) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "INSERT INTO detallepedido (id_comida, id_pedido, cantidad, precio, fecha, estado) VALUES (" + id_comida + ", " + id_pedido + "," + cantidad + "," + precio + ", NOW(), 1)";

        Statement insertar = miConexion.createStatement();

        insertar.executeUpdate(SQL);

    }
*/
    public ResultSet obtenerPedidos() throws SQLException {
      LocalDateTime myDateObj = LocalDateTime.now();  
     System.out.println("Before Formatting: " + myDateObj);  
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    
    String mes= obtenerMes(formattedDate) ;
        int ano = myDateObj.getYear();
        int dia = myDateObj.getDayOfMonth();
        String dia2=obtenerDia(dia);
        System.out.println(dia2);
        final int diaN=Integer.parseInt(dia2);
        
        String diaCompleto= ano +" "+mes+" "+dia2;
        System.out.println(diaCompleto);
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM pedido WHERE (estado = 'Activo' or estado = 'Enviado') and fecha_entrega LIKE '"+diaCompleto+"'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
    public String obtenerDia(int dia){
                
        String dayString;
        
        switch (dia) 
        {
            case 1:  dayString = "01";
                     break;
            case 2:  dayString = "02";
                     break;
            case 3:  dayString = "03";
                     break;
            case 4:  dayString = "04";
                     break;
            case 5:  dayString = "05";
                     break;
            case 6:  dayString = "06";
                     break;
            case 7:  dayString = "07";
                     break;         
            case 8:  dayString = "08";
                    break;
            case 9:  dayString = "09";
                    break;         
                     
            default: dayString = "00";
                     break;
        }
        
        return dayString;
    }
    
    
    
    
    
    public ResultSet obtenerPedidosMenuPed(String Estado) throws SQLException {
      LocalDateTime myDateObj = LocalDateTime.now();  
     System.out.println("Before Formatting: " + myDateObj);  
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM");  
    
    String formattedDate = myDateObj.format(myFormatObj);  
    
    String mes= obtenerMes(formattedDate) ;
        int ano = myDateObj.getYear();
        int dia = myDateObj.getDayOfMonth();
          String dia2=obtenerDia(dia);
        System.out.println(dia2);
        final int diaN=Integer.parseInt(dia2);
        
        String diaCompleto= ano +" "+mes+" "+dia2;
      
        System.out.println(diaCompleto);
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM pedido WHERE estado = '"+Estado+"' and fecha_entrega LIKE '"+diaCompleto+"'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    
    
    
    

      public ResultSet obtenerPedidosPorId(int id) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM pedido WHERE id_pedido ="+id+" AND estado = 'Activo' or estado='Enviado' ";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
      
      
      //metodo viejo
    public ResultSet obtenerPedidosDelDia() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        
        String SQL = "SELECT * FROM pedidos WHERE fecha_hora LIKE '"+sqlDate+"%'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;
    }
    public ResultSet obtenerPedidosPorId(String id) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM pedido WHERE id_pedido ="+id+" AND estado = 'Activo'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
    //
    
     public ResultSet obtenerUltimosPedidos() throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM pedido ORDER BY id_pedido DESC LIMIT 15";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }
     
       public ResultSet obtenerDetallesPorIdPedido(int id_pedido) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM pedido WHERE id_pedido ="+id_pedido;

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;

    }

    public double obtenerMonto(int id_pedido) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT * FROM pedido WHERE id_pedido = " + id_pedido +" AND estado = 'Activo'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        double monto = 0;
        while (rs.next()) {

            monto = monto + rs.getDouble("precio");
        }
        return monto;
    }

    public void ActualizarEstadoPedido(int id_pedido, String estadoPedido) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE pedido SET estado = '" + estadoPedido + "' WHERE id_pedido = " + id_pedido;

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }
    
    public void ActualizarEstadoPedidoCancelado(int id_pedido) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "UPDATE pedido SET estado = 'Cancelado' WHERE id_pedido = " + id_pedido;

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
    }

    //no la uso todavia, despues ver que se puede hacer con esto!!!!
    public ResultSet obtenerTarifaEnvio(int id_pedido) throws SQLException {

        Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT tarifaE FROM zonas z join clientes c join pedidos p WHERE p.id_pedido ="+id_pedido;

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);

        return rs;
    }
    
    // VOY A USAR ESTE METODO PARA DECIR QUE EL PEDIDO ESTA ENTREGADO
   public void eliminarDetallesPedido(Eliminar_Pedido modelo)throws SQLException {
       Conectar con = new Conectar();
        Connection miConexion = con.conexion();
        int id_pedido=Integer.parseInt(modelo.Codigo_EP.getText());
        String estado = modelo.ingresar_Estado_P2.getSelectedItem().toString();
        String SQL = "UPDATE pedido SET estado = '"+estado+"' WHERE id_pedido = " + id_pedido;

        Statement modificar = miConexion.createStatement();

        modificar.executeUpdate(SQL);
   }
   
/* este metodo solo cuenta como uno cada comida vendida en el pedido (No uso)
   public int obtenerCantidadVendida(int idComida) throws SQLException{
       Conectar con = new Conectar();
        Connection miConexion = con.conexion();

        String SQL = "SELECT COUNT(*) as total FROM detallepedido WHERE id_comida ="+idComida;

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        rs.first();
        return rs.getInt("total");
   }*/
   
   //el modulo que sigue no los uso. !! ! ! !! ! !
   public ResultSet obtenerPeriodoParaComidasMasVendidas(String desde, String hasta) throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
         
        String SQL = "SELECT * FROM detallepedido WHERE fecha >= '"+desde+"' AND fecha <= '"+hasta+"' AND estado = 1";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        return rs;
   }
   
   //OBTENGO LOS PEDIDOS QUE SE HICIERON EN UN PERIODO X DE TIEMPO....
   
   public ResultSet obtenerPeriodoPedidos(String desde, String hasta) throws SQLException{
        Conectar con = new Conectar();
        Connection miConexion = con.conexion();
         
        String SQL = "SELECT * FROM pedido WHERE fecha_entrega >= '"+desde+"' AND fecha_entrega <= '"+hasta+"' AND estado = 'Entregado' or estado ='Cancelado'";

        Statement miEstatement = miConexion.createStatement();

        ResultSet rs = miEstatement.executeQuery(SQL);
        return rs;
   }

    public void guardarPedido(String diaAR, String dir_AD, java.util.Date fecha_A_rP, java.util.Date fecha_A_dP, String text, String text0, String trim, Float valueOf, int parseInt, int cliente_ingreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String obtenerMes(String mesC){
        String mes="";
 
       switch (mesC) 
        {
            case "ene":  mes = "enero";
                     break;
            case "feb":   mes = "febrero";
                     break;
            case "mar":   mes = "marzo";
                     break;
            case "abr":   mes = "abril";
                     break;
            case "may":   mes = "mayo";
                     break;
            case "jun":   mes= "junio";
                     break;
            case "jul":   mes = "julio";
                     break;
                     
                     
            case "ago":   mes = "agosto";
                     break;         
                
            case "sep": mes = "septiembre";
                     break;
                      
           case "oct": mes = "octubre";
                     break;          
                     
           case "nov": mes = "noviembre";
                     break;                     
                     
           case "dic": mes = "diciembre";
              break;   
              
              
            default:  mes = "00";
                     break;
                     
        }
        
        
        return mes;
    }
}
