
import java.util.Scanner;

public class CalcularStock {
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;        
        return nuevoStock;
    }
    public static void main(String[] args) {
        int stockActual, cantidadVendida, cantidadRecibida;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el stock actual del producto: ");
        stockActual = scanner.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = scanner.nextInt();
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = scanner.nextInt();

        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));

    }
}
