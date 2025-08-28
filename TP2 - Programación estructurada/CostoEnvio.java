
import java.util.Scanner;

public class CostoEnvio {
    static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional"))
            return peso * 5;
        else 
            return peso * 10;
    }

    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {

        double precio, peso;
        String zona;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese el peso del producto: ");
        peso = scanner.nextDouble();
        scanner.nextLine();
        do{
            
            System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
            zona = scanner.nextLine();
        }while(!zona.equalsIgnoreCase("Nacional") && !zona.equalsIgnoreCase("Internacional"));


        System.out.println("El costo de envío es: " + calcularCostoEnvio(peso, zona));
        System.out.println("El total a pagar es: " + calcularTotalCompra(precio, calcularCostoEnvio(peso, zona)));
    }
}
