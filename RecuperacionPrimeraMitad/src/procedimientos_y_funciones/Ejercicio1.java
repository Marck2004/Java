package procedimientos_y_funciones;

import java.util.Scanner;

public class Ejercicio1 {
    
    public void multiplicacion(int introducido) {

        introducido = introducido * 2;
        
        System.out.println("El valor es: " + introducido);
    }

    public static void main(String[] args) {
        
        Scanner numero = new Scanner(System.in);
        
        System.out.println("Introduzca numero");
        int n = numero.nextInt();
        
        Ejercicio1 instancia = new Ejercicio1();

        instancia.multiplicacion(n);

    }

}
