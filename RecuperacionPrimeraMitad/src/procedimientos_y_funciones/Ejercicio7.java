
package procedimientos_y_funciones;

public class Ejercicio7 {
    
    
    public double CalcularIMC(double peso, double altura){
        
        double IMC = peso * Math.pow(altura,2);
                return IMC;
    }
    
    public static void main(String[] args) {
        
        
        Ejercicio7 instancia = new Ejercicio7();
        
        double IMC = instancia.CalcularIMC(91.6, 2.10);
        System.out.println("El indice de masa corporal es de: "+IMC);
    }
}
