package javaEjercicios.tres;

public class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected int idEmpleado;

    public Empleado(String nombre, double salarioBase, int idEmpleado) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.idEmpleado = idEmpleado;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
}