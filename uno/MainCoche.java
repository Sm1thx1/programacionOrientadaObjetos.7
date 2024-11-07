package javaEjercicios.uno;

public class MainCoche {
    public static void main(String[] args) {
        Coche coche = new Coche("Chevrolet", "Camaro", 200);
        coche.mostrarDetalles();
        coche.acelerar(50);

        Coche cochePrueba = new Coche("mazda", "tres", -100);
        coche.mostrarDetalles();
        cochePrueba.acelerar(-50);
    }
}