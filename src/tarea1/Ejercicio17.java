package tarea1;

public class Ejercicio17 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int suma = 0;
        System.out.print(a + ", " + b);
        for (int i = 3; i < 1000; ++i, a = b, b = c, suma += c)
            System.out.print(", " + (c = a + b));
        System.out.println("\nEl promedio es: " + suma/1000);
    }
}
