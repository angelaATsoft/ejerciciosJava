package ejercicios;

public class ConversionTemperatura {
    public static void main(String[] args) {
        /* 8. Conversión de temperatura
            Descripción: Dado que la temperatura es c = 25 grados Celsius,
            conviértela a Fahrenheit usando la fórmula:
            F = 9/5 * C + 32
            Variables: c = 25.
         */
        int c = 25;
        float F = (9 * c)/5 + 32;

        System.out.println(c + "° Celcius equivalen a " + F + "° Farenheit");
    }
}
