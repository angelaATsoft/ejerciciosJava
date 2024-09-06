package ejercicios;

public class SumaNrosPares {
    public static void main(String[] args) {
        /* 17. Suma de números pares en un rango
        Descripción: Suma todos los números pares entre a = 1 y b = 100.
        Un número es par si es divisible por 2.
        Variables: a = 1, b = 100.
         */
        int a = 1;
        int b = 100;
        int sumaPares = 0;

        for (int i = a+1; i <= b; i = i + 2) {
            sumaPares = sumaPares + i;
        }
        System.out.println("La sumatoria de los números pares, entre " + a + " y " + b + ", es: " + sumaPares);
    }
}
