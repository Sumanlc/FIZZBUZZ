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
    @Test
    public void test3() {
        OperacionesTDD operaciones = new OperacionesTDD();
        int resultado = operaciones.suma("1,2");
        assertEquals(3, resultado);
    }
    @Test
    public void test4() {
        OperacionesTDD operaciones = new OperacionesTDD();
        int resultado = operaciones.suma("1,1,2");
        assertEquals(4, resultado);
    }





}