
package procedimientos_y_funciones;

import java.util.Scanner;


public class Ejercicio2 {
    
    public double multiplicacion(int numero){
        
        numero = numero * 2;
        
        System.out.println("El resultado es: "+numero);
        
        return numero;
    }
    public static void main(String[] args) {
        
        System.out.println("Introduzca numero");
        
        Scanner teclado = new Scanner(System.in);
        
        int n = teclado.nextInt();
        
        Ejercicio2 instancia = new Ejercicio2();
        
        instancia.multiplicacion(n);
        
    }
}
