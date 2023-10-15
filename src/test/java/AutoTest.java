import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

    @Test
    public void testAutoConstructor() {
        Auto auto = new Auto();
        double velocidadEsperada = Double.parseDouble("Hola");

        assertEquals(velocidadEsperada, auto.getVelocidad(), 0.001);
    }
}