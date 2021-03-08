
package controladores;


import datos.DatosCadete;
import datos.DatosComida;
import datos.DatosZona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paneles.pnlChat;
import subPaneles.Registro_Cadetes;
import subPaneles.Registro_Pedido_Nuevo_otro;
import static subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Cadete_P;
import subPaneles.Ver_Cliente;


public class ControlCadete {
    
    public void AgregarCadete(Registro_Cadetes grafico) throws SQLException {
       
        String DNI;
        String telefono;
        String nombre;
        String apellido;
        String calle;
        String altura;

        DNI = grafico.Cuit_cadete.getText().trim();
        telefono = grafico.Tel_cadete.getText().trim();
        nombre = grafico.Nombre_cadete.getText().trim();
        apellido = grafico.Apellido_cadete.getText().trim();
        String carnetEstado = grafico.Tipo_carnet.getSelectedItem().toString().trim();
        String estadoCadete = grafico.Tipo_estado.getSelectedItem().toString().trim();
        int id_Vehiculo=Integer.parseInt(grafico.Tipo_vehiculo.getSelectedItem().toString().trim());
        int sucursal= Integer.parseInt(grafico.Sucursal_Cadete.getText());
        if (DNI.isEmpty() || telefono.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) {
            JOptionPane.showMessageDialog(grafico, "Debes completar todos los datos", "Error", 0);
            return;
        }
        
       long Dni = -1;
        long tel = -1;
         
         try {
            Dni = Long.parseLong(DNI);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(grafico, "No se ingreso el DNI correctamente", "Error", 0);
            e.getMessage();
            return;
        }
         
        try {
            tel = Long.parseLong(telefono);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(grafico, "No se ingreso el telefono correctamente", "Error", 0);
            e.getMessage();
            return;
        }
        
        DatosCadete GC = new DatosCadete();
        GC.AgregarCadete(Dni,tel,nombre,apellido,carnetEstado,id_Vehiculo,sucursal);

        JOptionPane.showMessageDialog(grafico, "Se registro correctamente", "Cadete Registrado", 1);
        //actualizarTablaCadete(grafico);
     
    }
    
    public void actualizarTablaCadete() throws SQLException {

        DatosCadete GC = new DatosCadete();

        ResultSet Cadetes = GC.obtenerCadetes();//ver despues

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("cuit_cadete");
       model.addColumn("nombre");
       model.addColumn("apellido");
       model.addColumn("id_vehiculo");
       model.addColumn("id_sucursal");
 
       pnlChat.tabla_pro_cadete.setModel(model);
       String[] dato= new String [9];
       
        try {
            //Ejecutemos la query
           
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(Cadetes.next()){
                dato[0]=Cadetes.getString(1);
                dato[1]=Cadetes.getString(2);
                dato[2]=Cadetes.getString(3);
                dato[3]=Cadetes.getString(7);
                dato[4]=Cadetes.getString(8);
               
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
        public void obtenercadetes3() throws SQLException{
         DatosCadete GC = new DatosCadete();
         DatosZona GZ = new DatosZona();
        ResultSet zona =GZ.buscarZonaPorNombre(Registro_Pedido_Nuevo_otro.ingresar_Zona.getSelectedItem().toString());
        ResultSet cadete = GC.buscarCadetePorNombre(Registro_Pedido_Nuevo_otro.ingresar_Cadete_P.getSelectedItem().toString());
        float precio2 = 0;   
        //subPaneles.Registro_Pedido_Nuevo_otro.ingresar_Comida.addItem(comidas.getString("nombreComida"));
        
        while(cadete.next()){
             System.out.println(cadete);
        float precio= cadete.getFloat("precio_Base");
        String precioS= Float.toString(precio);
        while(zona.next()){
             
                precio2= zona.getFloat("precio");
              
                 
        }
            float total=precio+precio2;
            String total3= Float.toString(total);
            subPaneles.Registro_Pedido_Nuevo_otro.Final_Precio_P1.setText(total3);
        } 
    
    
    }
    
   
    

}
