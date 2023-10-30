package Tablero;

import java.util.Scanner;

public class juego {

    private tablero tablero;
    private char simboloP1;
    private char simboloP2;

    public juego() {
        this.tablero = new tablero();
        this.simboloP1 = 'X';
        this.simboloP2 = 'O';
    }

    public void jugar() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce fila para poner la ficha");
        int fila = teclado.nextInt();
        System.out.println("Introduce columna para poner la ficha");
        int columna = teclado.nextInt();
        System.out.println("Introduce simbolo para poner la ficha");
        char simbolo = teclado.next().charAt(0);
        if (fila > 3 || fila < 0 || columna > 3 || columna < 0) {
            System.out.println("Movimiento invalido te has salido del tablero");
        }

        tablero.realizarMovimiento(fila, columna, simbolo);

        /*
         * if (tablero.verificarGanador() == 'E') {
         * System.out.println("Han empatado");
         * } else if (tablero.verificarGanador() == 'X') {
         * System.out.println("Ha ganado la ficha X");
         * } else if (tablero.verificarGanador() == 'O') {
         * System.out.println("Ha ganado la ficha O");
         * }
         * if (tablero.estaLleno() == true) {
         * System.out.println("El tablero esta lleno");
         * }
         * }
         */
    }

    public void solicitarMovimiento(char simbolo) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce fila para poner la ficha");
        int fila = teclado.nextInt();
        System.out.println("Introduce columna para poner la ficha");
        int columna = teclado.nextInt();

        if (simbolo != 'X' || simbolo != 'O') {
            System.out.println("No ha elegido las fichas existentes");
        } else {
            tablero.realizarMovimiento(fila, columna, simbolo);
        }
    }
}