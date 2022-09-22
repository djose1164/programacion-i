package tarea2;

public class Libro {

    Libro() {
        titulo_ = autor_ = ISBN_ = "";
        disponible_ = true;
    }

    Libro(String titulo, String autor, String ISBN) {
        titulo_ = titulo;
        autor_ = autor;
        ISBN_ = ISBN;
        disponible_ = true;
    }

    void prestamo() {
        disponible_ = false;
        System.out.println("El libro '" + titulo_ + "' escrito por '" + autor_ + "' ha sido prestado.");
    }

    void devolucion () {
        disponible_ = true;
        System.out.println("El libro '" + titulo_ + "' escrito por '" + autor_ + "' ha sido devuelto.");
    }

    public String toString() {
        return "Titulo: " + titulo_
                + "\nAutor: " + autor_
                + "\nISBN: " + ISBN_
                + "\nDisponible: " + disponible_;
    }

    void titulo(String titulo) {
        titulo_ = titulo;
    }

    public String titulo() {
        return titulo_;
    }

    void autor(String autor) {
        autor_ = autor;
    }

    public String autor() {
        return autor_;
    }

    public void ISBN(String ISBN) {
        ISBN_ = ISBN;
    }

    public String ISBN() {
        return ISBN_;
    }

    public boolean disponible() {
        return disponible_;
    }

    private String titulo_;
    private String autor_;
    private String ISBN_;
    private boolean disponible_;
}

class TestLibro {
    public static void main(String[] args) {
        Libro[] libros = new Libro[3];
        libros[0] = new Libro("La Manoza", "Juan Bosch", "15486841");
        libros[1] = new Libro();
        libros[2] = new Libro("El Cisne Negro", "Nassin Taleb", "12154879513");

        libros[1].titulo("El Poder de Los Habitos");
        libros[1].autor("Charles Duhigg");
        libros[1].ISBN("54841365");

        libros[2].prestamo();
        libros[1].prestamo();

        libros[1].devolucion();

        System.out.println("\nLibros disponibles");
        for (Libro libro : libros)
            if (libro.disponible())
                System.out.println(libro.toString());

        System.out.println("\nLibros prestados");
        for (Libro libro : libros)
            if (!libro.disponible())
                System.out.println(libro.toString());
    }
}
