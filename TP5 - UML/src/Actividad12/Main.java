/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad12;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Roberto Carlos", "20-132456789-0");
        Impuesto impuesto = new Impuesto(20000.0, contribuyente);
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto);
    }
}
