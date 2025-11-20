/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp8;

import java.util.ArrayList;

/**
 *
 * @author Fulla
 */
public class Pedido implements Pagable {

    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente = new Cliente();
    
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos){
            total+= p.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(){
        System.out.println("Se cambia de estado");
        cliente.notificar("El pedido a cambiado de estado.");
    }
    
}
