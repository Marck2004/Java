
package Ejercicios_clases;

public class Circulo {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   public double calcularArea(){
       return Math.PI * Math.pow(radio, 2);
   }
   public double calcularPerimetro(){
       return 2*Math.PI*radio;
   }
    public static void main(String[] args) {
        
        Circulo Circulo = new Circulo(5.0);
        
        double area = Circulo.calcularArea();
        double perimetro = Circulo.calcularPerimetro();
        
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
        
    }
}
