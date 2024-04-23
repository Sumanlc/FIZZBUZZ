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

    @Test
    public void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(3);
        assertEquals("Fizz", resultado);
    }

    @Test
    public void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(4);
        assertEquals("4", resultado);
    }

    @Test
    public void test5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(5);
        assertEquals("Buzz", resultado);
    }

    @Test
    public void test6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(6);
        assertEquals("Fizz", resultado);
    }

    @Test
    public void test7() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(7);
        assertEquals("7", resultado);
    }

    @Test
    public void test8() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(8);
        assertEquals("8", resultado);
    }

    @Test
    public void test9() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(9);
        assertEquals("Fizz", resultado);
    }
    @Test
    public void test10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String resultado = fizzBuzz.calcular(10);
        assertEquals("Buzz", resultado);
    }


}