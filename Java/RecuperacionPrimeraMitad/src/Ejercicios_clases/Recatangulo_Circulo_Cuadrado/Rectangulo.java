
package Ejercicios_clases.Recatangulo_Circulo_Cuadrado;

public class Rectangulo {

    private double altura,base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public void calcularAreaRectangulo(){
        System.out.println("El area del rectangulo es de: "+altura*base);
    }
    public void calcularPerimetroRectangulo(){
        System.out.println("El perimetro del rectangulo es de: "+2*altura + 2*base);
    }

    
    
    
}
