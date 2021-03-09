package controladores;


import datos.DatosCadete;
import datos.DatosCaja;
import datos.DatosCliente;
import datos.DatosPedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import paneles.pnlCollection;
import paneles.pnlHome;
import subPaneles.Cliente_NoEncontrado;
import subPaneles.Correcto_Registro;
import subPaneles.Listado_Pedidos;
import static subPaneles.Modificar_Cliente.jLabel2;
import static subPaneles.Modificar_Cliente.jLabel3;
import static subPaneles.Modificar_Cliente.jLabel4;
import static subPaneles.Modificar_Cliente.jLabel5;
import static subPaneles.Modificar_Cliente.jLabel6;
import static subPaneles.Modificar_Cliente.jLabel7;
import static subPaneles.Modificar_Cliente.jLabel8;
import static subPaneles.Modificar_Cliente.jLabel9;
import subPaneles.Modificar_Pedido;
import subPaneles.Registro_Pedido_Nuevo;
import subPaneles.Registro_Pedido_Nuevo_otro;
import static subPaneles.Registro_Pedido_Nuevo_otro.tabladecomida;
import subPaneles.TicketImprimir;
import subPaneles.Ver_Cliente;

public class ControlPedido {

    public int id_cliente;
    
    /*
     public void popupTablaPedidoNuevo(GestionEmpleado grafico){
        JPopupMenu popup = new JPopupMenu();
        
        JMenuItem item = new JMenuItem("Quitar Comida", new ImageIcon(getClass().getResource("/ICONOS/eliminar.png")));
        
        item.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                comidaCancelada(grafico);
            }
        });
        
        popup.add(item);
        grafico.pedidos.setComponentPopupMenu(popup);
        
    }
     */
    /*
     public void popupTablaPedidos(GestionEmpleado grafico) throws SQLException{
        JPopupMenu popup = new JPopupMenu();
        
        JMenuItem item = new JMenuItem("Ver/Modificar Pedido", new ImageIcon(getClass().getResource("/ICONOS/VerPedido.png")));
        JMenuItem item1 = new JMenuItem("Cancelar Pedido", new ImageIcon(getClass().getResource("/ICONOS/eliminar.png")));
        JMenuItem item2 = new JMenuItem("Pedido Pagado", new ImageIcon(getClass().getResource("/ICONOS/pagado.png")));
        JMenuItem item3 = new JMenuItem("Pedido NO Pagado", new ImageIcon(getClass().getResource("/ICONOS/No_pagado.png")));
        
        item.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                verModificarPedido(grafico);
            }
        });
        
        item1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pedidoCancelado(grafico);
            }
        });
        
        item2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    pedidoPagado(grafico);
                } catch (SQLException ex) {
                    Logger.getLogger(ControlPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        item3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    pedidoNoPagado(grafico);
                } catch (SQLException ex) {
                    Logger.getLogger(ControlPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        popup.add(item);
        popup.add(item1);
        popup.add(item2);
        popup.add(item3);
        grafico.ultimosPedidos.setComponentPopupMenu(popup);
        
    }
     */
    /*
     public void verModificarPedido(GestionEmpleado grafico){
         int item = grafico.ultimosPedidos.getSelectedRow();
                String id_pedido = grafico.ultimosPedidos.getValueAt(item, 0).toString();
                
                VerPedido ver;
                try {
                    ver = new VerPedido(id_pedido);
                    ver.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ControlPedido.class.getName()).log(Level.SEVERE, null, ex);
                }
     }
*/
    public void ValidarCliente(Modificar_Pedido Grafico) {

        String telIngresado = Grafico.Telefono_MP.getText().trim();

        if (telIngresado.isEmpty()) {
            JOptionPane.showMessageDialog(Grafico, "No se ingreso el telefono", "Error",0);
            return;
        }

        long numero;
        try {
            numero = Long.parseLong(telIngresado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Grafico, "No se ingreso el telefono correctamente", "Error", 0);
            e.getMessage();
            return;
        }

        DatosCliente c = new DatosCliente();

        ResultSet cliente = c.BuscarClienteTelefono(numero);

        try {

            if (!cliente.first()) {
                Grafico.Registro_MP.setEnabled(true);
               
                Grafico.cliente_No_existe.setText("Cliente inexistente, Vuelva a ingresar");
            } else {

                Ver_Cliente VP = new Ver_Cliente();
                VP.setVisible(true);
                VP.Modificar_Tel.setText(telIngresado);
                VP.Modificar_Nombre.setText(cliente.getString("nombre"));
                VP.Modificar_Apellido.setText(cliente.getString("apellido"));
                VP.Modificar_Direccion.setText(cliente.getString("domicilio"));
                VP.Modificar_Barrio.setText(cliente.getString("barrio"));
                VP.Modificar_Tipo.setSelectedItem(cliente.getString("tipo"));
                VP.Modificar_Zona.setText(cliente.getString("id_zona"));
                
                //Mostrar Listado Pedidos Falta
            }
        } catch (SQLException ex) {
            System.out.println("error en clientefirst...." + ex.getMessage());
        }
    }

 public void ValidarClientePNUEVO(Registro_Pedido_Nuevo Grafico) {

        String telIngresado = Grafico.Ingrese_telefono_NP.getText().trim();

        if (telIngresado.isEmpty()) {
            JOptionPane.showMessageDialog(Grafico, "No se ingreso el telefono", "Error",0);
            return;
        }

        long numero;
        try {
            numero = Long.parseLong(telIngresado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Grafico, "No se ingreso el telefono correctamente", "Error", 0);
            e.getMessage();
            return;
        }

        DatosCliente c = new DatosCliente();

        ResultSet cliente = c.BuscarClienteTelefono(numero);

        try {

            if (!cliente.first()) {
               
                Grafico.cliente_No_Exite_RP.setText("Cliente inexistente, Vuelva a ingresar");
            } else {

                Grafico.cliente_No_Exite_RP.setVisible(false);
                Grafico.Nombre_RP.setText(cliente.getString("nombre"));
                Grafico.Apellido_RP1.setText(cliente.getString("apellido"));
                Grafico.Domicilio_RP.setText(cliente.getString("domicilio"));

                
                //Mostrar Listado Pedidos Falta
            }
        } catch (SQLException ex) {
            System.out.println("error en clientefirst...." + ex.getMessage());
        }
    }


    public void insertarPedido(Registro_Pedido_Nuevo Grafico) throws SQLException {

        long telefono =  Long.parseLong(Grafico.Ingrese_telefono_NP.getText().trim());
        System.out.println(telefono);
       DatosCliente GC = new DatosCliente();
       DatosPedido GP = new DatosPedido();
            //verificar
          

            ResultSet cliente = GC.BuscarCliente(telefono);
            //cliente.getInt("id_cliente") obtener campo de cliente
            while (cliente.next()) {
                System.out.println(Grafico.ingresar_DirR_P.getText());
                System.out.println(Grafico.ingresar_DirA_P.getText());
                System.out.println(Grafico.ingresar_HR_P.getText());
                System.out.println(Grafico.ingresar_HD_P.getText());
                System.out.println(Grafico.Area_Descripcion_P.getText());
                System.out.println(Grafico.EstadoPed.getSelectedItem().toString().trim());
                System.out.println(Grafico.Final_Precio_P.getText());
                System.out.println(Grafico.ingresar_HD_P1.getText());
                System.out.println(cliente.getInt("id_cliente"));
               // GP.guardarPedido(Grafico.ingresar_DirR_P.getText(),Grafico.ingresar_DirA_P.getText(),Grafico.ingresar_HR_P.getText(),Grafico.ingresar_HD_P.getText(),Grafico.Area_Descripcion_P.getText(),Grafico.ingresar_Estado_P.getSelectedItem().toString().trim(),Float.valueOf(Grafico.Final_Precio_P.getText()),Integer.parseInt(Grafico.ingresar_HD_P1.getText()),(int)cliente.getInt("id_cliente"));
            }   
            int ultimo_P = -1;
            ResultSet ultimoPedido = GP.ultimoPedido();
            while (ultimoPedido.next()) {
                ultimo_P = ultimoPedido.getInt("id_pedido");
            }
            // hasta aqui
           

             Correcto_Registro x = new Correcto_Registro();
             x.setVisible(true);
              
         

        
    }
    
     public void insertarPedidoPrueba(Registro_Pedido_Nuevo_otro Grafico) throws SQLException {

        long telefono =  Long.parseLong(Grafico.Ingrese_telefono_NP.getText().trim());
         System.out.println(telefono);
        System.out.println(telefono);
       
        String formatoFecha= "yyyy MMMM dd";
        Date fechaD=Grafico.recuperarfecha.getDate();
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
        
        
        Date fechaR=Grafico.recuperarfecha2.getDate();
        SimpleDateFormat formateador2 = new SimpleDateFormat(formatoFecha);
        
                
                
                
                
         DatosCliente GC = new DatosCliente();
         DatosPedido GP = new DatosPedido();
         DatosCadete GCad= new DatosCadete();
         ResultSet cadete = GCad.buscarCadetePorNombre(Registro_Pedido_Nuevo_otro.ingresar_Cadete_P.getSelectedItem().toString().trim());
        int cadeteId=0;
         while(cadete.next()){
          
           cadeteId=cadete.getInt("cuit_cadete");
          
          }
         
        

        //verificar
          
               String dir_AD=Grafico.ingresar_DirA_P.getText().trim();
                String diaAR=Grafico.ingresar_DirA_P1.getText().trim();
             
                String fecha_A_rP=formateador.format(fechaD);
                String fecha_A_dP=formateador.format(fechaD);
                String Estadod2= Grafico.ingresar_Estado_P2.getSelectedItem().toString();
                System.out.println(fecha_A_dP);
                System.out.println(fecha_A_dP);
                
                
            ResultSet cliente = GC.BuscarCliente(telefono);
            //cliente.getInt("id_cliente") obtener campo de cliente
            while (cliente.next()) {
               
            
                int cliente_ingreso=cliente.getInt("id_cliente");
              
                GP.guardarPedido(diaAR,dir_AD,fecha_A_rP,fecha_A_dP,Grafico.ingresar_HR_P.getText(),Grafico.ingresar_HD_P.getText(),Estadod2,Float.valueOf(Grafico.Final_Precio_P.getText()),cadeteId,cliente_ingreso);
            
           }   //problema en las fechas
            int ultimo_P = -1;
            ResultSet ultimoPedido = GP.ultimoPedido();
            while (ultimoPedido.next()) {
                ultimo_P = ultimoPedido.getInt("id_pedido");
              
            }
            // hasta aqui
             String ultimo_p2=Integer.toString(ultimo_P);
           
             DatosCaja  dc = new DatosCaja();
             float sumand1=Float.parseFloat(Grafico.Final_Precio_P.getText());

              ResultSet caja = dc.buscarCajaAbierta();
              if(caja.first()){
                  float sumand2= caja.getFloat("monto_final");
                  float suma = sumand1 + sumand2;
                   dc.actualizarMontoTotal(suma);
                 
                 
              } 
         /*
           Correcto_Registro x = new Correcto_Registro();
             
            
             x.ER_ID_PEDIDO.setText(ultimo_p2);
             x.setVisible(true);
             */
             TicketImprimir ti = new TicketImprimir();
             ti.NumbPed.setText(ultimo_p2);
             ti.NombRes.setText("Restaurante Nombre");
             ti.Fecha.setText(fecha_A_rP);
             ti.IdCli.setText(Grafico.Ingrese_telefono_NP.getText().trim());
             ti.DirCli.setText(dir_AD);
             ti.DeliveryCost.setText(Registro_Pedido_Nuevo_otro.Final_Precio_P1.getText());
             ti.zonat.setText(Registro_Pedido_Nuevo_otro.ingresar_Zona.getSelectedItem().toString());
             ti.TotalCost.setText(Registro_Pedido_Nuevo_otro.Final_Precio_P.getText());
          
             
             int contadorP=tabladecomida.getRowCount();
             int i = 0;
            
              ti.NombPed1.setText(tabladecomida.getValueAt(0, 1).toString());
              ti.Cant1.setText(tabladecomida.getValueAt(0, 2).toString());
              ti.precio1.setText(tabladecomida.getValueAt(0, 3).toString());
              
              ti.NombPed2.setText(tabladecomida.getValueAt(1, 1).toString());
              ti.Cant2.setText(tabladecomida.getValueAt(1, 2).toString());
              ti.precio2.setText(tabladecomida.getValueAt(1, 3).toString());
            
              ti.NombPed3.setText(tabladecomida.getValueAt(2, 1).toString());
              ti.Cant3.setText(tabladecomida.getValueAt(2, 2).toString());
              ti.precio3.setText(tabladecomida.getValueAt(2, 3).toString());
            
             
             
             
             
             
             
          
             ti.setVisible(true);
          ControlPagoCadete gt = new ControlPagoCadete();
          gt.AgregarPagoCadete();
         

        
    }
     
     
     
     
     
     
     
     
     
     public void ValidarClientePNUEVO_prueba(Registro_Pedido_Nuevo_otro Grafico) {

        String telIngresado = Grafico.Ingrese_telefono_NP.getText().trim();

        if (telIngresado.isEmpty()) {
            JOptionPane.showMessageDialog(Grafico, "No se ingreso el telefono", "Error",0);
            return;
        }

        long numero;
        try {
            numero = Long.parseLong(telIngresado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Grafico, "No se ingreso el telefono correctamente", "Error", 0);
            e.getMessage();
            return;
        }

        DatosCliente c = new DatosCliente();

        ResultSet cliente = c.BuscarClienteTelefono(numero);

        try {

            if (!cliente.first()) {
               
                //Grafico.cliente_No_Exite_RP.setText("Cliente inexistente, Vuelva a ingresar");
                
                Cliente_NoEncontrado client2e = new Cliente_NoEncontrado();
                client2e.setVisible(true);
                
            } else {

                Grafico.cliente_No_Exite_RP.setVisible(false);
                Grafico.Nombre_RP.setText(cliente.getString("nombre"));
                Grafico.Apellido_RP1.setText(cliente.getString("apellido"));
                Grafico.Domicilio_RP.setText(cliente.getString("domicilio"));

                
                //Mostrar Listado Pedidos Falta
            }
        } catch (SQLException ex) {
            System.out.println("error en clientefirst...." + ex.getMessage());
        }
    }

    
    public void insertarPedidoModificado(Modificar_Pedido Grafico) throws SQLException {

        DatosCliente GC = new DatosCliente();
        DatosPedido GP = new DatosPedido();
       

        
        int telefono = (int) Long.parseLong(Grafico.Telefono_MP.getText().trim());
      
            //verificar
          

            ResultSet cliente = GC.BuscarCliente(telefono);
            //cliente.getInt("id_cliente") obtener campo de cliente
            while (cliente.next()) {
                //GP.guardarPedido(Grafico.ingresar_DirR_P.getText(),Grafico.ingresar_DirA_P.getText(),Grafico.ingresar_HR_P.getText(),Grafico.ingresar_HD_P.getText(),Grafico.Area_Descripcion_P.getText(),Grafico.EstadoPed.getSelectedItem().toString().trim(),Float.valueOf(Grafico.Final_Precio_P.getText()),Integer.parseInt(Grafico.SeleccionarCadete.getSelectedItem().toString().trim()),(int)cliente.getInt("id_cliente"));
            } 
        
    
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
    public void actualizarTablaPedidosMenuPedidosPendientes() throws SQLException {
     
        
        DatosPedido GP = new DatosPedido();
        DatosCliente GC = new DatosCliente();

        ResultSet pedidos = GP.obtenerPedidosMenuPed("Activo");

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
       pnlCollection.TablaPedido_pendiente.setModel(model);
      
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
    public void actualizarTablaPedidosMenuPedidosEnP() throws SQLException {
     
        
        DatosPedido GP = new DatosPedido();
        DatosCliente GC = new DatosCliente();

        ResultSet pedidos = GP.obtenerPedidosMenuPed("En Preparacion");

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
      pnlCollection.Tablapedido_EnPrep.setModel(model);
      
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
    
    public void actualizarTablaPedidosMenuPedidosEnviados() throws SQLException {
     
        
        DatosPedido GP = new DatosPedido();
        DatosCliente GC = new DatosCliente();

        ResultSet pedidos = GP.obtenerPedidosMenuPed("Enviado");

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
      pnlCollection.Tablapedido_Enviados.setModel(model);
      
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
    public void actualizarTablaPedidos3() throws SQLException {
       
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
      public void actualizarTablaPedidos2(Listado_Pedidos grafico) throws SQLException {

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
       grafico.Tabla_pro.setModel(model);
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //metodo viejo
    
    /*
    public void actualizarTablaPedidosDiario(GestionDueño grafico) throws SQLException{
        
        GestionPedido GP = new GestionPedido();
        GestionCliente GC = new GestionCliente();

        ResultSet pedidos = GP.obtenerPedidosDelDia();

        grafico.model = new DefaultTableModel();

        grafico.model.setColumnIdentifiers(new Object[]{"Pedidos", "Clientes", "Montos"});

        while (pedidos.next()) {
            ResultSet cliente = GC.BuscarClienteID(pedidos.getInt("id_cliente"));
            double monto = GP.obtenerMonto(pedidos.getInt("id_pedido"));
            while (cliente.next()) {
                grafico.model.addRow(new Object[]{pedidos.getString("id_pedido"), cliente.getString("nombre"), monto});
            }
        }

        grafico.jTable1.setModel(grafico.model);
    }
    
    
    //
    
     public void actualizarTablaUltimosPedidos(GestionDueño grafico) throws SQLException{
        
        GestionPedido GP = new GestionPedido();
        GestionCliente GC = new GestionCliente();
        GestionComida GCo = new GestionComida();
        ResultSet pedidos = GP.obtenerUltimosPedidos();

        grafico.model.setColumnIdentifiers(new Object[]{"Num. Pedido", "Comida", "Cantidad", "Estado", "Precio Total"});

        while (pedidos.next()) {
            ResultSet detalle = GP.obtenerDetallesPorIdPedido(pedidos.getInt("id_pedido"));
            while(detalle.next()){
                ResultSet comida = GCo.BuscarComidaID(detalle.getString("id_comida"));
                while(comida.next()){
                    grafico.model.addRow(new Object[]{pedidos.getString("id_pedido"), comida.getString("nombre"), detalle.getString("cantidad"),pedidos.getString("estadoP"), detalle.getString("precio")});
                }
            }
        }

        grafico.jTable1.setModel(grafico.model);
    }
    

    public void EnviarPedido(GestionEmpleado grafico) throws SQLException {
        
        int item = grafico.ultimosPedidos.getSelectedRow();

        if (item == -1) {
            JOptionPane.showMessageDialog(grafico, "Debes seleccionar un pedido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {

            String numero_pedido = grafico.ultimosPedidos.getValueAt(item, 0).toString();
            String montoTotal = grafico.ultimosPedidos.getValueAt(item, 3).toString();

            int num_pedido = Integer.parseInt(numero_pedido);
            double montoT = Double.parseDouble(montoTotal);
            
            SeleccionarCadete SC = new SeleccionarCadete(num_pedido, montoT, grafico);
            SC.setVisible(true);
        }
    }
    
     public void pedidoPagado(GestionEmpleado grafico) throws SQLException{
        
        int item = grafico.ultimosPedidos.getSelectedRow();

        if (item == -1) {
            JOptionPane.showMessageDialog(grafico, "Debes seleccionar un pedido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if(grafico.ultimosPedidos.getValueAt(item, 1).toString().equals("Enviado")){
                String numero_pedido = grafico.ultimosPedidos.getValueAt(item, 0).toString();

                int num_pedido = Integer.parseInt(numero_pedido);

                GestionPedido GP = new GestionPedido();
                GestionCadete GCA = new GestionCadete();
                GestionTicket GTI = new GestionTicket();
                GestionCaja GC = new GestionCaja();
                
                ResultSet ticket = GTI.obtenerTicketPorIdPedido(num_pedido);

                while(ticket.next()){
                    GCA.ActualizarEstadoCadete(ticket.getInt("DNICadete"), "Disponible");
                    double montoT=ticket.getDouble("montoT")+ticket.getDouble("tarifaE");
                    ResultSet caja = GC.buscarCajaAbierta();
                    if(caja.first()){
                        montoT += caja.getDouble("monto_final");
                        GC.actualizarMontoTotal(montoT);
                    }else{
                        JOptionPane.showMessageDialog(grafico, "No se inicio la caja", "Error", 0);
                        AbrirCaja AC = new AbrirCaja();
                        AC.setVisible(true);
                        return;
                    }

                    GP.ActualizarEstadoPedido(num_pedido, "Pagado");
                    JOptionPane.showMessageDialog(grafico, "El pedido fue pagado", "Pagado", 1);
                    actualizarTablaPedidos(grafico);
                }
             }else{
                JOptionPane.showMessageDialog(grafico, "Debes enviar el pedido", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }   
        }
    }
     
     public void pedidoNoPagado(GestionEmpleado grafico) throws SQLException{
         int item = grafico.ultimosPedidos.getSelectedRow();

        if (item == -1) {
            JOptionPane.showMessageDialog(grafico, "Debe seleccionar un pedido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if(grafico.ultimosPedidos.getValueAt(item, 1).toString().equals("Enviado")){
                
                String numero_pedido = grafico.ultimosPedidos.getValueAt(item, 0).toString();

                int num_pedido = Integer.parseInt(numero_pedido);

                GestionPedido GP = new GestionPedido();
                GestionCadete GCA = new GestionCadete();
                GestionTicket GTI = new GestionTicket();
                GestionCaja GC = new GestionCaja();
                
                ResultSet ticket = GTI.obtenerTicketPorIdPedido(num_pedido);

                while(ticket.next()){
                    GCA.ActualizarEstadoCadete(ticket.getInt("DNICadete"), "Disponible");
                    ResultSet caja = GC.buscarCajaAbierta();
                    if(caja.first()){
                        GTI.TicketNoPagado(ticket.getString("id_ticket"));
                        
                    }else{
                        JOptionPane.showMessageDialog(grafico, "No se inicio la caja", "Error", 0);
                        AbrirCaja AC = new AbrirCaja();
                        AC.setVisible(true);
                        return;
                    }

                    GP.ActualizarEstadoPedido(num_pedido, "No Pagado");
                    JOptionPane.showMessageDialog(grafico, "El pedido NO fue pagado", "No Pagado", 1);
                    actualizarTablaPedidos(grafico);
                }
            }else{
                JOptionPane.showMessageDialog(grafico, "Debes enviar el pedido", "Advertencia", JOptionPane.WARNING_MESSAGE);
                
            }       
        }
     }
     
     public void pedidoCancelado(GestionEmpleado grafico){
         int item = grafico.ultimosPedidos.getSelectedRow();
         
        if (item == -1) {
            JOptionPane.showMessageDialog(grafico, "Debes seleccionar un pedido", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {

            String numero_pedido = grafico.ultimosPedidos.getValueAt(item, 0).toString();

            int num_pedido = Integer.parseInt(numero_pedido);

            GestionPedido GP = new GestionPedido();

            try {
                GP.ActualizarEstadoPedido(num_pedido, "Pedido Cancelado");
                GP.ActualizarEstadoPedidoCancelado(num_pedido);
                GP.eliminarDetallesPedido(numero_pedido);
                JOptionPane.showMessageDialog(grafico, "El pedido fue cancelado", "Advertencia", 1);
                actualizarTablaPedidos(grafico);
            } catch (SQLException ex) {
                Logger.getLogger(GestionEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
   */  
      //Metodo para Ver/ModificarPedido
     public void mostrarPedido(Ver_Cliente grafico, String id_pedido) throws SQLException{
       
       
     }
      public void mostrarPedidosCliente(Ver_Cliente grafico, String id_pedido) throws SQLException{
        
      DatosPedido GP = new DatosPedido();
         
      ResultSet rs = GP.obtenerPedidosPorId(Integer.parseInt(id_pedido));//cambiar esto por int

         
         
         DatosCliente GC = new DatosCliente();
           String telefono= grafico.Modificar_Tel.getText();
           long telefono1=Long.parseLong(telefono);
           ResultSet cliente = GC.BuscarCliente(telefono1);
            System.out.println("llego");
                while(rs.next()){
                    
                
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
              
                
                
                
            }
     }
    /* 
    public void agregarComidaPedido_Modificar(VerPedido Grafico) throws SQLException {
        
            String cant = Grafico.Cantidad.getSelectedItem().toString();

            GestionComida GC = new GestionComida();
            String nombreComida = Grafico.Menu.getSelectedItem().toString();

            ResultSet comida = GC.BuscarComidaNombre(nombreComida);
            
            double monto = Double.parseDouble(Grafico.MontoTotal.getText());
            Grafico.model.setColumnIdentifiers(new Object[]{"Comidas", "Precio por unidad", "Cantidad"});

            while (comida.next()) {
                Grafico.model.addRow(new Object[]{Grafico.Menu.getSelectedItem().toString(), comida.getString("precio"), cant});
                monto += Double.parseDouble(comida.getString("precio"))*Integer.parseInt(cant);
            }
            Grafico.verPedido.setModel(Grafico.model);
            
            Grafico.MontoTotal.setText(String.valueOf(monto));
    }
    
    public void seleccionarCadete(SeleccionarCadete grafico) throws SQLException{
        String cadete = grafico.cadetes.getSelectedItem().toString();
        
        GestionCadete GC = new GestionCadete();
        ResultSet cade  = GC.buscarCadetePorNombre(cadete);
        long dni_cad = 0;
        while(cade.next()){
            GC.ActualizarEstadoCadete(cade.getInt("DNICadete"), "Ocupado");
            dni_cad = cade.getLong("DNICadete");
        }
        
        GestionPedido GP = new GestionPedido();
        GP.ActualizarEstadoPedido(grafico.numPedido, "Enviado");
        ResultSet pedido = GP.obtenerPedidoPorId(String.valueOf(grafico.numPedido));
        
        
        while(pedido.next()){
            GestionCliente GCl = new GestionCliente();
            ResultSet cliente = GCl.BuscarClienteID(pedido.getInt("id_cliente"));
            while(cliente.next()){
                GestionZona GZ = new GestionZona();
                ResultSet zona = GZ.buscarZonaPorID(cliente.getInt("IDZona"));
                while(zona.next()){
                    GestionTicket GT = new GestionTicket();
                    GT.AgregarTicket(grafico.numPedido, dni_cad, grafico.monto, zona.getDouble("tarifaE"));
                }
            }
        }
        
        JOptionPane.showMessageDialog(grafico,"Se Realizo el ticket correctamente", "Listo", 1);
        
        actualizarTablaPedidos(grafico.grafico);
        grafico.dispose();
    }
    
    
    */
}
