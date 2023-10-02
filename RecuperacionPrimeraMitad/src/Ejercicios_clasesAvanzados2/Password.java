
package Ejercicios_clasesAvanzados2;

public class Password {
    
    private int longuitud;
    private String contraseña;

    public Password() {
    }

    public Password(int longuitud) {
        this.longuitud = 8;
    }
    
        public boolean esFuerte(){
            
            boolean contraseñaFuerte = true;
            
            int mayusculas = 0;
            
                for (int i = 0; i < longuitud; i++) {
                char caracteres = contraseña.charAt(i);
                if(Character.isUpperCase(caracteres)){
                mayusculas++;
                if(mayusculas > 2){
                    break;
                }
            }
        }
                int minusculas = 1;
                for (int i = 0; i < contraseña.length(); i++) {
                    char caracteres = contraseña.charAt(i);
                if(Character.isLowerCase(caracteres)){
                    minusculas++;
                }
                if(minusculas>1){
                    break;
                }
            }
            
            if(contraseña.length() > 5 && mayusculas > 2 && minusculas > 1){
                System.out.println("La contraseña es fuerte");
            return contraseñaFuerte;
        }else{
            System.out.println("La contraseña es debil");
            return contraseñaFuerte=false;
}
        
    
}
        public String[] generarPassword(){
            
            String [] PasswordArray = new String[longuitud];
            
                String caracteres = "DSADASMCPAMknfvdncnoasndpasnriwms@";
                String []arrayCaracteres = caracteres.split("");
            for (int i = 0; i < PasswordArray.length; i++) {
                int valoresCaracteres = (int) (1+Math.random()*caracteres.length());
                    String letra = arrayCaracteres[valoresCaracteres];
                    
                    PasswordArray[i]=letra;
            }
            System.out.println("La contraseña es "+PasswordArray);
            return PasswordArray;
        }

    public int getLonguitud() {
        return longuitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLonguitud(int longuitud) {
        this.longuitud = longuitud;
    }
        
}
