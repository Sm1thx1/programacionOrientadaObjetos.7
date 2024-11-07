package javaEjercicios.uno;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        setVelocidadMaxima(velocidadMaxima);
    }

    public String getMarca() {
        return marca;

    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima > 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad máxima no puede ser negativa. Se asignará 0 km/h por defecto.");
            this.velocidadMaxima = 0;
        }
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + "km/h");
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("La nueva velocidad máxima es: " + velocidadMaxima + " km/h");
        } else {
            System.out.println("El incremento debe ser positivo.");
        }
    }
}