package ejercicios;

public class NumeroPrimo {
    public static void main(String[] args) {
        /*  4. Números primos
            Descripción: Dado el número a = 29, determina si es primo.
            Un número primo solo tiene dos divisores: 1 y él mismo.
            Variables: a = 29.
         */
        int numero = 29;
        int maximo = Math.round(numero / 2);
        if (numero == 2) {
            System.out.println("Número " + numero + " es PRIMO");
        } else {
            if (numero % 2 == 0) {
                System.out.println("Número " + numero + " no es  primo, es par");
            } else {
                for (int i = 3; i < maximo; i = i + 2) {
                    if (numero % i == 0) {
                        System.out.println("Número " + numero + " NO es primo");
                        return;
                    }
                }
                System.out.println("Número " + numero + " es PRIMO");
            }
        }
    }
}
