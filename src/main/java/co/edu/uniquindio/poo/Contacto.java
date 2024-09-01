package co.edu.uniquindio.poo;
import java.util.LinkedList;
public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String email;
    private String telefono;
    private LinkedList<Contacto>contactos;
    public Contacto (String nombre, String alias, String direccion, String email, String telefono){
        this.nombre= nombre;
        this.alias= alias;
        this.direccion= direccion;
        this.email= email;
        this.telefono= telefono;
        contactos= new LinkedList<>();
        assert !nombre.isBlank();
        assert email.contains ("@");
        assert !direccion.isBlank();
    }
    public LinkedList<Contacto> getContactos() {
        return contactos;
    }
    public void setContactos(LinkedList<Contacto> contactos) {
        this.contactos = contactos;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getAlias() {
        return alias;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "Nombre de contacto: "+nombre+"\nAlias: "+alias+"\nDireccion: "+direccion+"\nCorreo: "+email+"\nTelefono: "+telefono;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public boolean ValidarNumeroTelefono(String telefono){
        boolean telefonoRepetido= false;
        for (Contacto contacto: contactos){
            if(contacto.getTelefono().equals(telefono)){
                telefonoRepetido=true;
            }

        }
        return telefonoRepetido;
    }
    public void agregarContacto(Contacto contacto){
        if (ValidarNumeroTelefono(contacto.getTelefono())){
            mostrarMensaje("Error, el número de identificación"+contacto.getTelefono()+ "ya esta creado");
        }else{
            contactos.add(contacto);
        }
    }
    public void eliminarContacto (String telefono){
        for (Contacto contacto: contactos){
            if (contacto.getTelefono().equals(telefono)){
                contactos.remove(contacto);
                break;
            }
        }
    }
    public void actualizarContacto (String alias, String direccion, String telefono){
        for (Contacto contacto: contactos){
            if (contacto.getTelefono().equals(telefono)){
                contacto.setAlias(alias);
                contacto.setDireccion(direccion);
                break;
            }
        }

    }
}
