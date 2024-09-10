package ejercicios;

public class RaizCuadrada {
    public static void main(String[] args) {
        /* 21. Raíz cuadrada sin usar librerías
           Descripción: Calcula la raíz cuadrada del número a = 49
           sin usar funciones predefinidas.
           La raíz cuadrada de 49 es 7.
           Variables: a = 49.
         */

        int a = 49;
        double x = a/2;
        int i = 10;
        for (int j = 1; j <= i; j++) {
            x = (x + a / x) / 2;
        };

        if ((x % 1) == 0){
            System.out.println("La raíz cuadrada de " + a + " es: " + Math.round(x));
        } else {
            System.out.println(a + " no tiene raíz cuadrada exacta");
        }
    }
}
