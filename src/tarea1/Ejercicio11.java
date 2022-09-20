package tarea1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0-10");
        int nota = scanner.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Insuficiente");
                break;
            case 7:
            case 8:
                System.out.println("Suficiente");
                break;
            case 9:
            case 10:
                System.out.println("Bien");
                break;
            default:
                throw new Exception("Nota fuera del rango aceptado!");
        }
    }
}
