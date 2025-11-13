package Ejer2;
/**
 *
 * @author Fulla
 */
public class Circulo extends Figura
{
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public void calcularArea(){
        System.out.println("El area del cirulo " + nombre + " es: " +  (radio *  Math.PI));
    }
}
