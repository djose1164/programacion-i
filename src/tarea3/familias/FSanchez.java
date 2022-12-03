package tarea3.familias;

import tarea3.humanos.Humano;

public class FSanchez extends Familia {
    public FSanchez(int numMiembors) {
        super(numMiembors, "Sanchez");
    }

    @Override
    public void soy() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Familia " + familia());
    }

    @Override
    public void recreacionFamiliar() {
        for (Humano miembro : miembros_)
            if (miembro != null)
                miembro.escucharMusica();
    }


}
