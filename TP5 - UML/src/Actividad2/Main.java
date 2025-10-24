/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Fulla
 */
public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Roberto Carlos", "123456789");
        Bateria bateria = new Bateria("Bateria", 5000);
        Celular celular = new Celular("Samsung", "S23", "123456789", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
    
}
