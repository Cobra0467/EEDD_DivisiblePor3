package DivisiblePor3;

public class Divisible3 {
    public boolean seDivide(String numero) {
        int totalNumeros = 0;
        boolean resultado = false;

        for (int i = 0; i < numero.length() ; i++) {
            int caracter = Integer.parseInt(String.valueOf(numero.charAt(i)));
            totalNumeros += caracter;
        }


        if (totalNumeros % 3 == 0) {
            resultado = true;
        } else {
            resultado = false;
        }

	System.out.println("hola, mi pull request");
    System.out.println("hola y adios");
        return resultado;
    }
}
