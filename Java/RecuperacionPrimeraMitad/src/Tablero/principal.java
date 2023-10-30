package Tablero;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        tablero t1 = new tablero();

        t1.realizarMovimiento(0, 0, 'O');
        t1.realizarMovimiento(1, 1, 'O');
        t1.realizarMovimiento(2, 2, 'O');

        t1.realizarMovimiento(0, 1, 'X');
        t1.realizarMovimiento(0, 2, 'O');
        t1.realizarMovimiento(1, 1, 'O');

        t1.realizarMovimiento(2, 0, 'X');
        t1.realizarMovimiento(2, 1, 'X');
        t1.realizarMovimiento(2, 2, 'X');
        t1.realizarMovimiento(1, 0, 'O');

        System.out.println(t1.verificarGanador());
        t1.estaLleno();

    }
}