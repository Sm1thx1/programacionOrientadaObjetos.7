package javaEjercicios.tres;

public class MainNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        // Crear empleados
        Gerente gerente = new Gerente("Laura", 5000, 1, 2000);
        Desarrollador desarrollador = new Desarrollador("Carlos", 4000, 2, 1500);
        Diseñador diseñador = new Diseñador("Ana", 3500, 3, 1000);

        // Agregar empleados a la nómina
        nomina.agregarEmpleado(gerente);
        nomina.agregarEmpleado(desarrollador);
        nomina.agregarEmpleado(diseñador);

        // Calcular y mostrar el salario total
        double salarioTotal = nomina.calcularSalarioTotal();
        System.out.println("Salario total de todos los empleados: $" + salarioTotal);
    }
}