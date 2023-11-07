package Biblioteca2;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int id;
    ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        librosPrestados = new ArrayList<Libro>();
    }

    public void prestarLibro(Libro libro) {
        if (libro.estaDisponible() == true) {
            librosPrestados.add(libro);
            libro.prestar();
            System.out.println("El libro se presto con exito");
        } else {
            System.out.println("El libro no esta disponible");
        }
    }

    public void devolverLibro(Libro libro) {
        if (libro.estaDisponible() == true) {
            librosPrestados.remove(libro);
            libro.prestar();
            System.out.println("Libro devuelto con exito");
        } else {
            System.out.println("El libro no se ha podido devolver");
        }
    }

    public void mostrarLibrosPrestados() {
        for (int i = 0; i < librosPrestados.size(); i++) {
            System.out.print(librosPrestados.get(i).toString());
        }
    }
}