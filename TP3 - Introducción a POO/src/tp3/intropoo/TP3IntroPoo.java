package tp3.intropoo;
/**
 *
 * @author Fulla
 */
public class TP3IntroPoo {

    public static void main(String[] args) {
        
        //Ejercicio 1
        Estudiante e = new Estudiante();
        e.setApellido("Fulladoza");
        e.setNombre("Pablo");
        e.setCurso("Comisión 14");
        
        e.subirCalificacion(90);
        
        e.mostrarInfo();
        e.bajarCalificacion(20);
        e.mostrarInfo();
        
        //Ejercicio 2
        Mascota m = new Mascota("Mostaza", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
        
        //Ejercicio 3
        Libro l = new Libro();
        l.setTitulo("Cómo programar en Java");
        l.setAutor("H. M. Deitel");
        
        l.setAnioPublicacion(2030); //Fecha invalida
        l.mostrarInfo();
        l.setAnioPublicacion(2003); //Fecha valida
        l.mostrarInfo();
        
        //Ejercicio 4
        Gallina g = new Gallina(2);
        Gallina g2 = new Gallina(1);
        g.mostrarEstado();
        g.ponerHuevo(3);
        g.envejecer();
        g.mostrarEstado();
        g2.ponerHuevo();
        g2.mostrarEstado();
        
        //Ejercicio 5
        NaveEspacial n = new NaveEspacial();
        n.setNombre("Apollo");
        n.recargarCombustible(50);
        n.mostrarEstado();
        n.avanzar(70);
        n.mostrarEstado();
        n.recargarCombustible(30);
        n.avanzar(70);
        n.mostrarEstado();
    }
    
}
