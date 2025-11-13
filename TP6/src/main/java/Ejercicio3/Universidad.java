/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Fulla
 */
public class Universidad {
        private String nombre;
        private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
        private ArrayList<Curso> cursos = new ArrayList<Curso>();

        public Universidad(String nombre) {
            this.nombre = nombre;
        }
        
        public void agregarProfesor(Profesor p){
            if (p != null)
                profesores.add(p);
        }
        
        public void agregarCurso(Curso c){
            if (c != null)
                cursos.add(c);
        }
        public int buscarProfesorPorId(String id){
            int index = -1;
            for (int i = 0; i< profesores.size(); i++)
            {
                if(id == profesores.get(i).getId()){
                    index = i;
                }
            }
            return index;
        }
        public void mostrarProfesorPorId(String id){
            profesores.get(buscarProfesorPorId(id)).mostrarInfo();
            profesores.get(buscarProfesorPorId(id)).listarCursos();
            
        }
        
        public int buscarCursoPorCodigo(String codigo){
            int index = -1;
            for (int i = 0; i< cursos.size(); i++)
            {
                if(codigo == cursos.get(i).getCodigo()){
                    index = i;
                }
            }
            return index;
        }
        public void mostrarCursoPorCodigo(String codigo){
            cursos.get(buscarCursoPorCodigo(codigo)).mostrarInfo();
        }
        
        public void asignarProfesorACurso(String codigoCurso, String idProfesor){
            int indexCurso = -1, indexProfesor = -1;
            
            indexCurso = buscarCursoPorCodigo(codigoCurso);
            indexProfesor = buscarProfesorPorId(idProfesor);
            
            if (indexCurso != -1 && indexProfesor != -1)
            {
                cursos.get(indexCurso).setProfesor(profesores.get(indexProfesor));
            }
            
        }
        
        public void listarProfesores(){
            for (Profesor p : profesores){
                p.mostrarInfo();
            }
        }
        public void listarCursos(){
            for (Curso c : cursos){
                c.mostrarInfo();
            }
        }
        
        public void eliminarCurso(String codigo){
            int index;
            index = buscarCursoPorCodigo(codigo);
            
            if (index != -1)
            {
                cursos.get(index).getProfesor().eliminarCurso(cursos.get(index));
                cursos.remove(index);
            }
            else{
                System.out.println("Curso no encontrado");
            }
        }
        
        public void eliminarProfesor(String id){
            int index;
            index = buscarProfesorPorId(id);
            
            if (index != -1)
            {
                profesores.get(index).eliminarCursos();
                profesores.remove(index);
            }
        }
}
