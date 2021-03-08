/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;


import conexion.Conectar;
import datos.DatosCliente;
import datos.DatosComida;
import datos.DatosPedido;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paneles.pnlCollection;
import paneles.pnlMarket;
import subPaneles.Registro_Comida_Nueva;
import subPaneles.Registro_Pedido_Nuevo_otro;
import subPaneles.Ver_Cliente;

/**
 *
 * @author ALAN
 */
public class ControlComida {
    
    public void obtenercomida() throws SQLException{
     DatosComida GC = new DatosComida();
     

        ResultSet comidas = GC.obtenerComidas();
        
        //subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Comida.addItem(comidas.getString("nombreComida"));
        
        while(comidas.next()){
            
            subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Comida.addItem(comidas.getString("nombreComida"));
        }
    
    
    
    
    
    }
     public void obtenerBebida() throws SQLException{
         DatosComida GC = new DatosComida();
     

        ResultSet comidas = GC.obtenerBebidas();
        
        //subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Comida.addItem(comidas.getString("nombreComida"));
        
        while(comidas.next()){
            
            subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Bebida.addItem(comidas.getString("nombreComida"));
        }
    
      
    
    
    }
      public void obtenerPostre() throws SQLException{
         DatosComida GC = new DatosComida();
     

        ResultSet comidas = GC.obtenerPostre();
        
        //subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Comida.addItem(comidas.getString("nombreComida"));
        
        while(comidas.next()){
            
            subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Postre.addItem(comidas.getString("nombreComida"));
        }
    
      
    
    
    }
      
    
    
    
    
    public void obtenerzona() throws SQLException{
         DatosComida GC = new DatosComida();
     

        ResultSet zonas = GC.obtenerZonas();
        
        //subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Comida.addItem(comidas.getString("nombreComida"));
        
        while(zonas.next()){
            
            subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Zona.addItem(zonas.getString("nombre"));
        } 
    
    
    }
       public void obtenercadetes() throws SQLException{
         DatosComida GC = new DatosComida();
     

        ResultSet cadete = GC.obtenerCadetes();
       
        //subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Comida.addItem(comidas.getString("nombreComida"));
        
        while(cadete.next()){
            
            subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Cadete_P.addItem(cadete.getString("nombre"));
          
        } 
    
     
    }
    
    
    
    
    
    
    
    
    

    public void AgregarComida(Registro_Comida_Nueva grafico) throws SQLException {

        String nombre;
        String precio;
        String Tipo;
        String Estado;
        String Descripcion;
        nombre = grafico.NombreComida.getText().trim();
        precio = grafico.PrecioComida.getText().trim();
        Estado= grafico.EstadoComida.getSelectedItem().toString();
        Tipo = grafico.TipoComida.getSelectedItem().toString();
        Descripcion= grafico.AreaDescripcionComida.getText();
        String idSucursal= principal.Principal.Sucursal_ID.getText().toString();
        int idsuc=Integer.parseInt(idSucursal);

        if (nombre.isEmpty() || precio.isEmpty()) {
            JOptionPane.showMessageDialog(grafico, "Debes completar todos los datos", "Error", 0);
            return;
        }
        
        float prec = 0;
         try{
            prec = Float.parseFloat(precio);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(grafico, "El precio es incorrecto", "Error", 0);
            return;
        }

        DatosComida GC = new DatosComida();
        GC.AgregarComida(nombre,Tipo,Descripcion,prec,Estado,idsuc);

        JOptionPane.showMessageDialog(grafico, "Se registro correctamente", "Registrado", 1);
        actualizarTablaComida();
        actualizarTablaPostres();
        actualizarTablaBebidas();
      
    }

    public void actualizarTablaComida(Registro_Pedido_Nuevo_otro grafico) throws SQLException {
       
        DatosComida GC = new DatosComida();
        String ComidaRow=(String) grafico.ingresar_Comida.getSelectedItem();
        ResultSet comidas = GC.BuscarComidaNombre(ComidaRow);

       
     
       String[] dato= new String [8];
       
    

           grafico.model.setColumnIdentifiers(new Object[]{"Id Comida", "Nombre", "Cantidad","Precio"});

            while (comidas.next()) {
                grafico.model.addRow(new Object[]{comidas.getString(1), comidas.getString(2),(String) Registro_Pedido_Nuevo_otro.Ingresar_Comida_Cant.getSelectedItem(),comidas.getString(5)});
            }
             Registro_Pedido_Nuevo_otro.tabladecomida.setModel(grafico.model);
            //Ejecutemos la query
           
           
      
       

    }
    public void actualizarTablaComida2(Registro_Pedido_Nuevo_otro grafico) throws SQLException {
       
        DatosComida GC = new DatosComida();
        String ComidaRow=(String) grafico.ingresar_Bebida.getSelectedItem();
        ResultSet comidas = GC.BuscarComidaNombre(ComidaRow);

       
     
       String[] dato= new String [8];
       
    

           grafico.model.setColumnIdentifiers(new Object[]{"Id Comida", "Nombre", "Cantidad","Precio"});

            while (comidas.next()) {
                grafico.model.addRow(new Object[]{comidas.getString(1), comidas.getString(2),(String) Registro_Pedido_Nuevo_otro.ingresar_Bebida_Cant.getSelectedItem(),comidas.getString(5)});
            }
             Registro_Pedido_Nuevo_otro.tabladecomida.setModel(grafico.model);
            //Ejecutemos la query
           
           
      
       

    }
     public void actualizarTablaComida3(Registro_Pedido_Nuevo_otro grafico) throws SQLException {
       
        DatosComida GC = new DatosComida();
        String ComidaRow=(String) grafico.ingresar_Postre.getSelectedItem();
        ResultSet comidas = GC.BuscarComidaNombre(ComidaRow);

       
     
       String[] dato= new String [8];
       
    

           grafico.model.setColumnIdentifiers(new Object[]{"Id Comida", "Nombre", "Cantidad","Precio"});

            while (comidas.next()) {
                grafico.model.addRow(new Object[]{comidas.getString(1), comidas.getString(2),(String) Registro_Pedido_Nuevo_otro.ingresar_Postre_Cant.getSelectedItem(),comidas.getString(5)});
            }
             Registro_Pedido_Nuevo_otro.tabladecomida.setModel(grafico.model);
            //Ejecutemos la query
           
           
      
       

    }
    
    
public void actualizarTablaComida() throws SQLException {
     
        
      
        DatosComida DC= new DatosComida();

        ResultSet comidas = DC.obtenerComidas();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Comida");
       model.addColumn("Nombre Comida");
       model.addColumn("Tipo Comida");
       model.addColumn("Descripcion");
       model.addColumn("PrecioxUnidad");
       model.addColumn("Estado");
       pnlMarket.TablaComida.setModel(model);
      
       String[] dato= new String [6];
       
        try {
            //Ejecutemos la query
           
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(comidas.next()){
                dato[0]=comidas.getString(1);
                dato[1]=comidas.getString(2);
                dato[2]=comidas.getString(3);
                dato[3]=comidas.getString(4);
                dato[4]=comidas.getString(5);
                dato[5]=comidas.getString(6);
  
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }


public void actualizarTablaPostres() throws SQLException {
     
        
      
        DatosComida DC= new DatosComida();

        ResultSet comidas = DC.obtenerPostre();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Postre");
       model.addColumn("Nombre Postre");
       model.addColumn("Tipo Postre");
       model.addColumn("Descripcion");
       model.addColumn("PrecioxUnidad");
       model.addColumn("Estado");
       pnlMarket.TablaPostres.setModel(model);
      
       String[] dato= new String [6];
       
        try {
            //Ejecutemos la query
           
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(comidas.next()){
                dato[0]=comidas.getString(1);
                dato[1]=comidas.getString(2);
                dato[2]=comidas.getString(3);
                dato[3]=comidas.getString(4);
                dato[4]=comidas.getString(5);
                dato[5]=comidas.getString(6);
  
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }



public void actualizarTablaBebidas() throws SQLException {
     
        
      
        DatosComida DC= new DatosComida();

        ResultSet comidas = DC.obtenerBebidas();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Bebida");
       model.addColumn("Nombre Bebida");
       model.addColumn("Tipo Bebida");
       model.addColumn("Descripcion");
       model.addColumn("PrecioxUnidad");
       model.addColumn("Estado");
       pnlMarket.TablaBebidas.setModel(model);
      
       String[] dato= new String [6];
       
        try {
            //Ejecutemos la query
           
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(comidas.next()){
                dato[0]=comidas.getString(1);
                dato[1]=comidas.getString(2);
                dato[2]=comidas.getString(3);
                dato[3]=comidas.getString(4);
                dato[4]=comidas.getString(5);
                dato[5]=comidas.getString(6);
  
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    
    
}
    

