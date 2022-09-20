package tarea1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 10 para ver su tabla de multiplicacion:");
        int num = scanner.nextInt();

        if (0 > num || num > 10)
            throw new IllegalArgumentException("Numero ingresado fuera de rango");

        for (int i = 0; i <= 10; i++)
            System.out.printf("%d x %d = %d\n", num, i, num*i);
    }
}
