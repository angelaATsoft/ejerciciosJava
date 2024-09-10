package ejercicios;

public class IntercambioValores {
    public static void main(String[] args) {
        /* 27. Intercambio de valores
           Descripción: Intercambia los valores de a = 5 y b = 10,
           sin usar una tercera variable auxiliar.
           Variables: a = 5, b = 10.
         */

        int a = 5;
        int b = 10;

        System.out.println("Valor inicial de a: " + a);
        System.out.println("Valor inicial de b: " + b);
        a = (a + b);
        b = (a - b);
        a = (a - b);
        System.out.println("Valor intercambiado de a: " + a);
        System.out.println("Valor intercambiado de b: " + b);
    }
}
