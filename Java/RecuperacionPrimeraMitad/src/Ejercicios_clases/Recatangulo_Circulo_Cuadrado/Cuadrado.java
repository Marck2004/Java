
package Ejercicios_clases.Recatangulo_Circulo_Cuadrado;

public class Cuadrado {
    
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
        public void calcularAreaCuadrado(){
            System.out.println("El area del cuadrado es de: "+Math.pow(lado, 2));
        }
        public void calcularPerimetroCuadrado(){
            System.out.println("El perimetro del cuadrado es de: "+lado*4);
        }

    
    
        
}
