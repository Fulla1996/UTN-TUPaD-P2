/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio1;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        
        Inventario miInventario = new Inventario();
        Producto p1 = new Producto("1", "Camisa", 3000.0, 2, CategoriaProducto.ROPA);
        Producto p2 = new Producto("2", "Jean", 45000.0, 2, CategoriaProducto.ROPA);
        Producto p3 = new Producto("3", "Plato", 2000.0, 2, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("4", "Notebook", 500000.0, 2, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("5", "Arroz", 1000.0, 2, CategoriaProducto.ALIMENTOS);
        
        miInventario.agregarProducto(p1);
        miInventario.agregarProducto(p2);
        miInventario.agregarProducto(p3);
        miInventario.agregarProducto(p4);
        miInventario.agregarProducto(p5);
        
        System.out.println("Listado productos");
        miInventario.listarProductos();
        System.out.println("Producto por ID. Ej.: 2");
        miInventario.mostrarProducto("2");
        
        System.out.println("Productos por categoría. Ej.: ROPA");
        for(Producto p : miInventario.filtrarPorCategoria(CategoriaProducto.ROPA)){
            p.MostrarInfo();
        }
        
        System.out.println("Eliminar producto. Ej.: 3");
        miInventario.eliminarProducto("3");
        miInventario.listarProductos();
        
        System.out.println("Actualizar stock producto. Ej. 2");
        miInventario.actualizarStock("2", 10);
        
        System.out.println("El producto con mayor stock es: ");
        miInventario.obtenerProductoConMayorStock().MostrarInfo();
        
        System.out.println("Los productos con precios entre 1000 y 3000 son: ");
        for (Producto p : miInventario.filtrarProductosPorPrecio(1000, 3000)){
            p.MostrarInfo();
        }
        
        System.out.println("Las categorías disponibles son: ");
        miInventario.mostrarCategoriasDisponibles();
    }
}
