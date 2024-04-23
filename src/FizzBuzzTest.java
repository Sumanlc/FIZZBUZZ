import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void testDeberiaDevolverUnoEnFormatoCadena() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(1);
        assertEquals("1", resultado);
    }

    @Test
    public void testDeberiaDevolverDosEnFormatoCadena() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(2);
        assertEquals("2", resultado);
    }

}