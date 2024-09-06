package ejercicios;

public class AreaCirculo {
    public static void main(String[] args) {
        /* 15. Calcular el área de un círculo
            Descripción: Dado el radio r = 7 de un círculo,
            calcula su área usando la fórmula: Area = pi * r2
            Variables: r = 7.
         */
        int r = 7;
        double pi = 3.14;
        double area = pi * r * r;

        System.out.println("El area de un círculo, con Radio (r) " + r + " es: " + area);
    }
}
