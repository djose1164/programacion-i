package tarea3;

public class Adulto extends Humano {

    Adulto(String nombre, String apellido, char sexo) {
        super(nombre, apellido, sexo);
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

    @Override
    public void soy() {
        System.out.println("Soy un/a adulto/a");
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando en la universidad...");
    }

    @Override
    public void verTV() {
        System.out.println("Viendo noticias...");
    }

    private int aniosExperiencia_;
}
