
package Modelo.VO;


public class Consulta1_Vo {
    private Integer Id_lider;
    private String Nombre;
    private String Apellido;
    private String Ciudad_Residencia;

    public Consulta1_Vo() {
    
    }

    public Consulta1_Vo(Integer Id_lider, String Nombre, String Apellido, String Ciudad_Residencia) {
        this.Id_lider = Id_lider;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public void setId_lider(Integer Id_lider) {
        this.Id_lider = Id_lider;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public Integer getId_lider() {
        return Id_lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    @Override
    public String toString() {
        return "Consulta1_Vo{" + "Id_lider=" + Id_lider + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Ciudad_Residencia=" + Ciudad_Residencia + '}';
    }
    
    
    
}
