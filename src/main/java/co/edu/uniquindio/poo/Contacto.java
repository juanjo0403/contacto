package co.edu.uniquindio.poo;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String email;
    private String telefono;
    public Contacto (String nombre, String alias, String direccion, String email, String telefono){
        this.nombre= nombre;
        this.alias= alias;
        this.direccion= direccion;
        this.email= email;
        this.telefono= telefono;
        assert !nombre.isBlank();
        assert email.contains ("@");
        assert !direccion.isBlank();
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
}
