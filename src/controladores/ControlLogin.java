
package controladores;

import datos.DatosUsuario;
import Login.Login;
import Login.Noencontrado;
import Login.Registro_Exitoso;
import Login.Registro_Login;
import datos.DatosSucursal;
import java.sql.ResultSet;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import principal.Principal;



public class ControlLogin {
    
     public void iniciarSesion(Login login) throws SQLException{
        
        String usuarioIngresado = login.Usuario_tfld.getText();
        String claveIngresada = login.pass_tfld.getText();
       
        if(usuarioIngresado.isEmpty() || claveIngresada.isEmpty()){
            JOptionPane.showMessageDialog(login, "Complete todos los campos", "Error de Inicio",0);
            return;
        }else{
            DatosUsuario ver = new DatosUsuario();
            int verificacion = ver.ObtenerUsuario(usuarioIngresado, claveIngresada);
           
           
                if(verificacion == 1){
                    Principal x = new Principal();
                    int sucursal=ver.devolversucursalUsuario(usuarioIngresado);
                  
                     x.nombre_loc.setText(toUpperCase(usuarioIngresado));
                     System.out.println(sucursal);
                      Principal.Sucursal_ID.setText(Integer.toString(sucursal));
                   
                    x.setVisible(true);
                    
                    
                    
                     
                     //de entero a string para el jlabel.
                     //String.valueOf(numeroSucursal)
                     //System.out.println(datos.DatosSucursal.devolverusuario(usuarioIngresado));
                    login.dispose();
                }else{
                    if(verificacion == 2){
                         Principal t = new Principal();
                         t.setVisible(true);
                         login.dispose();
                    }else{
                        if(verificacion == 0){
                            Noencontrado z = new Noencontrado();
                            z.setVisible(true);
                            login.dispose();
                            
                        }
                    }
                }    
        }
    }
     
   public void validarRegistro(Registro_Login grafico) throws SQLException{
        
         String tipo = grafico.Registro_tipoUsuario.getSelectedItem().toString();
         
         String Dni = grafico.Registro_Dni.getText();
         String nombre = grafico.Registro_Nombre.getText();
         String apellido = grafico.Registro_Apellido.getText();
         String telefono = grafico.Registro_Telefono.getText();
         String domicilio= grafico.Registro_Domicilio.getText();
         String usuario = grafico.Registro_Usuario.getText();
         String pass = grafico.Registro_pass.getText();
         int id_Sucursal =Integer.parseInt(grafico.Registro_sucursal.getText());
         
          if(nombre.isEmpty() || apellido.isEmpty() || usuario.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(grafico, "Complete todos los campos", "Error de Registro",0);
            return;
        }else{
            DatosUsuario ver = new DatosUsuario();
            int verificacion = ver.buscarUsuario(usuario);
                if(verificacion == 1){
                     JOptionPane.showMessageDialog(grafico, "Ya esta en uso el nombre de usuario", "Cambie nombre de usuario",0);
                    return;
                }else{
                   
                        ver.insertarUsuario(Dni,tipo,nombre,apellido,telefono,"Activo",domicilio,id_Sucursal,usuario,pass);
                        Registro_Exitoso l = new Registro_Exitoso ();
                        l.setVisible(true);
                        grafico.dispose();
                    
                }    
        }
         
     }
    
}
