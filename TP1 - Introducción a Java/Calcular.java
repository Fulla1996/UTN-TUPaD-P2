
import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        int a,b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el segundo número: ");
        b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("La suma es: " + (a + b));
        System.out.println("La resta es: " + (a - b));
        System.out.println("La multiplicación es: " + (a * b));
        System.out.println("La división entera es: " + (a / b));
        System.out.println("La división decimal es: " + ((double)a / b));
    }
}
