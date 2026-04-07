package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class AER161 {

    public static void main(String[] args) {
        
        final int MAX = 25_000;
        
        Scanner in = new Scanner(System.in);
        
        int numElementos;
        int[] v = new int[MAX];
        
        while ((numElementos = in.nextInt()) != 0) {
            
            for (int i = 0; i < numElementos; i++)
                v[i] = in.nextInt();
                
            Arrays.sort(v, 0, numElementos);
        }
    }
}