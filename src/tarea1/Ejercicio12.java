package tarea1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        while ((numero = scanner.nextInt()) >= 0)
            System.out.println(numero*numero);
    }
}
