package aceptaelreto;

import java.util.Scanner;

public class AER590 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numRaciones;
        int numUvas;
        int[] uvas;
        int suma;
        int min; // Número minimo de uvas encontradas que satisfacen los requisitos
        int inicio;
        
        while ((numRaciones = in.nextInt()) != 0) {
            numUvas = in.nextInt();
            
            uvas = new int[numRaciones];
            
            for (int i = 0; i < numRaciones; i++)
                uvas[i] = in.nextInt();
            
            suma = 0;
            inicio = 0; // Margen izquierdo de la ventana
            min = Integer.MAX_VALUE;
            
            for (int i = 0; i < numRaciones; i++) {
                suma += uvas[i];
                
                while (suma >= numUvas) {
                    min = Math.min(suma, min);
                    
                    suma -= uvas[inicio++];
                }
            }
            
            if (min == Integer.MAX_VALUE)
                
                System.out.println("IMPOSIBLE");
            else
                System.out.println(min);
        }
    }
}