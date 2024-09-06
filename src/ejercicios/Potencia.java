package ejercicios;

public class Potencia {
    public static void main(String[] args) {
        /* 18. Calcular potencia
            Descripción: Dado el número a = 2 y la potencia b = 8, calcula ,
            es decir, 2 elevado a la potencia de 8.
            Variables: a = 2, b = 8.
         */
        int a = 2;
        int b = 8;
        int potencia = 1;
        for (int i = 1; i <= b; i = i + 1) {
            potencia = potencia * a;
        }
        System.out.println("La potencia de " + a + " elevado a " + b + " es: " + potencia);
    }
}
