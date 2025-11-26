package aceptaelreto;

import java.util.Scanner;

public class AER121 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int necesito;   // Nº de envoltorios necesarios para obtener un regalo.
        int regalo;     // Nº de chicles de regalo.
        int numChicles; // Nº de chicles que se compran al inicio.
        int contador;   // Contador de chicles que como.
        int envoltorioRestantes; // Nº de envoltorios que no puedo intercambiar.
        
        while ((necesito = in.nextInt()) != 0) {
            regalo = in.nextInt();
            numChicles = in.nextInt();
            
            
            if (necesito == 0 && regalo == 0 && numChicles == 0)
                break;
            
        }
    }
}