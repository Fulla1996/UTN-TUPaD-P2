
import java.util.Scanner;

public class descuentoGlobal {
    final static double DESCUENTO_GLOBAL = 0.10;
    
    static double calcularDescuentoEspecial(double precio){
        return precio * (1 - DESCUENTO_GLOBAL);
    }
    public static void main(String[] args) {
        double precio, descuentoAplicado;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        descuentoAplicado = precio - calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + calcularDescuentoEspecial(precio));


    }
}
