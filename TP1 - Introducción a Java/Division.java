
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a, b = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a dividir: ");
        a = scanner.nextInt();
        scanner.nextLine();
        do {
            System.out.print("Ingrese el divisor: ");
            b = scanner.nextInt();
            scanner.nextLine();
            if (b == 0) {
                System.out.println("No se puede dividir por 0, ingrese otro número");
            }
        } while (b == 0);

        System.out.println("El resultado de la división entera es: " + (a / b));
        System.out.println("El resultado de la división decimal es: " + ((double)a / b));

        if ((a/b) == ((double)a / b)) {
            System.out.println("La división entera y la división decimal son iguales.");
        } else {
            System.out.println("La división entera y la división decimal son diferentes.");
        }
    }
}
