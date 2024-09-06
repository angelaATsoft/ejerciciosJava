package ejercicios;

public class NumeroMaximo {
    public static void main(String[] args) {
        /*5. Máximo de tres números
            Descripción: Dados los números a = 5, b = 12 y c = 9,
            encuentra cuál de ellos es el mayor.
            Variables: a = 5, b = 12, c = 9.
         */

        int a = 5;
        int b = 12;
        int c = 9;

        if (a > b) {
            if (a > c) {
                System.out.println("Máximo valor es la variable A: " + a);
            } else {
                System.out.println("Máximo valor es la variable C1: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Máximo valor es la variable B: " + b);
            } else {
                System.out.println("Máximo valor es la variable C2: " + c);
            }
        }


    }
}
