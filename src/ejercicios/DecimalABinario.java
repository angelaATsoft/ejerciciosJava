package ejercicios;

public class DecimalABinario {
    public static void main(String[] args) {
        /* 14. Conversión de decimal a binario
            Descripción: Dado el número decimal a = 45, conviértelo a binario.
            Variables: a = 45.
         */

        int a = 45;
        int b = a;
        String binario = "";
        while (b > 0) {
            if (Math.round(b % 2) == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            b =  Math.round(b/2);
            System.out.println(binario);
        }
        System.out.println("El binario de " + a + " es " + binario );
    }
}
