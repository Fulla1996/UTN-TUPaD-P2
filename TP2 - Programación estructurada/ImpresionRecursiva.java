public class ImpresionRecursiva {
    
    static void imprimirRecursivo(double[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        
        // Imprimir el elemento actual
        System.out.println("Precio " + (index + 1) + ": $" + arr[index]);
        
        // Llamada recursiva para el siguiente elemento
        imprimirRecursivo(arr, index + 1);
    }
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        precios[2] = 129.99; // Se modifica el precio
        
        System.out.println("Precios actualizados:");
        imprimirRecursivo(precios, 0);
    }
}
