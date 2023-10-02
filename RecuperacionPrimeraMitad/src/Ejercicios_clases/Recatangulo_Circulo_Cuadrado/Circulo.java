package Ejercicios_clases.Recatangulo_Circulo_Cuadrado;

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

    public void calcularAreaCirculo() {
        System.out.println("El area del circulo es: "+Math.PI * Math.pow(radio, 2));
    }

    public void calcularPerimetroCirculo() {
        System.out.println("El perimetro del circulo es: "+2 * Math.PI * radio);
    }

    
    
        
 }
