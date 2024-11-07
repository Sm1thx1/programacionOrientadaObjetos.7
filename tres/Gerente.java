package javaEjercicios.tres;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, int idEmpleado, double bono) {
        super(nombre, salarioBase, idEmpleado);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}