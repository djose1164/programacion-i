package tarea1;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        for (int num = scanner.nextInt(); num != 1; --num) {
            int fac = 1;
            System.out.print("El factorial de " + num + " es ");
            int tmp = num;
            while (tmp-- != 1)
                fac += fac * tmp;
            System.out.println(fac);
        }
    }
}
