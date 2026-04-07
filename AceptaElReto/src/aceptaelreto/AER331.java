package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class AER331 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numCorredores;
        int modificacion;
        String nombre;
        String[] salida;
        int[] posiciones;
        int posicionSalida;
        
        boolean esIncoherente;

        while ((numCorredores = in.nextByte()) != 0){
            
            // La posicion cero del vector se desprecia.
            salida = new String[27];
            Arrays.fill(salida, ""); // De no hacer este paso, todas las casillas están a null.
            posiciones = new int[27];
            
            esIncoherente = false;
                    
            for (byte posicion = 1; posicion <= numCorredores; posicion++) {
                modificacion = in.nextInt();
                nombre = in.nextLine();
                
                posicionSalida = posicion + modificacion;
                
                if (posicionSalida >= 1 && posicionSalida <= 26 &&
                    salida[posicionSalida].isEmpty()) {
                       
                    salida[posicionSalida] = nombre;
                    posiciones[posicionSalida] = posicionSalida;
                    
                } else {
                    for (int i = 0; i < numCorredores - posicion; i++) 
                        in.nextLine();
                    esIncoherente = true;
                    break;
                }
            }
            
            if (esIncoherente)
                System.out.println("IMPOSIBLE");
            else 
                for (int i = 1; i <= 26; i++) 
                    if (!salida[i].isEmpty())
                        System.out.println(posiciones[i] + salida[i]);
            
            System.out.println("-----");
        }
    }
}