
import java.util.Scanner;

public class precioFinal {

    //Se mantiene firma indicada en material, pero debería de tener en los parámetros el precio base
    static double calcularPrecioFinal(double impuesto, double descuento){
       return 1 + ((impuesto / 100) - (descuento / 100));
    }
    public static void main(String[] args) {
        double precioBase, impuesto, descuento;
        System.out.println("Ingrese el precio base del producto: ");
        Scanner scanner = new Scanner(System.in);
        precioBase = scanner.nextDouble();
        System.out.println("ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = scanner.nextDouble();
        System.out.println("ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = scanner.nextDouble();

        System.out.println("El precio final del producto es: " + precioBase * calcularPrecioFinal(impuesto, descuento));
    }
}
