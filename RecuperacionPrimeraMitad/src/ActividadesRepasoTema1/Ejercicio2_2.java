
package ActividadesRepasoTema1;


public class Ejercicio2_2 {
    
    public static void main(String[] args) {
        
        int x = 3;
        double y =5.0;
        
        double expresiondouble = ((200*y)+x);
        float expresionfloat = (float) ((200*y)+x);
        int expresionint = (int) ((200*y)+x);
        
        System.out.println("La expresion double es "+expresiondouble+"\n"
                + "La expresion float es "+expresionfloat+"\n"
                + "La expresion int es "+expresionint);
        
    }
}
