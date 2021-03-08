/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


import datos.DatosCliente;
import datos.DatosPedido;
import datos.DatosZona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paneles.pnlCollection;
import paneles.pnlFeeBack;
import paneles.pnlHome;
import subPaneles.Modificar_Cliente;
import static subPaneles.Modificar_Cliente.jLabel2;
import static subPaneles.Modificar_Cliente.jLabel3;
import static subPaneles.Modificar_Cliente.jLabel4;
import static subPaneles.Modificar_Cliente.jLabel5;
import static subPaneles.Modificar_Cliente.jLabel6;
import static subPaneles.Modificar_Cliente.jLabel7;
import static subPaneles.Modificar_Cliente.jLabel8;
import static subPaneles.Modificar_Cliente.jLabel9;
import subPaneles.Registro_Clientes;
import subPaneles.Ver_Cliente;

/**
 *
 * @author ALAN
 */
public class ControlCliente {

   public void actualizarTablaClientes(pnlFeeBack grafico) throws SQLException {

        DatosCliente GCli = new DatosCliente();

        ResultSet clientes = GCli.obtenerClientes();

        grafico.model = new DefaultTableModel();

        grafico.model.setColumnIdentifiers(new Object[]{"Telefono", "Nombre", "Apellido", "Barrio"});

        while (clientes.next()) {
            grafico.model.addRow(new Object[]{clientes.getString("telefono"), clientes.getString("nombre"), clientes.getString("apellido"), clientes.getString("barrio")});
        }

        grafico.tabla_clientes.setModel(grafico.model);

    }


    public void agregarCliente(Registro_Clientes grafico) throws SQLException {

        String telefono;
        String nombre;
        String apellido;
        String tipo = null;
        String barrio;
        String calle;
        String zona;
        String sucursal;
        
        tipo=grafico.Tipo_cliente.getSelectedItem().toString().trim();
        telefono = grafico.Tel_cliente.getText().trim();
        nombre = grafico.Nombre_cliente.getText().trim();
        apellido = grafico.Apellido_cliente.getText().trim();
        barrio = grafico.Barrio_cliente.getText().trim();
        calle = grafico.Direccion_cliente.getText().trim();
        zona = grafico.Zona_cliente.getText().trim();
        sucursal = grafico.ID_SUCURSAL_CLIENTE.getText();
      
        
        
         //String zona = grafico.zonas.getSelectedItem().toString().trim();
        

        if (telefono.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || barrio.isEmpty() || calle.isEmpty()) {
            JOptionPane.showMessageDialog(grafico, "Debes completar todos los datos", "Error", 0);
            return;
        }

        long tel;

        try {
            tel = Long.parseLong(telefono);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(grafico, "No se ingreso el telefono correctamente", "Error", 0);
            e.getMessage();
            return;
        }
       //VEEEEEEEEER ESTOO!!!
       
       
       
        
        DatosCliente GCli = new DatosCliente();
       
     
               
                //GCli.insertarCliente(tel, nombre, apellido, barrio, calle, id_zona.getInt("IDZona"));
                int zona_int=Integer.parseInt(zona);
                int sucursal_int=Integer.parseInt(sucursal);
                GCli.insertarCliente(tipo, nombre, apellido, tel, calle, barrio,zona_int, sucursal_int);
                
                
                JOptionPane.showMessageDialog(grafico, "Se inserto correctamente", "Registrado", 1);
               /* actualizarTablaClientes(pnlFeeBack.tabla_clientes);*/
 
           
            
       

    }
    
    public void eliminarCliente(Ver_Cliente grafico) throws SQLException {

        //int item = grafico.Tabla_pro.getSelectedRow();
        // System.out.println("" + grafico.jTable1.getValueAt(item, 0));

           // String Nombre = grafico.Tabla_pro.getValueAt(item, 1).toString();

           // System.out.println("" + Nombre);

            DatosCliente GC = new DatosCliente();
           //Ver esto String Nombre= grafico.Ingrese_Telefono.getText();
         //   GC.eliminarCliente(Nombre);

            //actualizarTablaClientes(grafico);
            JOptionPane.showMessageDialog(grafico, "Se elimino correctamente", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        


    }
    
    public void ModificarCliente(Modificar_Cliente grafico) throws SQLException{
        
        //int item = grafico.jTable1.getSelectedRow();
        // System.out.println("" + grafico.jTable1.getValueAt(item, 0));
/*
        if (item == -1) {
           JOptionPane.showMessageDialog(grafico, "Debes seleccionar un cliente", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {

            String Nombre = grafico.jTable1.getValueAt(item, 1).toString();
            //HAY UN PROBLEMA CON ESTO.... 
           //EN EL CASO QUE EXISTAN DOS PERSONAS CON EL MISMO NOMBRE....
           
*/
           DatosCliente GC = new DatosCliente();
           String telefono= grafico.Ingrese_Tel_Mod.getText();
           long telefono1=Long.parseLong(telefono);
           ResultSet cliente = GC.BuscarCliente(telefono1);
            System.out.println("llego");
            while(cliente.next()){
                System.out.println("llego1");
              /*  Modificar_Cliente MC = new Modificar_Cliente(cliente);
                MC.setVisible(true);*/
                grafico.Modificar_Tel.setText(telefono);
                grafico.Modificar_Nombre.setText(cliente.getString("nombre"));
                grafico.Modificar_Apellido.setText(cliente.getString("apellido"));
                grafico.Modificar_Direccion.setText(cliente.getString("domicilio"));
                grafico.Modificar_Zona.setText(cliente.getString("id_zona"));
                grafico.Modificar_Tipo.setSelectedItem(cliente.getString("tipo"));
                grafico.Modificar_Barrio.setText(cliente.getString("barrio"));
                grafico.Modificar_Barrio1.setText(cliente.getString("id_sucursal"));
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel6.setVisible(true);
                jLabel7.setVisible(true);
                jLabel8.setVisible(true);
                jLabel9.setVisible(true);
                
                
                
            }
        }
    
    
       public void ActualizarCliente(Modificar_Cliente grafico) throws SQLException{
        String nombre;
        String telefono;
        String barrio;
        String calle;
        String apellido;
        String Tipo;
        String zona;
          String sucursal;
        double tel = -1;
        
        nombre = grafico.Modificar_Nombre.getText().trim();
        apellido=grafico.Modificar_Apellido.getText().trim();
        telefono = grafico.Modificar_Tel.getText().trim();
        barrio = grafico.Modificar_Barrio.getText().trim();
        calle = grafico.Modificar_Direccion.getText().trim();
        Tipo = grafico.Modificar_Tipo.getSelectedItem().toString().trim();
        zona = grafico.Modificar_Zona.getText().trim();
        sucursal = grafico.Modificar_Barrio1.getText().trim();
        if (telefono.isEmpty() || barrio.isEmpty() || calle.isEmpty()) {
            JOptionPane.showMessageDialog(grafico, "Debes completar todos los datos", "Error", 0);
            return;
        }
        
        
        try{
            tel = Double.parseDouble(telefono);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(grafico, "El telefono se ingreso incorrectamente", "Error", 0);
            return;
        }
        
        
        DatosCliente GC = new DatosCliente();
      
           int zona_int=Integer.parseInt(zona);
           int sucursal_int= Integer.parseInt(sucursal);
            GC.ModificarCliente(Tipo, nombre, apellido, (long) tel, calle, barrio, zona_int, sucursal_int);
        
        
        JOptionPane.showMessageDialog(grafico, "El cliente se modifico correctamente", "Modificado", 1);
        
      
        grafico.dispose();
        
    }
       
    
       public void actualizarTablaPedidos(pnlHome grafico) throws SQLException {

        DatosPedido GP = new DatosPedido();
        DatosCliente GC = new DatosCliente();

        ResultSet pedidos = GP.obtenerPedidos();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id Pedido");
       model.addColumn("Dir Retiro");
       model.addColumn("Dir Entrega ");
       model.addColumn("Fecha Retiro");
       model.addColumn("Fecha Entrega");
       model.addColumn("Hora Retiro");
       model.addColumn("Hora Entrega");
       model.addColumn("Estado");
        model.addColumn("Precio");
       pnlHome.Tabla_pro.setModel(model);
       String[] dato= new String [9];
       
        try {
            //Ejecutemos la query
           
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(pedidos.next()){
                dato[0]=pedidos.getString(1);
                dato[1]=pedidos.getString(2);
                dato[2]=pedidos.getString(3);
                dato[3]=pedidos.getString(4);
                dato[4]=pedidos.getString(5);
                dato[5]=pedidos.getString(6);
                dato[6]=pedidos.getString(7);
                dato[7]=pedidos.getString(9);
                dato[8]=pedidos.getString(10);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
       
    public void actualizarTablaClientes() throws SQLException {
     
        
     
        DatosCliente GC = new DatosCliente();

        ResultSet cliente = GC.obtenerClientes();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cod Cliente");
       model.addColumn("Nombre");
       model.addColumn("Apellido");
       model.addColumn("Telefono");
       model.addColumn("Ubicacion");
       model.addColumn("Barrio");
       model.addColumn("Zona");

       pnlFeeBack.tabla_clientes.setModel(model);
      
       String[] dato= new String [7];
       
        try {
            //Ejecutemos la query
           
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(cliente.next()){
                dato[0]=cliente.getString(1);
                dato[1]=cliente.getString(3);
                dato[2]=cliente.getString(4);
                dato[3]=cliente.getString(5);
                dato[4]=cliente.getString(6);
                dato[5]=cliente.getString(7);
                dato[6]=cliente.getString(8);
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
       
       
       
       
    }
    /*
 

*/


