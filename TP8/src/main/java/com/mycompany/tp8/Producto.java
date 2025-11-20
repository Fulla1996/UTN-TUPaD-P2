/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp8;

/**
 *
 * @author Fulla
 */
public class Producto implements Pagable{

    private String nombre;
    private double precio;
    
    @Override
    public double calcularTotal() {
        return precio;
    }
    
}
