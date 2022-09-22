package tarea2;

public class Complejo {

    Complejo(double real, double img) {
        real_ = real;
        img_ = img;
    }

    Complejo sumar(Complejo otro) {
        return new Complejo(real_ + otro.real_, img_ + otro.img_);
    }

    Complejo restar(Complejo otro) {
        return new Complejo(real_ - otro.real_, img_ - otro.img_);
    }

    Complejo multiplicar(Complejo otro) {
        double real = real_ * otro.real_ - img_ * otro.img_;
        double img = real_*otro.img_ + img_*otro.real_;
        return new Complejo(real, img);
    }
    private Complejo reciproco() {
        double escala = real_*real_ + img_ * img_;
        return new Complejo(real_/escala, -img_/escala);
    }

    public Complejo dividir(Complejo otro) {
        return multiplicar(otro.reciproco());
    }

    public String toString() {
        return "re: " + real_ + "\tim: " + img_;
    }

    private final double real_;
    private final double img_;
}

class TestComplejo {
    public static void main(String[] args) {
        Complejo a = new Complejo(25, 8);
        Complejo b = a.sumar(new Complejo(1, 5));
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(new Complejo(12, 6).multiplicar(a).toString());
    }
}
