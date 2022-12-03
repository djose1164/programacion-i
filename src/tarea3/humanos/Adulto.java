package tarea3.humanos;

import tarea3.actividades.Trabajo;

public class Adulto extends Humano implements Trabajo {

    public Adulto(String nombre, String apellido, char sexo) {
        super(nombre, apellido, sexo);
    }

    @Override
    public void moverse() {
        System.out.println(nombreCompleto() + " esta conduciendo un coche...");
    }


    @Override
    public void soy() {
        System.out.println("Soy un/a adulto/a");
    }

    @Override
    public void jugar() {
        System.out.println("Jugando domino...");
    }

    @Override
    public void verTV() {
        System.out.println(nombreCompleto() + " esta viendo noticias...");
    }

    @Override
    public void escucharMusica() {
        System.out.println(nombreCompleto() + " esta escuchando bachata...");
    }

    @Override
    public void salario(int salario) {
        salario_ = salario;
    }

    @Override
    public int salario() {
        return salario_;
    }

    @Override
    public void tiempoExperiencia(int anios) {
        tiempoExperiencia_  = anios;
    }

    @Override
    public int tiempoExperiencia() {
        return tiempoExperiencia_;
    }

    @Override
    public void ocupacion(String ocupacion) {
        ocupacion_ = ocupacion;
    }

    @Override
    public String ocupacion() {
        return ocupacion_;
    }

    @Override
    public void trabajar() {
        System.out.println(nombreCompleto() + " Trabajando como " + ocupacion_);
    }

    @Override
    public void actividadesDiarias() {
        trabajar();
        verTV();
    }

    private int salario_;
    private int tiempoExperiencia_;
    private String ocupacion_;
}
