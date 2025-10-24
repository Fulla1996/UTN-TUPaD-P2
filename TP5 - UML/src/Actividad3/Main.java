/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("Jorge Luis Borges", "Argentino");
        Editorial editorial = new Editorial("Mi editorial", "Calle 123");
        Libro libro = new Libro("Ficciones", "123456789", editorial);
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }

}
