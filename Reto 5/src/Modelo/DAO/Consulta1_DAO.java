
package Modelo.DAO;

import Modelo.VO.Consulta1_Vo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Consulta1_DAO {
    public void lideres(DefaultTableModel modelo) throws Exception  {
        
     Consulta1_Vo retorno = new Consulta1_Vo();
     
     
     Connection conn = null;
     PreparedStatement stmt = null;
     ResultSet rset = null;
     
     String Consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia ASC";
        
        try{
            conn = JBDCUtilities.getConnection();
            stmt = conn.prepareStatement(Consulta);
            rset = stmt.executeQuery();
            while(rset.next()){
               retorno.setId_lider(rset.getInt(1));
               retorno.setNombre(rset.getString(2));
               retorno.setApellido(rset.getString(3));
               retorno.setCiudad_Residencia(rset.getString(4));
               
               modelo.addRow(new Object[] {retorno.getId_lider() , retorno.getNombre(), retorno.getApellido(), retorno.getCiudad_Residencia()} );
               
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
