
package Modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class JBDCUtilities {
    //Atributos de clase para gestión de conexión de base de datos
    private static final String UBICACION_BD = "ProyectosConstruccion.db";
    
    public static Connection getConnection() throws Exception {
        String url = "jdbc:sqlite:" + UBICACION_BD ;
        return DriverManager.getConnection(url);
    }
    
}
