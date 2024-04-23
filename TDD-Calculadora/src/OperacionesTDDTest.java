import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {
    @Test
    public void testSumaCadenaVaciaDevuelveCero() {
        OperacionesTDD operaciones = new OperacionesTDD();
        int resultado = operaciones.suma("");
        assertEquals(0, resultado);
    }
    @Test
    public void test1() {
        OperacionesTDD operaciones = new OperacionesTDD();
        int resultado = operaciones.suma("1");
        assertEquals(1, resultado);
    }



}