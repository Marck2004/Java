package Tablero;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class tablero {

    private char[][] tablero;
    private int filas = 3;
    private int columnas = 3;

    public tablero() {
        this.tablero = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = '*';
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean realizarMovimiento(int fila, int columna, char simbolo) {

        if (simbolo == 'X' || simbolo == 'O') {
            tablero[fila][columna] = simbolo;
            mostrarTablero();
            System.out.println("\n");
            return true;
        } else {
            System.out.println("No se puede realizar el movimiento");
            return false;
        }
    }

    public char verificarGanador() {
        char caracter = 'E';
        int negtivoI = 2;
        int negtivoJ = 2;
        int i = 0;
        int j = 0;

        if ((tablero[negtivoI][j] == 'X' && tablero[negtivoI][j + 1] == 'X' && tablero[negtivoI][j + 2] == 'X')
                || (tablero[i][j] == 'X' && tablero[i][j + 1] == 'X' && tablero[i][j + 2] == 'X')
                || (tablero[i][j] == 'X' && tablero[i++][j + 1] == 'X' && tablero[i + 2][j + 2] == 'X')) {
            caracter = 'X';

        } else if ((tablero[i][j] == 'X' && tablero[i + 1][j] == 'X' && tablero[i + 2][j] == 'X')) {
            caracter = 'X';

        } else if ((tablero[i][j] == 'X' && tablero[i + 1][j + 1] == 'X' && tablero[i + 2][j + 2] == 'X')
                || (tablero[i][negtivoJ] == 'X' && tablero[i + 1][negtivoJ - 1] == 'X'
                        && tablero[i + 2][negtivoJ - 2] == 'X')
                || (tablero[negtivoI][j] == 'X' && tablero[negtivoI - 1][j + 1] == 'X'
                        && tablero[negtivoI - 2][j + 2] == 'X')
                || (tablero[negtivoI][negtivoJ] == 'X' && tablero[negtivoI - 1][negtivoJ - 1] == 'X'
                        && tablero[negtivoI - 2][negtivoJ - 2] == 'X')) {
            caracter = 'X';

        } else if ((tablero[i][j] == 'O' && tablero[i][j + 1] == 'O' && tablero[i][j + 2] == 'O')) {
            caracter = 'O';

        } else if ((tablero[i][j] == 'O' && tablero[i + 1][j] == 'O' && tablero[i + 2][j] == 'O')) {
            caracter = 'O';
        } else if ((tablero[i][j] == 'O' && tablero[i + 1][j + 1] == 'O' && tablero[i + 2][j + 2] == 'O')
                || (tablero[i][negtivoJ] == 'O' && tablero[i + 1][negtivoJ - 1] == 'O'
                        && tablero[i + 2][negtivoJ - 2] == 'O')
                || (tablero[negtivoI][j] == 'O' && tablero[negtivoI - 1][j + 1] == 'O'
                        && tablero[negtivoI - 2][j + 2] == 'O')
                || (tablero[negtivoI][negtivoJ] == 'O' && tablero[negtivoI - 1][negtivoJ - 1] == 'O'
                        && tablero[negtivoI - 2][negtivoJ - 2] == 'O')) {
            caracter = 'O';
        }
        for (int filaI = 0; filaI < filas; filaI++) {
            for (int columnaJ = 0; columnaJ < columnas; columnaJ++) {
                if (tablero[filaI][columnaJ] == '*') {
                    System.out.println("La partida no ha acabado ");
                    caracter = 'N';
                }
            }
        }
        return caracter;
    }

    public boolean estaLleno() {
        boolean lleno = true;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j] == '*') {
                    lleno = false;
                }
            }

        }
        if (lleno == false) {
            System.out.println("Aun queda partida");
        } else {
            System.out.println("La partida ha acabado");
        }
        return lleno;
    }
}
