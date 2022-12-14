package tarea3.humanos;

import tarea3.actividades.Entretenimiento;

public abstract class Humano implements Entretenimiento {

    public Humano(String nombre, String apellido) {
        nombre_ = nombre;
        apellido_ = apellido;
    }

    public Humano(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        edad_ = edad;
    }

    public Humano(String nombre, String apellido, char sexo) {
        this(nombre, apellido);
        sexo(sexo);
    }

    public void nombre(String nombre) {
        nombre_ = nombre;
    }

    public String nombre() {
        return nombre_;
    }

    public void apellido(String apellido) {
        apellido_ = apellido;
    }

    public String apellido() {
        return apellido_;
    }

    public void edad(int edad) {
        edad_ = edad;
    }

    public int edad() {
        return edad_;
    }

    public void sexo(char sexo) {
        sexo_ = sexo;
    }

    public char sexo() {
        return  sexo_;
    }

    public abstract void moverse();

    public abstract void soy();

    public String nombreCompleto() {
        return nombre_ + " " + apellido_;
    }

    abstract public void actividadesDiarias();

    private String nombre_;
    private String apellido_;
    private int edad_;
    private char sexo_;
}
