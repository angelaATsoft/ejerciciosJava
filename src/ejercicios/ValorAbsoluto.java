package ejercicios;

public class ValorAbsoluto {
    public static void main(String[] args) {
        /* 26. Valor absoluto
           Descripción: Determina el valor absoluto del número a = -15.
           El valor absoluto es la distancia de un número al 0, ignorando su signo.
           Variables: a = -15.
         */
        int a = -15;
        int b = 0;

        if (a < 0){
            b = (a * -1);
        }
        System.out.println("El valor absoluto de " + a + " es: " + b);
    }
}
