/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Roberto Carlos", "123456789");
        Computadora pc = new Computadora("ASUS", "123456789", "Vivebook", "550");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());

    }

}
