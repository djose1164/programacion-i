package tarea1;

public class Ejercicio16 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + ", " + b);
        for (byte i = 3; i < 100; ++i, a = b, b = c)
            System.out.print(", " + (c = a + b));
        System.out.println("");
    }
}
