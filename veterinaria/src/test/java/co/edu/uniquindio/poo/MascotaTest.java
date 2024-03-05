/**
 * Clase para probar el funcionamiento del código de la informacion de estudiantes
 * @author Maicol Steven Paez Cruz
 * @since 2024-03-03
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Aserciones de JUnit 5


public class MascotaTest {

    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        Mascota mascota = new Mascota(1,"Pamela", "Perro", "Pinscher", 2, "Femenino", "Negro", 3.4f);

        assertEquals("Pamela",mascota.nombre());
        assertEquals( "Perro",mascota.especie());
        assertEquals("Pinscher",mascota.raza());
        assertEquals(2,mascota.edad() );
        assertEquals("Femenino",mascota.genero());
        assertEquals("Negro",mascota.color());
        assertEquals(3.4f,mascota.peso());
        LOG.info("Finaliza test datosCompletos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Inicio datos vacios");
        assertThrows(Throwable.class, () -> new Mascota(0,"", "", "", 0, "", "", 0f));
        LOG.info("Finalización de datos vacios");
    }

    @Test
    public void edadNegativa() {
        LOG.info("Inicio edad negativa");
        assertThrows(Throwable.class, () -> new Mascota(1,"Pamela", "Perro", "Pinscher", -2, "Femenino", "Negro", 3.4f));
        LOG.info("Finalización de edad negativa");
    }

    @Test
    public void pesoNegativo() {
        LOG.info("Inicio peso negativo");
        assertThrows(Throwable.class, () -> new Mascota(1,"Pamela", "Perro", "Pinscher", 2, "Femenino", "Negro", -3.4f));
        LOG.info("Finalización de peso negativo");
    }

    @Test
    public void datosNull() {
        LOG.info("Iniciado test datos nulos");
        assertThrows(Throwable.class, () -> new Mascota(0,null, null, null, 0, null, null, 0));
        LOG.info("Finalizando test datos Nulos");
    }
}

