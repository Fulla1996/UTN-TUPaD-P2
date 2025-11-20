/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp8;

/**
 *
 * @author Fulla
 */
public class TarjetaCredito implements Pago, PagoConDescuento{

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Se paga $" + monto + " con tarjeta de crédito.");
        return true;
    }

    @Override
    public double aplicarDescuento(double monto) {
        System.out.println("Se aplica 10% de descuento a " + monto);
        return monto*0.9;
    }
    
}
