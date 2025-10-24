/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

/**
 *
 * @author Fulla
 */
public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Roberto Carlos", "12345678");
        Pasaporte pasaporte = new Pasaporte("AB123456", "2025-10-24", "foto.jpg", "JPG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
    
}
