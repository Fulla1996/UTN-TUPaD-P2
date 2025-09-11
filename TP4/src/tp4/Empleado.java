package tp4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fulla
 */
public class Empleado {
    private int id;
    private String nombre, puesto;
    private double salario;
    private static int totalEmpleados; //Contador global de empleados

    ///Se asume que la persona puede cambiar su nombre y puesto laboral
    ///El salario debe ser modificado utilizando la función
    ///No se puede modificar id
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    /**
     * Constructor completo
     * @param id Identificador único del empleado
     * @param nombre Nombre completo
     * @param puesto Cargo que desempeña
     * @param salario Salario actual
     */
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    /**
     * Constructor con id automático: MAX INT - Cantidad de empleados.
     * Salario automático: 1000
     * @param nombre Nombre completo
     * @param puesto Cargo que desempe{a
     */
    public Empleado(String nombre, String puesto){
        this(Integer.MAX_VALUE - totalEmpleados, nombre, puesto, 1000);
    }
    /**
     * Actualiza por valor en porcentaje.
     * Ej. Salario 1000, recibe porcentaje 10. Salario Final=1100
     * @param porcentaje 
     */
    public void actualizarSalario(double porcentaje){
        if (porcentaje > 0)
            salario *= 1.0 + (porcentaje / 100);
    }
    /**
     * Actualiza por valor fijo.
     * Ej. Salario 1000, recibe valorFijo 100. Salario Final=1100
     * @param valorFijo 
     */
    public void actualizarSalario(int valorFijo){
        if (valorFijo > 0)
            salario += valorFijo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
}
