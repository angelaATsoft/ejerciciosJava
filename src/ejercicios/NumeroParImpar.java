package ejercicios;

public class NumeroParImpar {
    public static void main(String[] args) {
        /* 3. Número par o impar
            Descripción: Dado el número a = 15, determina si es par o impar.
            Un número es par si es divisible por 2, y es impar si no lo es.
            Variables: a = 15. */
        int a = 15;
        int total = a / 2;
        if (total % 2 == 0) {
            System.out.println("Numero "+a + " es par" );
        } else {
            System.out.println("Numero "+a + " es impar" );
        }

    }
}