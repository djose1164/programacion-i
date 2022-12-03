package tarea3.familias;

import tarea3.actividades.IRecreacion;
import tarea3.humanos.Humano;

public abstract class Familia implements IRecreacion {

    public Familia(int numMiembros, String familia) {
        miembros_ = new Humano[numMiembros];
        familia_ = familia;
    }

    public String toString() {
        return "Familia " + familia_;
    }

    abstract public void soy();

    public void anadirMiembro(Humano nuevoMiembro) {
        int i = 0;
        for (Humano miembro : miembros_) {
            if (miembro == null) {
                miembros_[i] = nuevoMiembro;
                break;
            }
            ++i;
        }
    }

    public String familia() {
        return familia_;
    }

    abstract public void recreacionFamiliar();

    public void desplazarse() {
        System.out.println(this + " esta desplazandose:");
        for (Humano miembro :
                miembros_) {
            if (miembro != null)
                miembro.moverse();
        }
    }

    public void vidaDiaria() {
        for (Humano miembro :  miembros_)
            if (miembro != null)
                miembro.actividadesDiarias();
    }

    protected Humano[] miembros_;
    private final String familia_;
}
