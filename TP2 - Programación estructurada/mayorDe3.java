import java.util.Scanner;

public class mayorDe3 {
    public static void main(String[] args) {

        int[] nros = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nros.length; i++) {
            System.out.print("Ingrese el " + (i + 1) + "° número: ");
            nros[i] = scanner.nextInt();
            scanner.nextLine();
        }


        int mayor = nros[0];
        for (int i = 1; i < nros.length; i++) {
            if (nros[i] > mayor) {
                mayor = nros[i];
            }
        }

        System.out.println("El mayor es: " + mayor);
    }
}
