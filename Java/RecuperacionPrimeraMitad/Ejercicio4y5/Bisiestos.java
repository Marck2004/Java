
package Ejercicio4y5;

import java.util.Scanner;


public class Bisiestos {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce primera fecha");
        int primeraFecha = teclado.nextInt();
        
        System.out.println("Introduce segunda fecha");
        int segundaFecha = teclado.nextInt();
        
            while(primeraFecha < segundaFecha){

                if(primeraFecha % 4 == 0){

                    if(primeraFecha % 100 == 0 && primeraFecha % 400 != 0 ){
                        System.out.println("El año "+primeraFecha+" no es multiplo de 400");
                    }else{
                        System.out.println("El año "+primeraFecha+" es un año bisiesto");
                    }
                }
                primeraFecha++;
            }   
        
    }
}
