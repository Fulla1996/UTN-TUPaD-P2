/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author Fulla
 */
public class ConvertirTexto {
    public static int ConvertirAInt(String cadena){
        try{
            return Integer.parseInt(cadena);
        }
        catch(NumberFormatException e){
            System.out.println("La cadena ingresada no es un numero entero");
            return 0;
        }
    }
}
