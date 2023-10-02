
package ActividadesRepasoTema1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {

        //1. Escribir un programa en java que pida un número de horas y calcule cuantos días y  horas hay en ellas
        System.out.println("Introduzca numero de horas");
        Scanner teclado = new Scanner(System.in);
        
        int PedirHoras = teclado.nextInt();
        
        int dias = PedirHoras / 24;
        int HorasRestantes = PedirHoras%24;
        System.out.println("Hay "+dias+" dias y "+HorasRestantes+" horas");
        
    }
    
}
