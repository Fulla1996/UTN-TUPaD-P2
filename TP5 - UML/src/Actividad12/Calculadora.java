/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad12;

/**
 *
 * @author Fulla
 */
public class Calculadora {

    public void calcular(Impuesto impuesto) {
        System.out.println("Impuesto de: " + impuesto.getContribuyente().getNombre()+ "\nMonto: $" + impuesto.getMonto());
    }

}
