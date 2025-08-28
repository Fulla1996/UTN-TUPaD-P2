import java.util.Scanner;

public class clsificarEdad {
    public static void main(String[] args) {
        int edad;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();
        
        if (edad >= 18){
            System.out.println("Eres un Adulto.");
        }
        else{
            System.out.println("Eres un Niño.");
        }
    }
}