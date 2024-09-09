package ejercicios;

public class NumerosPerfectos {
    public static void main(String[] args) {
        /* 19. Números perfectos
           Descripción: Determina si el número a = 28 es un número perfecto.
           Un número perfecto es aquel cuya suma de sus divisores (excluyendo el número mismo)
           es igual al número.
           Variables: a = 28.
           Otros ejemplos: 6, 28, 496, 8128, 33550336, 8589869056, 137438691328, 2305843008139952128
         */
        int numero = 28;
        int maximo = Math.round(numero/2);
        int sumatoria = 0;

        for (int i = 1; i <= maximo; i++) {
            if (numero % i == 0) {
                sumatoria = sumatoria + i;
            }
        }

        if (numero == sumatoria) {
            System.out.println("Número es perfecto");
        } else {
            System.out.println("Número NO es perfecto");
        }
    }
}
