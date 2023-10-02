
package Ejercicios_clases.Impresion;


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
    
        public double calcularAreaCirculo() {
            //System.out.println("El area del circulo es: "+Math.PI * Math.pow(radio, 2));
            return Math.PI * Math.pow(radio, 2);
        }

        public double calcularPerimetroCirculo() {
            //System.out.println("El perimetro del circulo es: "+2 * Math.PI * radio);
            return 2 * Math.PI * radio;
        }
    
}
