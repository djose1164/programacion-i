package tarea3;

public class Hombre extends Humano {

    Hombre(String nombre, String apellido) {
        super(nombre, apellido);
        aniosExperiencia_ = 0;
    }

    Hombre(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    Hombre(String nombre, String apellido, int edad, char sexo) {
        super(nombre, apellido, edad, sexo);
    }

    @Override
    public void moverse() {
        System.out.println("Caminando...");
    }


    @Override
    public void profesion() {
        System.out.println("Empleado");
    }

    public void aniosExperiencia(int aniosExperiencia) {
        aniosExperiencia_ = aniosExperiencia;
    }

    public int aniosExperiencia() {
        return aniosExperiencia_;
    }

    private int aniosExperiencia_;
}
