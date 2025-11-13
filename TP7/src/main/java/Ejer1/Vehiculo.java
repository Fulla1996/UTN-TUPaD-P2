package Ejer1;
/**
 *
 * @author Fulla
 */
public class Vehiculo 
{
    private String marca;
    private String modelo;

   public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("Modelo: " + modelo + " . Marca: " + marca);
    }
}