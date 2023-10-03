
package ActividadesRepasoTema1;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        //4. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
        
        Scanner nota = new Scanner(System.in);
        
        System.out.println("Introduce nota entre 0 y 10");
        int n = nota.nextInt();
        
        while(n<10){
            n++;
            System.out.println("La nota es: "+n);
        }
    }
}
