package ejercicios;

public class Divisibilidad {
    public static void main(String[] args) {
        /*  23. Divisibilidad
        Descripción: Dado el número a = 45, determina si es divisible por 2, 3 o 5.
        Un número es divisible por otro si al dividir el resultado es un número entero sin resto.
        Variables: a = 45.
        */
        int a = 45;

        if (a % 2 == 0) {
            System.out.println("El número " + a + " es divisible por 2");
        }

        if (a % 3 == 0) {
            System.out.println("El número " + a + " es divisible por 3");
        }

        if (a % 5 == 0) {
            System.out.println("El número " + a + " es divisible por 5");
        }
    }
}
