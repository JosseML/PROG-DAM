package aceptaelreto;

import java.util.Scanner;

public class AER160 {
    
    static boolean esTriangular(int[][] m) {
        
        boolean superior = true;
        boolean inferior = true;
        
        for (int fila = 0; fila < m.length; fila++) 
            for (int col = 0; col < m[fila].length; col++) 
                if (fila != col){
                    if (col > fila)
                        superior = superior && m[fila][col] == 0;
                    else
                        inferior = inferior && m[fila][col] == 0;
                }
        
        return superior || inferior;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        byte lado;
        int[][] m;
        
        while ((lado = in.nextByte()) != 0) {
            m = new int[lado][lado];
            
            for (int fila = 0; fila < lado; fila++) 
                for (int col = 0; col < lado; col++)
                    m[fila][col] = in.nextInt();

            System.out.println(esTriangular(m)? "SI": "NO");
        }
    }
}