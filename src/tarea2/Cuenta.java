package tarea2;

public class Cuenta {

    Cuenta() {
        dineroDisponible = deuda = 0;
    }

    Cuenta(double dinero) {
        dineroDisponible = dinero;
        deuda = 0;
    }

    void ingreso(double cantidad) {
        if (cantidad < 1)
            System.out.println("Esto no deberia ser negativo");
        dineroDisponible += cantidad;
    }

    void reintegro(double cantidadAPagar) {
        if (dineroDisponible < cantidadAPagar) {
            System.out.println("No hay suficiente dinero disponible para el reintegro");
            return;
        } else if (deuda < cantidadAPagar) {
            System.out.println("No hay deuda que pagar!");
            return;
        }
        dineroDisponible -= cantidadAPagar;
        deuda -= cantidadAPagar;
    }

    void transferencia(double cantidad) {
        deuda += cantidad;
    }

    void detalles() {
        System.out.println("Dinero disponible: " + dineroDisponible + "\nDeuda: " + deuda);
    }

    private double dineroDisponible;
    private double deuda;
}

class TestCuenta {
    public static void main(String[] args) {
        Cuenta cuentaManager = new Cuenta(50000);
        cuentaManager.detalles();
        cuentaManager.transferencia(6987);
        cuentaManager.detalles();
        cuentaManager.reintegro(6987);
        cuentaManager.detalles();
        cuentaManager.ingreso(963.789);
        cuentaManager.reintegro(500);
        cuentaManager.transferencia(1500);
        cuentaManager.reintegro(147896320);
        cuentaManager.detalles();
    }
}
