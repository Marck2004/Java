
package procedimientos_y_funciones;

public class Ejercicio4 {
    final double PI = 3.14;
    public double calculoAreaCilindro(double altura,double radio){
        
        double area = ((2*PI*radio)*(altura+radio));
        //System.out.println("El area del cilindro es de: "+area);
        return area;
    }
    public double calculoVolumenCilindro(double altura,double radio){
        
        double volumen = PI * Math.pow(radio, 2)*altura;
        
        //System.out.println("El volumen del cilindro es: "+volumen);
        return volumen;
    }
    public static void main(String[] args) {
        
        
        Ejercicio4 instancia = new Ejercicio4();

        double returnarea = instancia.calculoAreaCilindro(5.5, 3.5);
        double returnvolumen = instancia.calculoVolumenCilindro(3.9, 1.2);
        
        System.out.println("El area del cilindro es de: "+returnarea);
        System.out.println("El volumen del cilindro es de: "+returnvolumen);
    }
}
