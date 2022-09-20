package tarea1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        int suma = 0;
        int tmp = 0;
        Scanner scanner = new Scanner(System.in);
        while ((tmp = scanner.nextInt()) != 0)
            if (tmp == 0)
                break;
            else
                suma += tmp;
        System.out.println("Suma de todos los numeros: " + suma);
    }
}
