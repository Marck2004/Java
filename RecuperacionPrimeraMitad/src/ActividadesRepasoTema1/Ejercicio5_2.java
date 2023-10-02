
package ActividadesRepasoTema1;

import java.util.Scanner;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        
        Scanner usuario = new Scanner(System.in);
        
        System.out.println("Introduzca su peso");
        double peso = usuario.nextDouble();
        
        System.out.println("Introduzca su altura");
        double altura = usuario.nextDouble();
        
        double IMC = (peso / Math.pow(altura, 2));
        
        System.out.println("El indice de masa corporal es de "+IMC);
    }
}
