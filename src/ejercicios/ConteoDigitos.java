package ejercicios;

public class ConteoDigitos {
    public static void main(String[] args) {
        /* 22. Conteo de dígitos de un número
           Descripción: Cuenta cuántos dígitos tiene el número a = 987654.
           El resultado sería 6 dígitos.
           Variables: a = 987654.
         */
        int a = 987654;
        String numeroString = Integer.toString(a);
        char[] cadena = numeroString.toCharArray();

        System.out.println("El numero " + a + " tiene " + cadena.length + " digitos");
    }
}
