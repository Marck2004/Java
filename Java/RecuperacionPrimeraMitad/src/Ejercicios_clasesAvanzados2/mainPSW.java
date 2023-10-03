
package Ejercicios_clasesAvanzados2;

import java.util.Scanner;

public class mainPSW {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Introduce la longitud que desees");
        int longuitud = teclado.nextInt();
            String []Passwords = new String[longuitud];
            //boolean [] Resistente = new boolean[longuitud];
        
        for (int i = 0; i < longuitud; i++) {
            Password p = new Password((int) Math.random()*i+1);
            Passwords[i] = p.generarPassword();
            //Resistente[i] =p.esFuerte();
            
            System.out.println(Passwords[i]);//+" - "+Resistente[i]);
        }
        
        
    }
    
}
