
    package ActividadesRepasoTema1;

import java.util.Scanner;


    public class Ejercicio3 {
    
        public static void main(String[] args) {
            
            /*
            3. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
            los meses tienen 30 días
            */
         Scanner fecha = new Scanner(System.in);   
         
            System.out.println("Introduzca año");
            
            int año = fecha.nextInt();
            
            System.out.println("Introduzca mes");
            int mes = fecha.nextInt();
            
            System.out.println("Introduzca dia");
            int dia = fecha.nextInt();
            //dia++;
            System.out.println("El siguiente dia es el "+(dia+1)+"/"+mes+"/"+año);
        }
    }
