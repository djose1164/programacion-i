package tarea1;

public class Ejercicio18 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int counter = 0;
        for (int i = 3; i <= 2000; ++i, a = b, b = c) {
            c = a + b;
            if (c >= 1000 && c <= 2000)
                ++counter;
        }
        System.out.println("\nEn el rango 1000 >= x <= 2000 se encuentran "
                + counter+ " elementos.");
    }
}
