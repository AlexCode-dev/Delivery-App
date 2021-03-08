
package controladores;

import datos.DatosCaja;
import datos.DatosUsuario;
import java.awt.Color;
import subPaneles.Monto_Inicial;
import subPaneles.Monto_Final;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import javax.swing.JOptionPane;
import paneles.pnlHome;
public class ControlCaja {
    
    public void mostrarAbrirCaja(Monto_Inicial grafico) throws SQLException{
        DatosCaja GC = new DatosCaja();
        ResultSet caja = GC.buscarCajaAbierta();
         
        if(!caja.first()){
            Monto_Inicial.ValorActual.setText("0,00");
          
        }else{
            Monto_Inicial.ValorActual.setText(caja.getString("monto_inicial"));
            
          
            //grafico.error2.setText("No puedes modificar hasta cerrar caja");
            grafico.Registrar_Caja_inicial.setEnabled(false);
            
        }
    }
    
    public void mostrarCerrarCaja(Monto_Final grafico) throws SQLException{
         DatosCaja GC = new DatosCaja();
        ResultSet caja = GC.buscarCajaAbierta();
        if(!caja.first()){
            //grafico.error.setText("No se inicio un valor de caja");
            grafico.Registrar_Caja_Final.setEnabled(false);
            grafico.Mont_Final1.setText(caja.getString("monto_inicial"));    
          
        }else{
           grafico.Mont_Final1.setText(caja.getString("monto_inicial"));
            Monto_Final.Mont_Final.setText(caja.getString("monto_final"));
            
        }
    }
    
    public void abrirCaja(Monto_Inicial grafico) throws SQLException{
        
       String iniciar = Monto_Inicial.Ingreso_Mont_Inicial.getText();
        
          /*  grafico.label_pro.setText(Principal.Sucursal_ID.getText().trim());
            */
            
        if (iniciar.isEmpty()) {
            JOptionPane.showMessageDialog(grafico, "No se ingreso un valor de caja inicial", "Error",0);
            return;
        }
        
        double monto;
        try {
            monto = Double.parseDouble(iniciar);
            System.out.println("actualizo monto");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(grafico, "No se ingreso un valor correcto", "Error", 0);
            e.getMessage();
            return;
        }
   
           
        DatosCaja GC = new DatosCaja();
        GC.iniciarCaja(monto);
        String MontoS=String.valueOf(monto);
        pnlHome.Ganancia_diarias.setText(MontoS);
        pnlHome.Ganancia_diarias1.setText(MontoS);
        Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
 
       
        String strDateFormat = "hh: mm"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); 
        //ver lo de arriba
        //Esto iba en un jlabel que indicaba la hora pero no funciona
       // principal.Principal.time.setText(objSDF.toString());
        
         
         principal.Principal.status_Caja.setText("Abierta");
        principal.Principal.status_Caja.setForeground(Color.GREEN);
        JOptionPane.showMessageDialog(grafico, "Se registro un valor de caja inicial", "Correcto",1);
        
        System.out.println("caja");
        grafico.dispose();
    }
    public void obtenerMontocaja() throws SQLException{
       DatosCaja GC = new DatosCaja();
       ResultSet caja = GC.buscarCajaAbierta();
       while(caja.next()){
           float valorCajaF=caja.getFloat("monto_inicial");
           String valorCajaS=Float.toString(valorCajaF);
           pnlHome.Ganancia_diarias.setText(valorCajaS);
       }
    
    }
     public void obtenerMontocajaF() throws SQLException{
       DatosCaja GC = new DatosCaja();
       ResultSet caja = GC.buscarCajaAbierta();
       while(caja.next()){
           float valorCajaF=caja.getFloat("monto_final");
           String valorCajaS=Float.toString(valorCajaF);
           pnlHome.Ganancia_diarias1.setText(valorCajaS);
       }
    
    }
    public void cerrarCaja(Monto_Final grafico) throws SQLException{
        DatosCaja GC = new DatosCaja();
        GC.cerrarCaja();
        grafico.dispose();
      
    }
}
