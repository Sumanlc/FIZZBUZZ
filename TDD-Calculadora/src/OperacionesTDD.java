public class OperacionesTDD {

    public int suma(String numeros) {
        int resultado = 0;
        if (!numeros.isEmpty()) {
            String[] partes = numeros.split(",");
            for (String parte : partes) {
                try {
                    int numero = Integer.parseInt(parte);
                    if (numero > 1000) {
                        System.err.println("Número superior a 1000 ignorado");
                    } else {
                        resultado += numero;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Error: Se encontró un separador sin número");
                    return -1;
                }
            }
        }
        return resultado;
    }


}
