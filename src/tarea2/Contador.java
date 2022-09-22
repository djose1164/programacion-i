package tarea2;

public class Contador {

    Contador() {
        contador = 0;
    }

    Contador(int valorInicial) {
        contador = valorInicial;
    }

    public void incrementar() {
        ++contador;
        System.out.println("Contador incrementado.");
    }

    public void decrementar() {
        --contador;
        System.out.println("Contador decrementado.");
    }

    public int getContador() {
        return contador;
    }

    private int contador;
}

class TestContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        Contador contador1 = new Contador(5);
        contador.incrementar();
        contador.incrementar();
        contador1.decrementar();
        System.out.println("contador1: " + contador1.getContador());
        System.out.println("contador: " + contador.getContador());
    }
}