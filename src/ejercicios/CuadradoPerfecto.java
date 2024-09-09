package ejercicios;

public class CuadradoPerfecto {
    public static void main(String[] args) {
        /* 29. Verificar si un número es un cuadrado perfecto
           Descripción: Determina si el número a = 64 es un cuadrado perfecto.
           Un cuadrado perfecto es un número que es el resultado de multiplicar
           un entero por sí mismo. En este caso, 8 × 8 = 64.
           Variables: a = 64.
         */

        int a = 64;
        double cuadradoPerfecto = Math.sqrt(a);
        if ((cuadradoPerfecto % 1) == 0){
            System.out.println(a + " es un cuadrado perfecto: " + Math.round(cuadradoPerfecto) + " * " + Math.round(cuadradoPerfecto));
        } else {
            System.out.println(a + " no es un cuadrado perfecto");
        }
    }
}
