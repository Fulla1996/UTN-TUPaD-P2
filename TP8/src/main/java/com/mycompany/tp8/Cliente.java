/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp8;

/**
 *
 * @author Fulla
 */
public class Cliente implements Notificable{

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificación al cliente: " + mensaje);
    }
    
}
