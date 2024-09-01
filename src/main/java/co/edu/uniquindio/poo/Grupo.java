package co.edu.uniquindio.poo;
import java.util.LinkedList;
public class Grupo {
    private String nombre;
    private String categoria;
    private LinkedList<Contacto> contactos;
    public Grupo (String nombre, String categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        contactos= new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public LinkedList<Contacto> getContactos() {
        return contactos;
    }
    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }
    @Override
    public String toString(){
        return "El nombre del Grupo es: "+nombre+ " y su categoria es: "+categoria+ " lo componen los contactos: \n"+contactos;
    }
    public void agregarContacto (Contacto contacto){
        contactos.add(contacto);
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
}
