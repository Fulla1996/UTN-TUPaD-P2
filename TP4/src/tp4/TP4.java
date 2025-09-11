/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Fulla
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado a = new Empleado(1, "Pablo", "Gerente", 10000);
        Empleado b = new Empleado("Jacinto", "Programador");
        
        a.actualizarSalario(20.0);
        b.actualizarSalario(1000);
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(Empleado.mostrarTotalEmpleados());
    }
    
}
