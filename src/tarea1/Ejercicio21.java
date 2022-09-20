package tarea1;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        final int max = scanner.nextInt();

        int suma = 0;
        int num = max;
        for (; num != 0; --num) {
            int fac = 1;
            int tmp = num;
            while (tmp-- != 1)
                fac += fac * tmp;

            System.out.printf("El factorial de %d es %d\n", num, fac);
            suma += fac;
        }

        System.out.println("El promedio de los factoriales es: " + suma/max);
    }
}
