
package Ejercicio3;

/**
 *
 * @author Fulla
 */
public class Main {
    public static void main(String[] args) {
        
        Universidad miUni = new Universidad("UTN");
        
        Profesor profesor1 = new Profesor("123", "Pablo", "IT");
        Profesor profesor2 = new Profesor("456", "Marcelo", "Matemáticas");
        Profesor profesor3 = new Profesor("789", "Roberto", "Física");
        
        Curso curso1 = new Curso("asd", "A1", profesor1);
        Curso curso2 = new Curso("qwe", "A2", profesor2);
        Curso curso3 = new Curso("zxc", "A3", profesor3);
        Curso curso4 = new Curso("poi", "A4");
        Curso curso5 = new Curso("lkj", "A5");
        
        miUni.agregarCurso(curso1);
        miUni.agregarCurso(curso2);
        miUni.agregarCurso(curso3);
        miUni.agregarCurso(curso4);
        miUni.agregarCurso(curso5);
        
        miUni.agregarProfesor(profesor1);
        miUni.agregarProfesor(profesor2);
        miUni.agregarProfesor(profesor3);
        
        //Se asignan profesores a cursos sin profesor
        miUni.asignarProfesorACurso("poi", "123");
        miUni.asignarProfesorACurso("ikj", "456");
        
        miUni.listarCursos();
        miUni.listarProfesores();
        
        System.out.println("Datos antes de modificar");
        miUni.mostrarCursoPorCodigo("qwe");
        miUni.mostrarProfesorPorId("789");
        miUni.asignarProfesorACurso("qwe", "789");
        System.out.println("Datos despues de modificar");
        miUni.mostrarCursoPorCodigo("qwe");
        miUni.mostrarProfesorPorId("789");
        
        System.out.println("Cursos antes de eliminar");
        miUni.mostrarProfesorPorId("789");
        miUni.eliminarCurso("qwe");
        System.out.println("Cursos despues de eliminar");
        miUni.mostrarProfesorPorId("789");
        
        System.out.println("Curso con profesor a eliminar");
        miUni.mostrarCursoPorCodigo("ikj");
        miUni.eliminarProfesor("456");
        System.out.println("Curso con profesor eliminado");
        miUni.mostrarCursoPorCodigo("ikj");
        
        System.out.println("Reporte general de profesores");
        miUni.listarProfesores();
    }

}
