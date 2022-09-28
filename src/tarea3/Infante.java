package tarea3;

public class Infante extends Humano {
    Infante(String nombre, String apellido, char sexo) {
        super(nombre, apellido, sexo);
    }

    public void jugar() {
        System.out.println("Jugando...");
    }

    public void estudiar() {
        System.out.println("Estudiando en la primaria ...");
    }

    @Override
    public void moverse() {
        System.out.println("Caminando...");
    }

    @Override
    public void profesion() {
        System.out.println("Estudiante de primaria.");
    }

    @Override
    public void soy() {
        System.out.println("Soy un infante.");
    }

    @Override
    public void verTV() {
        System.out.println("Viendo caricaturas...");
    }
}
