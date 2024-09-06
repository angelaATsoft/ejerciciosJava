package ejercicios;

public class SumaNrosNaturales {
    public static void main(String[] args) {
        /* 9. Suma de los primeros N números naturales
        Descripción: Dado el número N = 50,
        calcula la suma de los primeros N números naturales. Los números naturales son los enteros positivos comenzando desde 1.
        Variables: N = 50.
         */
        int N = 50;
        int suma = 0;
        for (int i = 1; i <= N; i = i +1) {
            suma = suma + i;
        }
        System.out.println("La suma de los primeros " + N + " numeros naturales, es: " + suma);
    }

}

