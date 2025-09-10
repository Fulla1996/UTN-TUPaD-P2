/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intropoo;

/**
 *
 * @author Fulla
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(String nombre, String especie, int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("El " + especie + " " + nombre + " tiene " + edad + "años.");
    }
    
    public void cumplirAnios(){
        edad++;
    }
}
