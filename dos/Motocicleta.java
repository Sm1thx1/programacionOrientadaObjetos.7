package javaEjercicios.dos;

public class Motocicleta extends Vehiculo {
    private boolean tieneCascoIncluido;

    public Motocicleta(String marca, String modelo, boolean tieneCascoIncluido) {
        super(marca, modelo);
        this.tieneCascoIncluido = tieneCascoIncluido;
    }

    @Override
    public void reservar() {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " ha sido reservada.");
    }

    @Override
    public void devolver() {
        System.out.println("La motocicleta " + getMarca() + " " + getModelo() + " ha sido devuelta.");
    }

    public boolean isTieneCascoIncluido() {
        return tieneCascoIncluido;
    }
}
