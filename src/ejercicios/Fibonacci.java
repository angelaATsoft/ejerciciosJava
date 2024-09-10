package ejercicios;

public class Fibonacci {
    public static void main(String[] args) {
        /* 11. Fibonacci
            Descripción: Genera los primeros N = 10 números de la secuencia de Fibonacci,
            donde cada número es la suma de los dos anteriores.
            La secuencia comienza con 0 y 1.
            Variables: N = 10.
         */

        int N = 10;
        int anterior1 = 0;
        int anterior2 = 1;
        int paso = 0;
        System.out.println(anterior1);
        System.out.println(anterior2);

        for (int i = 3; i <= N ; i++) {
            System.out.println(anterior1 + anterior2);
            paso = anterior1;
            anterior1 = anterior2;
            anterior2 = paso + anterior2;
        }
    }
}
