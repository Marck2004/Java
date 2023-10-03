
package Ejercicios_clasesAvanzados2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Introduzca su nombre");
            String nombre = teclado.nextLine();
            
        System.out.println("Introduzca su edad");
            int edad = teclado.nextInt();
           
        System.out.println("Introduzca su sexo 'H' o 'M'");
            char sexo = teclado.next().charAt(0);
            
        System.out.println("Introduzca su peso");
            double peso = teclado.nextDouble();
        
        System.out.println("Introduzca su altura");
            double altura = teclado.nextDouble();
            
        System.out.println("--------PERSONA1---------");
            Persona p1 = new Persona(nombre,edad,Persona.generaDNI(),Persona.comprobarSexo(sexo),peso,altura);
            p1.calcularIMC();
            p1.esMayorDeEdad();
            p1.toString();
            
        System.out.println("--------PERSONA2---------");
            Persona p2 = new Persona(nombre,edad,Persona.comprobarSexo(sexo));
            Persona.generaDNI();
            p2.calcularIMC();
            p2.esMayorDeEdad();
            p2.toString();
            
        System.out.println("--------PERSONA3---------");
            Persona p3 = new Persona();
            p3.setNombre("Marcos");
            p3.setEdad(23);
            p3.setSexo('H');
            Persona.comprobarSexo(sexo);
            p3.setPeso(86.4);
            p3.setAltura(97.8);
            Persona.generaDNI();
            
            p3.calcularIMC();
           p3.esMayorDeEdad();
           p3.toString();
            
                    
    }
}
