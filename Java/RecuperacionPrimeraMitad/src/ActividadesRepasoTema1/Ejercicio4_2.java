
package ActividadesRepasoTema1;

import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        
        Scanner usuario = new Scanner(System.in);
        
        System.out.println("Introduzca valor para la 'x' ");
        int x = usuario.nextInt();

        System.out.println("Introduzca valor para la 'y' ");
        double y = usuario.nextDouble();

        
        System.out.println("Como double "+(double)((200*y) + x)+"\n"
                + "Como int "+(int)((200 * y)+ x)+"\n"
                + "Como byte "+(byte)((200*y)+ x));
        
        
    }
}
