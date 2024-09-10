package ejercicios;

public class NumerosPerfectos {
    public static void main(String[] args) {
        /* 19. Números perfectos
           Descripción: Determina si el número a = 28 es un número perfecto.
           Un número perfecto es aquel cuya suma de sus divisores (excluyendo el número mismo)
           es igual al número.
           Variables: a = 28.
         */
        int numero = 29;
        int maximo = Math.round(numero/2);
        int sumatoria = 0;

        for (int i = 1; i <= maximo; i++) {
            if (numero % i == 0) {
                sumatoria = sumatoria + i;
            }
        }

        if (numero == sumatoria) {
            System.out.println("Número " + numero + " es perfecto");
        } else {
            System.out.println("Número " + numero + " NO es perfecto");
        }
    }
}
