
package procedimientos_y_funciones;

import java.util.Scanner;

public class Ejercicio3 {
    
    public void media(int numero1,int numero2, int numero3){
        
        
        int media = (numero1 + numero2 + numero3)/3;
        
        System.out.println("La media es de: "+media);
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca tres numeros para hacer media");
        
        int numero1 = teclado.nextInt();
        
        int numero2 = teclado.nextInt();
        
        int numero3 = teclado.nextInt();
        
        Ejercicio3 instancia = new Ejercicio3();
        
        instancia.media(numero1, numero2, numero3);
        
    }
    
}
