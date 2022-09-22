package tarea2;

public class Persona {

    Persona(String numeroDocumentoIdentidad) {
        numeroDocumentoIdentidad_ = numeroDocumentoIdentidad;
        nombre_ = apellidos_ = "";
    }

    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad) {
        this(numeroDocumentoIdentidad);
        nombre_ = nombre;
        apellidos_ = apellidos;
    }

    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int edad) {
        this(nombre, apellidos, numeroDocumentoIdentidad);
        edad_ = edad;
    }

    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int edad, boolean casado) {
        this(nombre, apellidos, numeroDocumentoIdentidad, edad);
        casado_ = casado;
    }

    public void nombre(String nombre) throws IllegalArgumentException {
        if (nombre.isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacio!");
        nombre_ = nombre_;
    }

    public String nombre() {
        return nombre_;
    }

    public void apellidos(String apellidos) {
        if (apellidos.isEmpty())
            throw new IllegalArgumentException("El apellido no puede estar en blanco");
        this.apellidos_ = apellidos;
    }

    public String apellidos() {
        return apellidos_;
    }

    public String nombreCompleto() {
        if (nombre().isEmpty() && apellidos().isEmpty())
            return "";
        return nombre_ + " " + apellidos_;
    }

    public String numeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad_;
    }

    public void edad(int edad) {
        edad_ = edad;
    }

    public int edad() {
        return edad_;
    }

    public void casado(boolean casado) {
        casado_ = casado;
    }

    public boolean isCasado() {
        return casado_;
    }

    public void profesion(String profesion) {
        profesion_ = profesion;
    }

    public String profesion() {
        return profesion_;
    }

    private String identificador() {
        return !nombreCompleto().isEmpty() ? nombreCompleto() : numeroDocumentoIdentidad();
    }
    public void caminar() {
        System.out.printf("%s esta caminando", identificador());
    }

    public void trabajar() {
        System.out.printf("%s esta trabajando como %s.\n", identificador(), profesion());
    }

    public void irACasa() {
        caminar();
        System.out.println(" hacia la casa.");
    }

    public String casadoToString() {
        return (isCasado() ? "" : "no") + " esta casado";
    }

    public void detalles() {
        System.out.println(
                "Nombre(s): " + nombre()
                + "\nApellido(s): " + apellidos()
                + "\nCedula: " + numeroDocumentoIdentidad()
                + "\nProfesion: " + profesion()
                + "\nEdad: " + edad()
                + "\nCasado: " + casadoToString()
        );
    }

    private String nombre_;
    private String apellidos_;
    private final String numeroDocumentoIdentidad_;
    private String profesion_;
    private int edad_;
    private boolean casado_;
}

class TestPerson {
    public static void main(String[] args) {
        Persona maria = new Persona("Maria", "Perez", "854123697");
        maria.caminar();
        System.out.println(".");
        maria.profesion("Abogada");
        System.out.println(maria.nombreCompleto() + " es " + maria.profesion() + ".");
        maria.irACasa();

        Persona pablo = new Persona("879641235");
        pablo.profesion("Policia");
        pablo.trabajar();
        pablo.irACasa();

        Persona juan = new Persona("Juan", "Hernandez", "25601247", 50);
        juan.profesion("Profesor");
        juan.detalles();
        juan.trabajar();

        Persona paloma = new Persona("Paloma", "Dilone", "7512369", 21, false);
        paloma.profesion("Empresaria");
        paloma.irACasa();
        paloma.detalles();

        Persona darlin = new Persona("Darlin", "Gonzalez", "25870369871", 40, true);
        darlin.profesion("Estudiante");
        darlin.irACasa();
        darlin.detalles();

        Persona manolo = new Persona("Manolo", "Manolillo", "123541", 50);
        manolo.trabajar();
        manolo.irACasa();
        System.out.println(manolo.nombreCompleto() + " " + manolo.casadoToString());

        Persona hilario = new Persona("0201030405");
        hilario.profesion("Profesor");
        hilario.detalles();
        hilario.trabajar();
    }
}