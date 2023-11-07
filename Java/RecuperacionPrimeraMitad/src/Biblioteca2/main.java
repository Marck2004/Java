package Biblioteca2;

public class main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Marcos", 1);
        LibroDigital l1 = new LibroDigital("El libro de la selva", "Cervantes", 1990, true, 190.9);

        u1.prestarLibro(l1);
        
        u1.mostrarLibrosPrestados();
    }
}