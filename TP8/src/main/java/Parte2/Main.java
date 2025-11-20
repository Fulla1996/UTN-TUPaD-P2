/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author Fulla
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Division Segura");
        System.out.println(DivisionSegura.DividirSeguro(5, 2));
        System.out.println(DivisionSegura.DividirSeguro(5, 0));
        
        System.out.println("Convertir Texto");
        System.out.println(ConvertirTexto.ConvertirAInt("654"));
        System.out.println(ConvertirTexto.ConvertirAInt("asd"));
        
        System.out.println("Leer archivo datos.txt");
        LeerArchivo.LeerArchivo();
        
        System.out.println("Control de edad");
        try{
            ControlarEdad.validarEdad(50);
        }catch(EdadInvalidaException e){
            System.out.println("Error en la edad: " + e.getMessage());
        }
        try{
            ControlarEdad.validarEdad(130);
        }catch(EdadInvalidaException e){
            System.out.println("Error en la edad: " + e.getMessage());
        }
        
        System.out.println("Lectura archivo datos.txt with resources");
        LeerArchivoWithResources.LeerArchivoWR();
    }
}
