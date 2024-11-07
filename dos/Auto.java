package javaEjercicios.dos;

public class Auto extends Vehiculo {
    private int cantidadDePasajeros;

    public Auto(String marca, String modelo, int cantidadDePasajeros) {
        super(marca, modelo);
        this.cantidadDePasajeros = cantidadDePasajeros;
    }

    @Override
    public void reservar() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " ha sido reservado.");
    }

    @Override
    public void devolver() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " ha sido devuelto.");
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }
}
