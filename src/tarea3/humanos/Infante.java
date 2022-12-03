package tarea3.humanos;

public class Infante extends Humano {
    public Infante(String nombre, String apellido, char sexo) {
        super(nombre, apellido, sexo);
    }

    public void jugar() {
        System.out.println(nombreCompleto() + " esta jugando...");
    }


    @Override
    public void moverse() {
        System.out.println(nombreCompleto() + " esta caminando...");
    }

    @Override
    public void soy() {
        System.out.println("Soy un infante.");
    }

    @Override
    public void escucharMusica() {
        System.out.println("Escuchando musica...");
    }

    @Override
    public void verTV() {
        System.out.println(nombreCompleto() + " esta viendo One Piece...");
    }

    @Override
    public void actividadesDiarias() {
        jugar();
        verTV();
    }
}
