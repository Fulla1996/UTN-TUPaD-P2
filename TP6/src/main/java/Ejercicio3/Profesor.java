/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Fulla
 */
public class Profesor {
    private String id, nombre, especialidad;
    private Set<Curso> cursos = new HashSet<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void agregarCurso(Curso c){
        cursos.add(c);
        c.setProfesor(this);
    }
    public void eliminarCurso(Curso c){
        cursos.remove(c);
        c.setProfesor(null);
    }
    public void eliminarCursos(){
        for (Curso c : cursos)
        {
            c.setProfesor(null);
        }
        cursos.clear();
    }
    
    public void listarCursos(){
        for (Curso c : cursos){
            c.mostrarInfo();
        }
    }

    public void mostrarInfo(){
        System.out.println("Codigo: " + id + ". Nombre: " + nombre + ". Especialidad: " + especialidad +". Cantidad de cursos: " + cursos.size());
    }
}
