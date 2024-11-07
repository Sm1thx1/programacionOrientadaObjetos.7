package javaEjercicios.dos;

public class MainVehiculo {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 5);
        Motocicleta motocicleta = new Motocicleta("Yamaha", "YZF-R3", true);
        Bicicleta bicicleta = new Bicicleta("Giant", "Escape 3", 21);

        auto.reservar();
        auto.devolver();

        motocicleta.reservar();
        motocicleta.devolver();

        bicicleta.reservar();
        bicicleta.devolver();
    }
}