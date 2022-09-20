package tarea1;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        int numbers = 15;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 15 numeros:");
        while (numbers-- != 0)
            suma += scanner.nextInt();
        System.out.println("La suma es: " + suma);
    }
}
