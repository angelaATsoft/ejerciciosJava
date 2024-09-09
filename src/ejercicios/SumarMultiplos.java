package ejercicios;

public class SumarMultiplos {
    public static void main(String[] args) {
        /* 24. Sumar los múltiplos de un número en un rango
           Descripción: Suma todos los múltiplos de a = 3 dentro del rango de 1 a 50.
           Un múltiplo de un número es el resultado de multiplicarlo por un entero.
           Variables: a = 3, rango de 1 a 50.
         */
        int a = 3;
        int rangoInicial = 1;
        int rangoFinal = 50;
        int sumatoriaMultiplos = 0;

        for (int i = rangoInicial; i <= rangoFinal; i++) {
            sumatoriaMultiplos = sumatoriaMultiplos + (i * a);
        }
        System.out.println("La sumatoria de los múltiplos de " + a + ", en un rango del " + rangoInicial + " al " + rangoFinal + " es: " + sumatoriaMultiplos);
    }
}
