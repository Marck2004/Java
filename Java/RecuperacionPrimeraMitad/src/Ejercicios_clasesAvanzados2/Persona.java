
package Ejercicios_clasesAvanzados2;

public class Persona {
    
     private String nombre;
    private int edad;
    private static String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
        private final static String def_nombre = " ";
        private final static int def_edad = 0;
        private final static char def_sexo = 'H';
        private final static double def_peso = 0;
        private final static double def_altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
        
        public int calcularIMC(){
            
            double IMC = (peso/(Math.pow(altura, 2)));
       final int devolverIMC;    
        
            if(IMC < 20){
                System.out.println("Esta perfecto");
                devolverIMC =1;
            }else if(IMC >= 20 && IMC <= 25){
                System.out.println("Por debajo de su peso ideal");
                devolverIMC = 0;
            }else{
                System.out.println("Tiene sobrepeso");
                devolverIMC = -1;
            }
            return devolverIMC;
        }
        public boolean esMayorDeEdad(){
            final boolean mayorDeEdad = true;
            if(edad >= 18){
                System.out.println("Es mayor de edad");
                return mayorDeEdad;
            }else{
                System.out.println("No es mayor de edad");
                return !mayorDeEdad;
            }
        }
        public static char comprobarSexo(char sexo){

            if(sexo == 'H'){
                System.out.println("Es un hombre");
                return def_sexo;
            }else if(sexo== 'M'){
                System.out.println("Es una mujer");
                return 'M';
            }else{
                System.out.println("Es un hombre");
                return def_sexo;
            }
        }

    @Override
    public String toString() {
        System.out.println("Informacion de la persona:\n"
                +"Nombre: " + nombre + "\n" + "edad: " + edad + " Años\n" + "DNI: " + DNI + "\n" + "Sexo: " + sexo + "\n" + "Peso: " + peso + " Kg\n" + "Altura: " + altura + " metros\n");
        return "Persona " + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura;
    }
        public static String generaDNI(){
            final int divisor = 23;
            
            int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
 
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
 
        //Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
        return DNI;
    }
 
    public static char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
        
        
}
