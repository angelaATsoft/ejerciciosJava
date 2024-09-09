package ejercicios;

public class NumeroArmstrong {
    public static void main(String[] args) {
        /* 20. Número Armstrong
           Descripción: Determina si el número a = 153 es un número Armstrong.
           Un número Armstrong es igual a la suma de sus dígitos elevados a la potencia del número de dígitos.
           Para 153, sería: 1^3 + 5^3 + 3^3 = 153.
           Variables: a = 153.
         */

        int a = 153;
        String numeroString = Integer.toString(a);
        char[] numeroArray = numeroString.toCharArray();
        int potencia = numeroArray.length;
        double sumatoria = 0;

        for (int i = 0; i < potencia; i++) {
            double numero = Integer.valueOf(String.valueOf(numeroArray[i]));
            sumatoria= sumatoria + Math.pow(numero, potencia);
        }
        if (a == sumatoria) {
            System.out.println(a + " es un número Amstrong");
        } else {
            System.out.println(a + " NO es un número Amstrong");
        }
    }
}
