/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Roberto Carlos", "robertoc@mail.com");
        Documento doc = new Documento("Mi Documento", "Blablabla", "asdfg", "2025-10-24", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Firma Hash: " + doc.getFirma().getCodigoHash());

    }
}
