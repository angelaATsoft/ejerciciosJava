package ejercicios;

public class AreaTriangulo {
    public static void main(String[] args) {
        /* 7. Área de un triángulo
           Descripción: Dadas la base b = 5 y la altura h = 8 de un triángulo,
           calcula su área usando la fórmula:
           Area = 1/2 * Base * Altura
            Variables: b = 5, h = 8.
         */

        double b = 5;
        double h = 8;
        double area = (b*h)/2;
        System.out.println("El area de un triángulo con Base (b) " + Math.round(b) + " y Altura (h) " + Math.round(h) + " es: " + Math.round(area));
    }
}
