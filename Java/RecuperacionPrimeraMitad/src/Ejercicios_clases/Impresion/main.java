package Ejercicios_clases.Impresion;

import java.util.Scanner;

public class main {

    public static class Impresion {

        public static void Decimal_2(double numero) {
            
            double roundOff = Math.round(numero * 100.0) / 100.0;
            System.out.println(roundOff);
            //return roundOff;
        }

        public static void Decimales_4(double numero) {

            double roundOff = Math.round(numero * 100.0)/10000.0;
            System.out.println(roundOff);
        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce radio");
        double numero = teclado.nextDouble();

        Circulo c1 = new Circulo(numero);
        c1.calcularAreaCirculo();
        c1.calcularPerimetroCirculo();

        System.out.println("-------Redondeo a dos decimales-------");
        Impresion.Decimal_2(c1.calcularAreaCirculo());
        Impresion.Decimal_2(c1.calcularPerimetroCirculo());
        
        System.out.println("-------Redondeo a cuatro decimales---------");
        Impresion.Decimales_4(c1.calcularAreaCirculo());
        Impresion.Decimales_4(c1.calcularPerimetroCirculo());
        
    }
}
