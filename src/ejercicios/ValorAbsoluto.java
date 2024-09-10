package ejercicios;

public class ValorAbsoluto {
    public static void main(String[] args) {
        /* 26. Valor absoluto
           Descripción: Determina el valor absoluto del número a = -15.
           El valor absoluto es la distancia de un número al 0, ignorando su signo.
           Variables: a = -15.
         */
        int a = -15;
        int b = a;

        if (a < 0) {
            b =  (b * -1);
        }
        System.out.println("Valor absoluto de " + a + " es: " + b);
    }
}
