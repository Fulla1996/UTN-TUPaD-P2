
import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        int pos = 0, neg = 0, ceros = 0;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                pos++;
            } else if (numero < 0) {
                neg++;
            } else {
                ceros++;
            }
        }


        System.out.println("Resultados:");
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + ceros);
    }
}
