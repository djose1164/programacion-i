package tarea1;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        int suma = 0;
        for (; num != 0; --num) {
            int fac = 1;
            int tmp = num;
            while (tmp-- != 1)
                fac += fac * tmp;
            suma += fac;
        }

        System.out.println("La sumatoria de los factoriales es: " + suma);
    }
}
