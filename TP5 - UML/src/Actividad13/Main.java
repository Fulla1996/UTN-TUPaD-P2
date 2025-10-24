/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad13;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario("Roberto Carlos", "robertoc@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("qwerty123", user);

    }
}
