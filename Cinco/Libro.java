package javaEjercicios.Cinco;

public class Libro {
    private String titulo;
    private boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public void prestar() throws LibroNoDisponibleException {
        if (!disponible) {
            throw new LibroNoDisponibleException("El libro '" + titulo + "' no está disponible.");
        }
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getTitulo() {
        return titulo;
    }
}