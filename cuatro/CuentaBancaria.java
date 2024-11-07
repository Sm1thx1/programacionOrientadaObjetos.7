package javaEjercicios.cuatro;

public class CuentaBancaria {
    private double saldo;
    private String numeroDeCuenta;

    public CuentaBancaria(String numeroDeCuenta, double saldoInicial) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Saldo insuficiente para retirar " + monto);
        }
        saldo -= monto;
        System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
    }
}