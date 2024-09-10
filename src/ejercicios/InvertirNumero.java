package ejercicios;

public class InvertirNumero {
    public static void main(String[] args) {
        /* 12. Inversión de un número
            Descripción: Dado el número a = 54321, invierte el orden de sus dígitos.
            El resultado sería 12345.
            Variables: a = 54321.
         */

        int a = 54321;
        String numeroString = Integer.toString(a);
        char[] cadena = numeroString.toCharArray();
        char[] numeronuevo = new char[cadena.length];
        int paranumero=0;
        int x = 0;

        for (int i=cadena.length-1; i>=0; i--) {
            if (x <= cadena.length-1) {
                numeronuevo[x] = cadena[i];
                x = x + 1;
            }
        }
        paranumero =  Integer.valueOf(String.valueOf(numeronuevo));
        System.out.println("El numero invertido de " + a + " es: " + paranumero);

    }
}
