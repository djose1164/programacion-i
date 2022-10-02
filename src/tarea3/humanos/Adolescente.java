package tarea3.humanos;

import tarea3.Estudiante;

public class Adolescente extends Humano implements Estudiante {

    public Adolescente(String nombre, String apellido, char sexo) {
        super(nombre, apellido, sexo);
    }

    @Override
    public void moverse() {
        System.out.println(nombreCompleto() + " esta manejando una moto...");
    }

    @Override
    public void soy() {
        System.out.println("Soy un adolescente.");
    }

    @Override
    public void estudiar() {
        System.out.println(nombreCompleto() + " estudiando en la secundaria ...");
    }

    @Override
    public void jugar() {
        System.out.println(nombreCompleto() + " esta jugando Pubg...");
    }

    @Override
    public void verTV() {
        System.out.println(nombreCompleto() + " Viendo peliculas...");
    }

    @Override
    public void escucharMusica() {
        System.out.println(nombreCompleto() + " Escuchando pop...");
    }

    @Override
    public void nivelEstudios(String nivelEstudios) {
        nivelEstudios_ = nivelEstudios;
    }

    @Override
    public String nivelEstudios() {
        return nivelEstudios_;
    }

    @Override
    public void actividadesDiarias() {
        jugar();
        estudiar();
        verTV();
    }

    String nivelEstudios_;
}
