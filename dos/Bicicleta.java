package javaEjercicios.dos;

public class Bicicleta extends Vehiculo {
    private int cantidadDeMarchas;

    public Bicicleta(String marca, String modelo, int cantidadDeMarchas) {
        super(marca, modelo);
        this.cantidadDeMarchas = cantidadDeMarchas;
    }

    @Override
    public void reservar() {
        System.out.println("La bicicleta " + getMarca() + " " + getModelo() + " ha sido reservada.");
    }

    @Override
    public void devolver() {
        System.out.println("La bicicleta " + getMarca() + " " + getModelo() + " ha sido devuelta.");
    }

    public int getCantidadDeMarchas() {
        return cantidadDeMarchas;
    }
}