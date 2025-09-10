/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intropoo;

/**
 *
 * @author Fulla
 */
public class NaveEspacial {
    private final static double MAXIMO_COMBUSTIBLE = 100.0;
    private String nombre;
    private double combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void recargarCombustible(double cantidad){
        if (cantidad > 0){
            this.combustible = Math.min(combustible + cantidad, MAXIMO_COMBUSTIBLE);
        }
        else
            System.out.println("Solo se admiten cantidades positivas.");
    }
    public void avanzar(double distancia){
        if (distancia < combustible)
        {
            combustible -= distancia;
            System.out.println("Se avanzaron " + distancia + " unidades.");
        }
        else
        {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nuestra nave \"" + nombre + "\" tiene " + combustible + " unidades de combustible.");
    }
}
