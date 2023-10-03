
package ActividadesRepasoTema1;

import java.util.Scanner;

public class Ejercicio6_2 {
    public static void main(String[] args) {
        
       Scanner geometria = new Scanner(System.in);
        System.out.println("Introduzca el ancho del rectangulo");
       double anchorectangulo = geometria.nextDouble();
        System.out.println("Introduzca el alto del rectangulo");
       double altorectangulo = geometria.nextDouble();
       
       double perimetrorectangulo = ((altorectangulo*2)+(anchorectangulo*2));
       double arearectangulo = (altorectangulo*anchorectangulo);
       
        System.out.println("Introduzca radio del circulo");
       double radiocirculo = geometria.nextDouble();
       final double PI = 3.14;
       
       double circulo = (PI * Math.pow(radiocirculo, 2));
       
        System.out.println("Ingrese el lado del cuadrado");
        
        double ladocuadrado = geometria.nextDouble();
        
        double perimetrocuadrado = ladocuadrado*4;
        double areacuadrado = Math.pow(ladocuadrado, 2);
        
        System.out.println("++++++++RECTANGULO+++++++++\n");
        
        System.out.println("El perimetro del rectangulo es de: "+perimetrorectangulo+"\n"
                + "El area del rectangulo es de: "+arearectangulo+"\n");
        
        System.out.println("++++++++CIRCULO+++++++++\n");
        System.out.println("El perimetro y area del circulo es de: "+circulo+"\n");
        
        System.out.println("++++++++CUADRADO+++++++++\n");
        System.out.println("El perimetro del cuadrado es de: "+perimetrocuadrado+"\n"
                + "El area del cuadrado es de: "+areacuadrado+"\n");
    }
}
