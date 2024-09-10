package ejercicios;

public class Palindromo {
    public static void main(String[] args) {
        /* 13. Palíndromo de un número
            Descripción: Determina si el número a = 1221 es palíndromo,
            es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
            Variables: a = 1221.
         */

        int a = 1221;
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
        if (a == paranumero) {
            System.out.println(a + " SI es palindromo");
        } else {
            System.out.println( a + " NO es palindromo");
        }
    }
}
