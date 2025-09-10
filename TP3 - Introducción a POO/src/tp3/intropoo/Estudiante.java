/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intropoo;

/**
 *
 * @author Fulla
 */
public class Estudiante {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    public void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " del curso " + curso + " tuvo clasificación: " + calificacion);
    }
    public void subirCalificacion(int puntos){
        if (puntos > 0)
            calificacion += puntos;
    }
    public void bajarCalificacion(int puntos){
        if (puntos > 0)
            calificacion -= puntos;
    }
}
