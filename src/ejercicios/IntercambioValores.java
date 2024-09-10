package ejercicios;

public class IntercambioValores {
    public static void main(String[] args) {
        /* 27. Intercambio de valores
           Descripción: Intercambia los valores de a = 5 y b = 10,
           sin usar una tercera variable auxiliar.
           Variables: a = 5, b = 10.
         */

        int x = 5;
        int y = 10;

        System.out.println("Valor inicial de x: " + x);
        System.out.println("Valor inicial de y: " + y);
        x = (x + y);
        y = (x - y);
        x = (x - y);
        System.out.println("Valor intercambiado de X: " + x);
        System.out.println("Valor intercambiado de Y: " + y);
    }
}
