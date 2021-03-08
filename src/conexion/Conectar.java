    package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    public Connection conexion() {

        Connection miConexion = null;
        try {
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost/DeliveryApp2020?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "usher1232398");

        } catch (Exception e) {
            System.out.println("No conecta");
        }
        return miConexion;
    }
    
    public void cerrar(Connection conexion) throws SQLException{
        conexion.close();
    }
    

}
