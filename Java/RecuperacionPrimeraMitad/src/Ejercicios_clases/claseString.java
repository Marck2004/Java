
package Ejercicios_clases;

import java.util.Scanner;

public class claseString {
     
    public void cadenas(){
    Scanner teclado = new Scanner(System.in);
    
        System.out.println("Introduce la primera cadena");
        String cadena = teclado.nextLine();
        System.out.println("Introduce la segunda cadena");
        String cadena2 = teclado.nextLine();
        
        String concatenar = cadena+cadena2;
            System.out.println("El resultado concatenado es "+concatenar + " su longitud es de "+concatenar.trim().length());
            
        System.out.println("El tercer caracter de la primera es "+cadena.substring(2, 3)+" y de la segunda "+cadena2.substring(2,3));
        
        System.out.println("En minusculas es: "+concatenar.toLowerCase()+ " y en mayusculas es: "+concatenar.toUpperCase());
    }
    
    
    public static void main(String[] args) {
        
        claseString ClaseString = new claseString();
            
            ClaseString.cadenas();
        
        
    }
}
