package Biblioteca2;

public class LibroDigital extends Libro {

    private double tamanioArchivo;

    public LibroDigital(String titulo, String autor, int anio, boolean disponible, double tamanioArchivo) {
        super(titulo, autor, anio, disponible);
        this.tamanioArchivo = tamanioArchivo;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntamanioArchivo=" + tamanioArchivo;
    }

}