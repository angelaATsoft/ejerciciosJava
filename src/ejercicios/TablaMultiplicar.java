package ejercicios;

public class TablaMultiplicar {
    public static void main(String[] args) {
        /* 25. Generar tabla de multiplicar
            Descripción: Genera la tabla de multiplicar del número a = 7.
            Variables: a = 7.
         */
        int a = 7;
        int ultimoNro = 10;
        System.out.println("Tabla de Multiplicar del número: " + a );
        for (int i = 1; i <= ultimoNro; i = i + 1) {
            System.out.println(a + " * " + i + ": " + (a*i));
        }
    }
}
