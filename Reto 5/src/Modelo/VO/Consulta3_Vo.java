
package Modelo.VO;

public class Consulta3_Vo {
    
    private Integer Id_Compra;
    private String constructora;
    private String Banco;

    public Consulta3_Vo() {
    }

    public Consulta3_Vo(Integer Id_Compra, String constructora, String Banco) {
        this.Id_Compra = Id_Compra;
        this.constructora = constructora;
        this.Banco = Banco;
    }

    public void setId_Compra(Integer Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public Integer getId_Compra() {
        return Id_Compra;
    }

    public String getConstructora() {
        return constructora;
    }

    public String getBanco() {
        return Banco;
    }

    @Override
    public String toString() {
        return "Consulta3_Vo{" + "Id_Compra=" + Id_Compra + ", constructora=" + constructora + ", Banco=" + Banco + '}';
    }
    
    
}
