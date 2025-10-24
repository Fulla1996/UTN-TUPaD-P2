/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto Carlos", "123456789");
        Banco banco = new Banco("Banco Santander", "30-99999999-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-1234-1324-1234", "12/30", banco);
        cliente.setTarjeta(tarjeta);
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());

    }

}
