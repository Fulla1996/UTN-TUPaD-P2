package Ejer1;
/**
 *
 * @author Fulla
 */
public class Auto extends Vehiculo 
{ 
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantidadDePuertas);
    }
    
}
