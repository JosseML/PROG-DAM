package aceptaelreto;

import java.util.Scanner;

public class AER176 {
    
    static boolean tieneMinas(char[][] minas, int f, int c) {
        
        final int[] DF = {-1, -1, -1, 0, 0, 1, 1, 1};
        final int[] DC = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        int contador = 0;
        
        for (int i = 0; i < DF.length; i++)
            if(minas[f + DF[i]] [c + DC[i]] == '*')
                contador++;
        
        return contador >= 6;
    }
    
    static int getNumeroCasillas(char[][] minas) {
        
        int filas = minas.length;
        int cols = minas[0].length;
        int contador = 0;
        
        for (int f = 1; f < filas - 1 ; f++)
            for (int c = 1; c < cols - 1; c++)
                if(minas[f][c] == '-' && tieneMinas(minas, f, c))
                    contador++;
        
        return contador;
    } 
            
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int filas, cols;
        char[][] minas;
        String linea;

        while ((cols = in.nextInt()) != 0) {
            
            filas = in.nextInt();
            in.nextLine();
            
            minas = new char[filas][cols];

            for (int f = 0; f < filas; f++) {
                linea = in.nextLine();
                for (int c = 0; c < linea.length(); c++) 
                    minas[f][c] = linea.charAt(c);
            }

            System.out.println(getNumeroCasillas(minas));
        }
    }
}
