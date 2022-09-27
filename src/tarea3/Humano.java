package tarea3;

public abstract class Humano {

    Humano(String nombre, String apellido) {
        nombre_ = nombre;
        apellido_ = apellido;
    }

    Humano(String nombre, String apellido, int edad) {
        this(nombre, apellido);
        edad_ = edad;
    }

    Humano(String nombre, String apellido, int edad, char sexo) {
        this(nombre, apellido, edad);
        sexo_ = sexo;
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
        if (Character.toLowerCase(sexo) != 'f' || Character.toLowerCase(sexo) != 'm')
            throw new IllegalArgumentException("Sexo no valido.");
        sexo_ = sexo;
    }

    public char sexo() {
        return  sexo_;
    }

    public abstract void moverse();

    public abstract void profesion();

    private String nombre_;
    private String apellido_;
    private int edad_;
    private char sexo_;
}
