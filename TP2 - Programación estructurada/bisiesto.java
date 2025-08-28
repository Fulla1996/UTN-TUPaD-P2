
import java.util.Scanner;

public class bisiesto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anio;

        System.out.println("Ingrese un año: ");

        anio = scanner.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es un año bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es un año bisiesto.");
        }
    }
}