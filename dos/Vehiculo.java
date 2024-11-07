package javaEjercicios.dos;

public abstract class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void reservar();

    public abstract void devolver();

    public String getMarca() {
        return marca;

    }

    public String getModelo() {
        return modelo;
    }
}
