/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad10;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Titular titular = new Titular("Roberto Carlos", "123456789");
        ClaveSeguridad cs = new ClaveSeguridad("pass", "2025-10-24");
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 100000.0, "pass", "2025-10-24");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());

    }
}
