package ejercicios;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        /* 28. Calcular el máximo común divisor (MCD)
           Descripción: Dados los números a = 48 y b = 18, calcula su MCD (máximo común divisor).
           El MCD es el número más grande que divide exactamente a ambos números.
           Variables: a = 48, b = 18.
         */

        int a = 48;
        int b = 18;
        int x = 0;
        int y = 0;

        int[] divisorA = new int[a/2];
        int[] divisorB = new int[b/2];

        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                divisorA[x] = i;
                x++;
            }
        }

        for (int i = 1; i <= b; i++) {
            if (b % i == 0){
                divisorB[y] = i;
                y++;
            }
        }

        for (int i = x-1; i >= 0; i--) {
            for (int j = y-1; j >= 0; j--) {
                if (divisorA[i] == divisorB[j] ){
                    System.out.println("El máximo comun divisor entre " + a + " y " + b + " es " + divisorA[i]);
                    return;
                }
            }
        }
    }
}
