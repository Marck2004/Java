
package Ejercicio4y5;

import java.util.Scanner;

public class principal {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    Alumno Alumno = new Alumno();
    
    
        System.out.println("Introduce nota primer trimestre");
            double nota1 = teclado.nextDouble();
        System.out.println("Introduce nota segundo trimestre");
            double nota2 = teclado.nextDouble();
        System.out.println("Introduce nota tercer trimestre");
            double nota3 = teclado.nextDouble();
    
            double nota3metodo = Alumno.notatrim(nota3);
Alumno.setNombre("Marcos");
Alumno.setPrimerTrim(Alumno.notatrim(nota1));
Alumno.setSegundoTrim(Alumno.notatrim(nota2));
Alumno.setTercerTrim(Alumno.notatrim(nota3));

Alumno.notasEjtrabajo();
        Alumno.notaFinal();
        
            Alumno a1 = new Alumno("Marcos",Alumno.notatrim(nota1),Alumno.notatrim(nota2),Alumno.notatrim(nota3));
            
            
       // Alumno.notasEjtrabajo();
        Alumno.toString();
    }
}
