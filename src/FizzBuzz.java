public class FizzBuzz {
    public String calcular(int numero) {
        if (numero == 1) {
            return "1";
        } else if (numero == 2) {
            return "2";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else {
            return "";
        }
    }
}
