package tarea3;

import tarea3.familias.FMartinez;
import tarea3.familias.FSanchez;
import tarea3.humanos.Adolescente;
import tarea3.humanos.Adulto;
import tarea3.humanos.Infante;

public class Main {
    public static void main(String[] args) {
        FSanchez sanchez = new FSanchez(8);
        FMartinez martinez = new FMartinez(8);

        sanchez.anadirMiembro(new Adulto("Juan", "Sanchez", 'M'));
        sanchez.anadirMiembro(new Infante("Gloria", "Sanchez", 'F'));
        sanchez.anadirMiembro(new Adolescente("Juanito", "Sanchez", 'M'));

        martinez.anadirMiembro(new Adulto("Maria", "Martinez", 'F'));

        sanchez.soy();
        sanchez.recreacionFamiliar();
        sanchez.vidaDiaria();

        martinez.soy();
        martinez.recreacionFamiliar();
        martinez.desplazarse();
        martinez.vidaDiaria();

    }
}
