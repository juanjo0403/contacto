package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //Crear contacto
        Contacto contacto= new Contacto("Juan", "jj", "Cra 9 16 38", "jj@uqvirtual.edu.co", "317345682");
        Contacto contacto2= new Contacto("Ana", "AN", "Cra 10 17 39", "An@uqvirtual.edu.co", "451288351");
        Contacto contacto3= new Contacto("Sebastian", "SB", "Cra 11 18 40", "Sb@uqvirtual.edu.co", "6513261466");
        Contacto contacto4= new Contacto("John", "JF", "Cra 12 19 41", "Jf@uqvirtual.edu.co", "3251354651");
        Contacto contacto5= new Contacto("Carlos", "CL", "Cra 13 20 42", "Cl@uqvirtual.edu.co", "3153513513");
        Contacto contacto6= new Contacto("Maria", "Mr", "Cra 14 21 43", "Mr@uqvirtual.edu.co", "351346513331");
        Contacto contacto7= new Contacto("José", "Js", "Cra 15 22 44", "Js@uqvirtual.edu.co", "35135135461");
        Contacto contacto8= new Contacto("Laura", "Ld", "Cra 16 23 45", "Ld@uqvirtual.edu.co", "351351651351");
        Contacto contacto9= new Contacto("Daniela", "Dl", "Cra 17 24 46", "Dl@uqvirtual.edu.co", "313513516");
        Contacto contacto10= new Contacto("Mariana", "Mrn", "Cra 18 25 47", "Mrn@uqvirtual.edu.co", "31351651");
        //Crear Grupo
        Grupo grupo = new Grupo("Unidos", "OFICINA");
        grupo.agregarContacto(contacto10);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto);
        grupo.agregarContacto(contacto8);
        grupo.agregarContacto(contacto7);  
        Grupo grupo2= new Grupo("Familia", "AMIGOS");
        grupo2.agregarContacto(contacto3);
        grupo2.agregarContacto(contacto4);
        grupo2.agregarContacto(contacto5);
        grupo2.agregarContacto(contacto6);
        grupo2.agregarContacto(contacto9);
        Grupo.mostrarMensaje(grupo.toString());
        Grupo.mostrarMensaje(grupo2.toString());
        // Crear Reunion
        Reuniones reuniones= new Reuniones("CRUCIAL", null, null);
        reuniones.agregarContacto(contacto2);
        Reuniones.mostrarMensaje(reuniones.toString());
        //Verificar y mostrar si el contacto exiate o no
        String telefono= "0";
        boolean contactoExiste= contacto.ValidarNumeroTelefono(telefono);
        if (contactoExiste){
            Contacto.mostrarMensaje("El Contacto con telefono "+telefono+" existe");
        }else{
            Contacto.mostrarMensaje("El Contacto con telefono "+telefono+" no existe");
        }
        // Eliminar contacto
        String numeroTelefonico= "317345682";
        contacto.eliminarContacto(numeroTelefonico);
        Contacto.mostrarMensaje("El estudiante con el número telefonico "+numeroTelefonico+" fue removido");
        Contacto.mostrarMensaje(contacto.toString());
        // Actualizar contacto
        String numetoTelefonico2= "451288351";
        contacto.actualizarContacto("NA", "CRA 8 56 52", numetoTelefonico2);
        Contacto.mostrarMensaje("El contacto con el número telefonico " +numetoTelefonico2+" ha sido actualizado");
        // Contacto actualizado
        Contacto.mostrarMensaje("El curso ha sido actualizado: \n");
        Contacto.mostrarMensaje(contacto.toString());
    }
}
