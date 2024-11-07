package javaEjercicios.Cinco;

public class MainBiblioteca {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad");
        Libro libro2 = new Libro("Don Quijote de la Mancha");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Ana");

        // Préstamo y devolución
        usuario1.prestarLibro(libro1);
        usuario2.prestarLibro(libro1);
        usuario1.devolverLibro(libro1);
        usuario2.prestarLibro(libro1);
        usuario1.prestarLibro(libro2);
        usuario1.devolverLibro(libro2);
    }
}
