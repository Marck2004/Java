package Biblioteca2;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;

    public Libro(String titulo, String autor, int anio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = 0;
        this.disponible = true;
    }

    public boolean prestar() {
        return disponible = false;
    }

    public boolean devolver() {
        return disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    @Override
    public String toString() {
        return "Libro \ntitulo=" + titulo + ", \nautor=" + autor + ", \nanio=" + anio + ", \ndisponible=" + disponible;
    }

}