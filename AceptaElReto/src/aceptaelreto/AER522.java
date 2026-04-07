package aceptaelreto;

import java.util.Scanner;

public class AER522 {

    static double[] convertir(String palabra) {
        
        double[] v = new double[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) 
            
            if (palabra.charAt(i) == 'l' && i+1 < palabra.length() && palabra.charAt(i + 1) == 'l') {
                v[i] = 108.5;
                i++;
            }
            else if (palabra.charAt(i) == 'c' && i+1 < palabra.length() && palabra.charAt(i + 1) == 'h') {
                v[i] = 99.5;
                i++;
            } 
            else
                v[i] = palabra.charAt(i);
        
        return v;
    }
    
     static boolean esMenorOIgual(String palabra1, String palabra2) {
         
        double[] p1 = convertir(palabra1);
        double[] p2 = convertir(palabra2);
        
        for (int i = 0; i < Math.min(p1.length, p2.length); i++) {
            
            if (p1[i] < p2[i])
                return true;
            else if (p1[i] > p2[i])
                return false;
        }
        
        if (p1.length == p2.length)
            return true; // Las palabras son iguales
        
        else if (p1.length < p2.length)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String palabra1;
        String palabra2;
        
        while (in.hasNext()){
            palabra1 = in.next();
            palabra2 = in.next();
            
            if (esMenorOIgual(palabra1, palabra2))
                
                System.out.println(palabra1);
            else
                System.out.println(palabra2);
        }
    }
}