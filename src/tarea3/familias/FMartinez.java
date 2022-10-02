package tarea3.familias;

import tarea3.humanos.Humano;

public class FMartinez extends Familia {
    public FMartinez(int numMiembros) {
        super(numMiembros, "Martinez");
    }

    @Override
    public void recreacionFamiliar() {
        for (Humano miembro : miembros_)
            if (miembro != null)
                miembro.verTV();
    }

    @Override
    public void soy() {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("Familia " + familia());
    }
}
