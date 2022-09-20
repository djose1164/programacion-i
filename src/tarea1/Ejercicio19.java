package tarea1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = scanner.nextInt();
        int fac = 1;
        System.out.print("El factorial de " + num + " es ");
        while (num-- != 1)
            fac += fac * num;
        System.out.println(fac);
    }
}
