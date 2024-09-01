/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ContactoTest {
    private static final Logger LOG = Logger.getLogger(ContactoTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datosVacios");
        assertThrows (Throwable.class, ()-> new Contacto(" ", " ", " ", " ", " "));
        LOG.info("Finalizando test datosvacios");
    }
    @Test
    public void validacionCorreo() {
        LOG.info("Iniciando test validacionCorreo");

        assertThrows(Throwable.class, ()->new Contacto("Juan", "jj", "Cra 9 16 38", "jj", "317345682"));

        LOG.info("Finalizando test validacionCorreo");
    }
}