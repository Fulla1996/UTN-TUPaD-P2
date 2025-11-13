package Ejer3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) 
    {
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        EmpleadoPlanta e1 = new EmpleadoPlanta();
        EmpleadoPlanta e2 = new EmpleadoPlanta();
        EmpleadoTemporal e3 = new EmpleadoTemporal();
        EmpleadoTemporal e4 = new EmpleadoTemporal();
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        for(Empleado e : empleados) {
            System.out.println("El sueldo del empleado es: " + e.calcularSueldo(e));
        }
    }
    
}
