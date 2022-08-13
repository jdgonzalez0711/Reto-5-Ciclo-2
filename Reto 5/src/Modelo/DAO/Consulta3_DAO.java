
package Modelo.DAO;

import Modelo.VO.Consulta3_Vo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Consulta3_DAO {
    
     public void compras(DefaultTableModel modelo) throws Exception  {
        
     Consulta3_Vo retorno = new Consulta3_Vo();
     
     
     Connection conn = null;
     PreparedStatement stmt = null;
     ResultSet rset = null;
     
     String Consulta = "SELECT ID_Compra, Constructora, p.Banco_Vinculado FROM Proyecto p JOIN Compra c on (p.ID_Proyecto = c.ID_Proyecto) WHERE Proveedor = 'Homecenter' and Ciudad = 'Salento'";
        
        try{
            conn = JBDCUtilities.getConnection();
            stmt = conn.prepareStatement(Consulta);
            rset = stmt.executeQuery();
            while(rset.next()){
                
               retorno.setId_Compra(rset.getInt(1));
               retorno.setConstructora(rset.getString(2));
               retorno.setBanco(rset.getString(3));
 
              
               
               modelo.addRow(new Object[] {retorno.getId_Compra() , retorno.getConstructora(), retorno.getBanco()} );
               
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
