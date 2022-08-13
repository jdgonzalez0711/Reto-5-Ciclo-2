
package Modelo.DAO;


import Modelo.VO.Consulta2_VO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class Consulta2_DAO {
    
    public void CasaCampestre(DefaultTableModel modelo) throws Exception  {
        
     Consulta2_VO retorno = new Consulta2_VO();
     
     
     Connection conn = null;
     PreparedStatement stmt = null;
     ResultSet rset = null;
     
     String Consulta = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion ='Casa Campestre' AND Ciudad in ('Santa Marta','Cartagena','Barranquilla')";
        
        try{
            conn = JBDCUtilities.getConnection();
            stmt = conn.prepareStatement(Consulta);
            rset = stmt.executeQuery();
            while(rset.next()){
                
               retorno.setId_Proyecto(rset.getInt(1));
               retorno.setConstructora(rset.getString(2));
               retorno.setHabitaciones(rset.getString(3));
               retorno.setCiudad(rset.getString(4));
               
               modelo.addRow(new Object[] {retorno.getId_Proyecto() , retorno.getConstructora() , retorno.getHabitaciones() , retorno.getCiudad()} );
               
            }
            
        } finally{
            if (rset != null) {
                rset.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }  
}
