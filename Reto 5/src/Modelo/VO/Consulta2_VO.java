
package Modelo.VO;


public class Consulta2_VO {
    private Integer Id_Proyecto;
    private String constructora;
    private String Habitaciones;
    private String Ciudad;

    public Consulta2_VO() {
    }

    public Consulta2_VO(Integer Id_Proyecto, String constructora, String Habitaciones, String Ciudad) {
        this.Id_Proyecto = Id_Proyecto;
        this.constructora = constructora;
        this.Habitaciones = Habitaciones;
        this.Ciudad = Ciudad;
    }

    public void setId_Proyecto(Integer Id_Proyecto) {
        this.Id_Proyecto = Id_Proyecto;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public void setHabitaciones(String Habitaciones) {
        this.Habitaciones = Habitaciones;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public Integer getId_Proyecto() {
        return Id_Proyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public String getHabitaciones() {
        return Habitaciones;
    }

    public String getCiudad() {
        return Ciudad;
    }

    @Override
    public String toString() {
        return "Consulta2_VO{" + "Id_Proyecto=" + Id_Proyecto + ", constructora=" + constructora + ", Habitaciones=" + Habitaciones + ", Ciudad=" + Ciudad + '}';
    }
    
    
    
    
    
    
}
