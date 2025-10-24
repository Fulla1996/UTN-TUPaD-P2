/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Conductor conductor = new Conductor("Roberto Carlos", "12345679");
        Motor motor = new Motor("Nafta", "123456789");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Volkswagen Gol", motor);
        conductor.setVehiculo(vehiculo);

        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());

    }

}
