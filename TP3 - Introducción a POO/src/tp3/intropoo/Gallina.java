/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.intropoo;

/**
 *
 * @author Fulla
 */
public class Gallina {
    private static int contGallinas = 0;
    private int idGallina, edad, huevosPuestos;
    
    public Gallina(int edad){
        this.idGallina = ++contGallinas;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
    }
    public void ponerHuevo(int huevos){
        huevosPuestos += huevos;
    }
    
    public void envejecer(){
        edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("La gallina " + idGallina + ", tiene " + edad + " años de edad y ha puesto " + huevosPuestos + " huevos.");
    }
    
}
