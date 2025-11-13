package Ejer3;

public abstract class Empleado 
{

    public double calcularSueldo(Empleado e) {
        if (e instanceof EmpleadoPlanta) {
            return 750000.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 500000.0;
        } else {
            return 0;
        }
    }
}
