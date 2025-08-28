
import java.util.Scanner;

public class descuentoCategoria {
    public static void main(String[] args) {
        double precio, descuento = 0;
        char categoria;
        boolean catValida;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        scanner.nextLine();
        do {
        System.out.print("Ingrese la categoría del producto (A, B, C): ");
        categoria = scanner.next().charAt(0);
        scanner.nextLine();
         
            switch (categoria) {
            case 'a', 'A' -> {
                descuento = 0.2; // 20% de descuento
                catValida = true;
                }
            case 'b', 'B' -> {
                descuento = 0.15; // 15% de descuento
                catValida = true;
                }
            case 'c', 'C' -> {
                descuento = 0.1; // 10% de descuento
                catValida = true;
                }
            default -> {
                catValida = false;
                System.out.println("Categoría no valida.\nIntente nuevamente.");
                }
            }
        } while (!catValida);

       System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
       System.out.println("Precio final: " + (precio * (1.0 - descuento)));
    }
}