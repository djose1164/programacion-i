package tarea2;

public class Fraccion {

    Fraccion () {
        numerador_ = denominador_ = 1;
    }

    Fraccion(int numerador) {
        this();
        numerador_ = numerador;
    }

    public int numerador() {
        return numerador_;
    }

    public int denominador() {
        return denominador_;
    }

    Fraccion(int numerador, int denominador) {
        this(numerador);
        denominador_ = denominador;
    }

    public Fraccion sumar(Fraccion other) {
        int a = numerador_*other.denominador_ + denominador_*other.numerador_;
        int b = denominador_ * other.denominador_;
        return new Fraccion(a, b);
    }

    public Fraccion restar(Fraccion other) {
        int a = numerador_*other.denominador_ - denominador_*other.numerador_;
        int b = denominador_ * other.denominador_;
        return new Fraccion(a, b);
    }

    public Fraccion multiplicar(Fraccion other) {
        int a = numerador_*other.numerador_;
        int b = denominador_ * other.denominador_;
        return new Fraccion(a, b);
    }

    public Fraccion dividir(Fraccion other) {
        int a = numerador_*other.denominador_;
        int b =  denominador_*other.numerador_;
        return new Fraccion(a, b);
    }

    public String toString() {
        return numerador_ + "/" + denominador_;
    }

    private int numerador_;
    private int denominador_;
}

class TestFracciones {
    public static void main(String[] args) {
        Fraccion fraccion = new Fraccion(10, 2);
        Fraccion a = fraccion.sumar(new Fraccion(5, 2));
        Fraccion b = fraccion.restar(a);
        System.out.println(fraccion.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
