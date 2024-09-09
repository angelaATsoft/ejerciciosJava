package ejercicios;

public class SumaDigitos {
    public static void main(String[] args) {
        /* 16. Sumar dígitos de un número
            Descripción: Dado el número a = 5678, suma todos sus dígitos.
            El resultado sería 5 + 6 + 7 + 8 = 26.
            Variables: a = 5678.
         */
        int a = 5678;
        String numeroString = Integer.toString(a);
        char[] cadena = numeroString.toCharArray();
        int sumaDigito = 0;
        for (int i = 0; i < cadena.length; i++) {
            sumaDigito = sumaDigito + Character.getNumericValue(cadena[i]);
        }
        System.out.println("Sumatoria de los dígitos " + a + " es: " + sumaDigito);
    }
}
