/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import conexion.Conectar;
import datos.DatosCadete;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import subPaneles.Registro_Cadetes;
import datos.DatosPagoCadete;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import paneles.pnlChat;
import subPaneles.Registro_Pedido_Nuevo_otro;
import subPaneles.Ver_Cliente;

/**
 *
 * @author alex1
 */
public class ControlPagoCadete {
    
     public void AgregarPagoCadete() throws SQLException {
       

        String fecha;
        int cuit;
 
        DatosCadete GCad= new DatosCadete();
        String formatoFecha= "yyyy MMMM dd";
        Date fechaD;
         fechaD = Registro_Pedido_Nuevo_otro.recuperarfecha2.getDate();
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFecha);
         String fecha_A_rP=formateador.format(fechaD);
          ResultSet cadete = GCad.buscarCadetePorNombre(Registro_Pedido_Nuevo_otro.ingresar_Cadete_P.getSelectedItem().toString().trim());
        int cadeteId=0;
         while(cadete.next()){
          
           cadeteId=cadete.getInt("cuit_cadete");
          
          }
     
       
       
       float pago= Float.parseFloat(Registro_Pedido_Nuevo_otro.Final_Precio_P1.getText());
      
        DatosPagoCadete Gz = new DatosPagoCadete();
        Gz.AgregargananciaDiaCadete(fecha_A_rP,cadeteId,pago);

     
        //actualizarTablaCadete(grafico);
     
    }
     
     public void actualizarTablaPagoCadete() throws SQLException {

        DatosPagoCadete GC = new DatosPagoCadete();

        ResultSet Cadetes = GC.obtenergananciaDiaCadete();//ver despues

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_Ganancia");
       model.addColumn("Fecha");
       model.addColumn("Cuit Cadete");
       model.addColumn("Estado");
       model.addColumn("Pago");
 
       pnlChat.tabla_pro_cadete1.setModel(model);
       String[] dato= new String [9];
       
        try {
            //Ejecutemos la query
           
            //Este while significa mientras resultado tenga mas resultado, me va a mostrar los siguiente
            while(Cadetes.next()){
                dato[0]=Cadetes.getString(1);
                dato[1]=Cadetes.getString(2);
                dato[2]=Cadetes.getString(3);
                dato[3]=Cadetes.getString(4);
                dato[4]=Cadetes.getString(5);
               
                model.addRow(dato);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ver_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    
}
