package aceptaelreto;

import java.util.Scanner;
import java.util.HashSet;

public class AER416 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numPersonas;
        String cumple;
        HashSet<String> set = new HashSet<>();
        
        while ((numPersonas = in.nextInt()) != 0) {
            set.clear(); 
            
            for (int i = 0; i < numPersonas; i++) {
                cumple = in.next();
                set.add(cumple.substring(0, cumple.length() - 5));
            }
            
            System.out.println(numPersonas == set.size()? "NO" : "SI");
        }
    }
}