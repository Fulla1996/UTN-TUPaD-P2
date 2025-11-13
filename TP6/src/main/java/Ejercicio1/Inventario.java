/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Fulla
 */
public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        if (p != null)
            productos.add(p);
    }
    public void listarProductos(){
        for (Producto p : productos){
            p.MostrarInfo();
        }
    }
    public int buscarProductoPorId(String id){
        int ret = -1;
        for(int i = 0; i < productos.size(); i++){
            if (productos.get(i).getId() == id)
            {
                ret = i;
                break;
            }
                
        }
        return ret;
    }
    
    public void mostrarProducto(String id){
        productos.get(buscarProductoPorId(id)).MostrarInfo();
    }
    
    public void eliminarProducto(String id){
        int index = buscarProductoPorId(id);
        if (index != -1){
            productos.remove(index);
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        int index = buscarProductoPorId(id);
        if (index != -1){
            productos.get(index).setCantidad(nuevaCantidad);
        }
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for(Producto p : productos){
            if(p.getCategoria() == categoria)
            {
                productosFiltrados.add(p);
            }
        }
        
        return productosFiltrados;
    }
    
    public int obtenerTotalStock(){
        int total = 0;
        
        for(Producto p : productos){
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock(){
        Producto productoMayorStock = productos.get(0);
        for(int i = 1; i < productos.size(); i++){
            if(productoMayorStock.getCantidad() < productos.get(i).getCantidad())
                productoMayorStock = productos.get(i);
        }
        
        return productoMayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for(Producto p : productos){
            if(p.getPrecio() > min && p.getPrecio() < max)
            {
                productosFiltrados.add(p);
            }
        }
        
        return productosFiltrados;
    }
    
    public void mostrarCategoriasDisponibles(){
        for(CategoriaProducto cat : CategoriaProducto.values()){
            System.out.println(cat.name() + " - " + cat.getDescripcion());
        }
    }
            
}
