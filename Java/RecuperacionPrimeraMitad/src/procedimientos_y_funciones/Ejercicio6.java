
package procedimientos_y_funciones;

public class Ejercicio6 {
    
    public void CalcularIMC(double peso,double altura){
        
        double IMC = peso * Math.pow(altura, 2);
        
        System.out.println("El indice de masa corporal es de: "+IMC);
        
    }
    
    public static void main(String[] args) {
        
        Ejercicio6 instancia = new Ejercicio6();
            
            instancia.CalcularIMC(85.4, 1.47);
        
        
    }
    
}
