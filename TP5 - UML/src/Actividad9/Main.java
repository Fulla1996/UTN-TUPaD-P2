/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad9;

/**
 *
 * @author Fulla
 */
public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Roberto Carlos", "OSER");
        Profesional profesional = new Profesional("Dr. Fabricio Pujato", "Dermatólogo");
        CitaMedica cita = new CitaMedica("2025-10-30", "12:00");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());

    }
}
