/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad6;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto Carlos", "123456789");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-10-30", "22:00", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());

    }

}
