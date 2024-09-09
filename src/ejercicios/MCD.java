package ejercicios;

public class MCD {
    public static void main(String[] args) {
        /* 28. Calcular el máximo común divisor (MCD)
           Descripción: Dados los números a = 48 y b = 18, calcula su MCD (máximo común divisor).
           El MCD es el número más grande que divide exactamente a ambos números.
           Variables: a = 48, b = 18.
         */
        //        Character.getNumericValue
        int a = 57;
        int b = 18;
        int x=0;
        int y=0;

        int[] divisorA = new int[a/3];
        int[] divisorB = new int[b/3];

        for (int i = 2; i <= a; i++) {
            while (a % i == 0){
                divisorA[x] = i;
                a = a/i;
                x++;
            }
        }
        for (int i = 2; i <= b; i++) {
            while (b % i == 0){
                divisorB[y] = i;
                b = b/i;
                y++;
            }
        }

        System.out.println("MatrizA: ");
        for (int i = 0; i < x; i++) {

            System.out.println(divisorA[i]);
        }
        System.out.println("MatrizB: ");
        for (int i = 0; i < y; i++) {
            System.out.println(divisorB[i]);
        }
    }
}
