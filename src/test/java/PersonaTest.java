import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void testIngresarNombre() {
        // Redirigir la entrada y salida estándar
        String input = "1"; // Simula la entrada del usuario
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Crear una instancia de MiClase y llamar al método
        Persona persona = new Persona();
        persona.ingresarNombre();

        // Verificar la salida y el resultado del método
        assertEquals("nombre: ", outputStream.toString());
        assertEquals("1", persona.getNombre().trim());
    }

    @Test
    public void testIngresarDestinoConEntradaNoValida() {
        // Redirigir la entrada estándar
        String input = "textoNoValido\n"; // Simula una entrada no válida
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Capturar la salida estándar
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Crear una instancia de MiClase
        Persona persona = new Persona();

        // Verificar si se lanza la excepción InputMismatchException
        assertThrows(InputMismatchException.class, () -> persona.ingresarDestino());

        // Restaurar la entrada y salida estándar originales
        System.setIn(originalIn);
        System.setOut(originalOut);
    }
}








