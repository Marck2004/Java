
package Ejercicios_clases.Recatangulo_Circulo_Cuadrado;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escriba el radio de circulo");
        double radiocirculo = teclado.nextDouble();
        
        System.out.println("Escriba el lado del cuadrado");
        double ladocuadrado = teclado.nextDouble();
        
        System.out.println("Escriba la altura del rectangulo");
        double alturarectangulo = teclado.nextDouble();
        System.out.println("Escriba la base del rectangulo");
        double baserectangulo = teclado.nextDouble();
        
        System.out.println("---------RECTANGULOS---------");
        Rectangulo r1 = new Rectangulo(5.0,6.1);
        r1.calcularAreaRectangulo();
        r1.calcularPerimetroRectangulo();
        r1.toString();
        Rectangulo r2 = new Rectangulo(alturarectangulo,baserectangulo);
        r2.calcularAreaRectangulo();
        r2.calcularPerimetroRectangulo();
        r2.toString();
        
        System.out.println("---------CIRCULOS---------");
        Circulo c1 = new Circulo(7.35);
        c1.calcularAreaCirculo();
        c1.calcularPerimetroCirculo();
        c1.toString();
        Circulo c2 = new Circulo(radiocirculo);
        c2.calcularAreaCirculo();
        c2.calcularPerimetroCirculo();
        c2.toString();
        
        System.out.println("---------CUADRADOS---------");
        Cuadrado cu1 = new Cuadrado(3.14);
        cu1.calcularAreaCuadrado();
        cu1.calcularPerimetroCuadrado();
        cu1.toString();
        Cuadrado cu2 = new Cuadrado(ladocuadrado);
        cu2.calcularAreaCuadrado();
        cu2.calcularPerimetroCuadrado();
        cu2.toString();
    }
}
