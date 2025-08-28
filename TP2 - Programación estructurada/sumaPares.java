
import java.util.Scanner;

public class sumaPares {
    public static void main(String[] args) {
        
        int numero, suma = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                suma += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + suma);
    }
}
