package tarea3;

public class Familia {
    public Familia(int numMiembros) {
        miembros_ = new Humano[numMiembros];
    }
    
    public void estudiar() {
        for (Humano miembro : miembros_)
            miembro.estudiar();
    }

    public void jugar() {
        for (Humano humano : miembros_)
            humano.verTV();
    }

    public void soy() {
        for (Humano miembro : miembros_)
            miembro.soy();
    }

    void anadirMiembro(Humano miembro) {
        for (int i = 0; i < miembros_.length; ++i)
            if (miembros_[i] == null)
                miembros_[i] = miembro;
    }

    private Humano[] miembros_;
}
