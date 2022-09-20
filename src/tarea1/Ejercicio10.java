package tarea1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros seguidos de Enter:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 == num2)
            System.out.println("Iguales");
        else
            System.out.println("NO son iguales");
    }
}
