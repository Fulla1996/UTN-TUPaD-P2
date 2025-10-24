/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad11;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Artista artista = new Artista("Linkin Park", "Rock");
        Cancion cancion = new Cancion("Faint", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion);

    }
}
