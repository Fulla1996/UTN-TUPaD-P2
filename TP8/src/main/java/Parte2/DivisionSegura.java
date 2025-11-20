/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author Fulla
 */
public class DivisionSegura {
    public static int DividirSeguro(int a, int b) throws ArithmeticException{
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("ERROR División por 0");
            return 0;
        }
    }
}
