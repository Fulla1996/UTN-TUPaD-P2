/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fulla
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        Libro miLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(miLibro);
    }
    public void listarLibros(){
        for (Libro l : libros){
            l.mostrarInfo();
        }
    }
    
    public int buscarLibroIsbn(String isbn){
        int ret = -1;
        for(int i = 0; i < libros.size(); i++){
            if (libros.get(i).getIsbn() == isbn)
            {
                ret = i;
                break;
            }
                
        }
        return ret;
    }
    
    public void mostrarLibroIsbn(String isbn){
        int index = buscarLibroIsbn(isbn);
        if (index != -1)
        {
            libros.get(index).mostrarInfo();
        }
        else{
            System.out.println("Libro no encontrado");
        }
    }
    
    public void eliminarLibro(String isbn){
        int index = buscarLibroIsbn(isbn);
        if (index != -1)
        {
            libros.remove(index);
        }
    }
    
    public int obtenerCantidadLibros(){
        return libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        ArrayList<Libro> ret = new ArrayList<>();
        
        for (Libro l : libros){
            if(l.getAnioPublicacion() == anio){
                ret.add(l);
            }
        }
        
        return ret;
        
    }
    
    public Set<Autor> mostrarAutoresDisponibles(){
        Set<Autor> autores = new HashSet();
        for (Libro l : libros){
            autores.add(l.getAutor());
        }
        return autores;
    }
}
