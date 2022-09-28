package tarea3;

public class Main {
    public static void main(String[] args) {
        Familia sanchez = new Familia(8);
        Familia martinez = new Familia(8);

        sanchez.anadirMiembro(new Adulto("Juan", "Sanchez", 'M'));
        martinez.anadirMiembro(new Adulto("Pedro", "Martinez", 'M'));
        sanchez.estudiar();
        martinez.jugar();
    }
}
