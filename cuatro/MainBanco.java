package javaEjercicios.cuatro;

public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 500.0);

        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(200.0);

        try {
            cuenta.retirar(100.0);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        try {
            cuenta.retirar(700.0);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}