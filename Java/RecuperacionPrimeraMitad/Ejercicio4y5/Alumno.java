
package Ejercicio4y5;

import java.util.Scanner;

public class Alumno {
    
    private String Nombre;
    private double primerTrim,segundoTrim,tercerTrim;
    private int [] notasEj = new int[10];

    public Alumno() {
    }

    
    public Alumno(String Nombre, double primerTrim, double segundoTrim, double tercerTrim) {
        this.Nombre = Nombre;
        this.primerTrim = primerTrim;
        this.segundoTrim = segundoTrim;
        this.tercerTrim = tercerTrim;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPrimerTrim(double primerTrim) {
        this.primerTrim = primerTrim;
    }

    public void setSegundoTrim(double segundoTrim) {
        this.segundoTrim = segundoTrim;
    }

    public void setTercerTrim(double tercerTrim) {
        this.tercerTrim = tercerTrim;
    }

    public void setNotasEj(int[] notasEj) {
        this.notasEj = notasEj;
    }

    public double notatrim(double nota1){
        return nota1;
    }

    
    public double notasEjtrabajo(){
        
        Scanner teclado = new Scanner(System.in);
        int numeros = 0;
            String salir = "";
            int contador = 0;
            
              do{  
            
        for (int i = 0; i < notasEj.length; i++) {
            notasEj[i] = 0;
                
        }
            System.out.println("Introduzca numeros");

            numeros = teclado.nextInt();
            
            notasEj[contador] = numeros;
            
            
        contador++;
        System.out.println("Desea seguir metiendo numeros?");
            salir = teclado.nextLine();
        teclado.nextLine();
            
              }while(!salir.equalsIgnoreCase("no"));
              
            double notamediaejercicios = numeros / 10;
            
            return notamediaejercicios;
    }

    public double notaFinal(){
        double notaMedia =((((notatrim(primerTrim)+notatrim(segundoTrim)+notatrim(tercerTrim))/3)*0.6) + (notasEjtrabajo() * 0.4));
        return notaMedia;
    }
    
    @Override
    public String toString() {
        System.out.println("Alumno: " + "Nombre= " + Nombre + ", primerTrim= " + notatrim(primerTrim) + ", segundoTrim= " + notatrim(segundoTrim) + ", tercerTrim= " + notatrim(tercerTrim) + " notaFinal "+notaFinal());
        return "Alumno: " + "Nombre= " + Nombre + ", primerTrim= " + primerTrim + ", segundoTrim= " + segundoTrim + ", tercerTrim= " + tercerTrim + ", notasEj= " + notasEj + " notaFinal "+notaFinal();
    }
   
    
}
