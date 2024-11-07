package javaEjercicios.tres;

public class Diseñador extends Empleado {
    private double bono;

    public Diseñador(String nombre, double salarioBase, int idEmpleado, double bono) {
        super(nombre, salarioBase, idEmpleado);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}