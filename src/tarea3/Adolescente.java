package tarea3;

public class Adolescente extends Humano {

    Adolescente(String nombre, String apellido, char sexo) {
        super(nombre, apellido, sexo);
    }

    @Override
    public void moverse() {
        System.out.println("Manejando una moto...");
    }

    @Override
    public void profesion() {
        System.out.println("Estudiante de secundaria.");
    }

    @Override
    public void soy() {
        System.out.println("Soy un adolescente.");
    }

    @Override
    public void estudiar() {
        System.out.println("Estudiando en la secundaria ...");
    }

    @Override
    public void verTV() {
        System.out.println("Viendo peliculas...");
    }
}
