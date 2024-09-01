package co.edu.uniquindio.poo;
import java.sql.Time;
import java.util.LinkedList;
import java.util.Date;
public class Reuniones {
    private String descripcion;
    private Date fecha;
    private Time hora;
    private LinkedList<Contacto> contactosAsistentes;
    public Reuniones (String descripcion, Date fecha, Time hora){
        this.descripcion=descripcion;
        this.fecha=fecha;
        this.hora=hora;
        contactosAsistentes= new LinkedList<>();
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Time getHora() {
        return hora;
    }
    public void setHora(Time hora) {
        this.hora = hora;
    }
    public LinkedList<Contacto> getContactosAsistentes() {
        return contactosAsistentes;
    }
    public void setContactosAsistentes(LinkedList<Contacto> contactosAsistentes) {
        this.contactosAsistentes = contactosAsistentes;
    }
    @Override
    public String toString(){
        return "La reunión será "+descripcion+ " el día: "+fecha+ " a las:  "+hora+ " y asistirán: \n" +contactosAsistentes;
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    public void agregarContacto (Contacto contacto){
        contactosAsistentes.add(contacto);
    }
}