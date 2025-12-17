package aceptaelreto;

import java.util.Scanner;

public class AER611 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int añoSir;
        int numObras;
        int añoObra;
        String titulo;
        int minAño;
        String minObra = "";
        int contador;
        
        while (in.hasNext()){
            
            añoSir = in.nextInt();
            in.nextLine();
            
            numObras = in.nextInt();
            minAño = Integer.MAX_VALUE;
            contador = 0;

            for (int i = 0; i < numObras; i++) {
                
                añoObra = in.nextInt();
                titulo = in.nextLine();
                
                if (añoSir <= añoObra) {
                    contador++;
                }
                
                if (añoObra < minAño) {
                    minAño = añoObra;
                    minObra = titulo;
                }
            }
            
            if(contador == numObras)
                System.out.println("TODAS");
            else if (contador == 0)
                    System.out.println("NINGUNA");
            else
                System.out.println(minObra.trim());
        }
    }
}