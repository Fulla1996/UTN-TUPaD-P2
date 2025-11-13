/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Fulla
 */
public class Main {
    
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca("Ateneo");
        Autor autor1 = new Autor("1", "Roberto", "Argentino");
        Autor autor2 = new Autor("2", "Robertinhio", "Brasilero");
        Autor autor3 = new Autor("3", "Robert", "Estadounidense");
        
        miBiblioteca.agregarLibro("123456", "Un libro Argentino", 2021, autor1);
        miBiblioteca.agregarLibro("456789", "Otro libro Argentino", 2023, autor1);
        miBiblioteca.agregarLibro("987654", "Un librinhio", 2021, autor2);
        miBiblioteca.agregarLibro("654321", "OneBook", 2023, autor3);
        miBiblioteca.agregarLibro("159753", "El libro Argentino", 2025, autor1);
        
        System.out.println("Listamos libros");
        miBiblioteca.listarLibros();
        
        System.out.println("Buscamos Libro. Ej. 123456");
        miBiblioteca.mostrarLibroIsbn("123456");
        
        System.out.println("Mostramos libros por año. Ej. 2021");
        for (Libro l : miBiblioteca.filtrarLibrosPorAnio(2021)){
            l.mostrarInfo();
        }
        
        System.out.println("Se elimina Libro. Ej. 654321");
        miBiblioteca.eliminarLibro("654321");
        miBiblioteca.listarLibros();
        
        System.out.println("La cantidad de libros en la biblioteca es de: ");
        System.out.println(miBiblioteca.obtenerCantidadLibros());
        
        System.out.println("Lista de Autores");
        for (Autor a : miBiblioteca.mostrarAutoresDisponibles())
        {
            a.mostrarInfo();
        }
    }
}
