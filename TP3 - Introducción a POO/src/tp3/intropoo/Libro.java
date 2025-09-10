/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intropoo;

import java.time.Year;
/**
 *
 * @author Fulla
 */
public class Libro {
    private String titulo, autor;
    private int anioPublicacion = -99999;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    //Se conservan negativos hasta 1000 a.C ya que el parametro de antigüedad en un libro no es claro
    public void setAnioPublicacion(int anioPublicacion) {
        if (-1000 < anioPublicacion && anioPublicacion < Year.now().getValue())
            this.anioPublicacion = anioPublicacion;
        else 
            System.out.println("Año de publicación invalido");
    }
    
    public void mostrarInfo(){
        if (anioPublicacion != -99999)
            System.out.println(this.titulo + " - " + autor + " (" + anioPublicacion + ")");
        else
        {
            System.out.println("Libro con informacion incompleta, falta año.");
            System.out.println(titulo + " - " + autor);
        }   
    }
    
}
