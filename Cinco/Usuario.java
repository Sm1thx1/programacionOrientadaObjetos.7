package javaEjercicios.Cinco;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void prestarLibro(Libro libro) {
        try {
            libro.prestar();
            System.out.println("El usuario " + nombre + " ha prestado el libro: " + libro.getTitulo());
        } catch (LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void devolverLibro(Libro libro) {
        libro.devolver();
        System.out.println("El usuario " + nombre + " ha devuelto el libro: " + libro.getTitulo());
    }
}