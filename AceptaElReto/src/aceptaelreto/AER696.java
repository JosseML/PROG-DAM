package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class AER696 {

    public static void main(String[] args) {
        
        final int MAX = 500_000;

        Scanner in = new Scanner(System.in);

        int[] bares = new int[MAX];
        int n;
        int id;

        while ((in.hasNext())) {

            id = 0;

            while ((n = in.nextInt()) != 0)
                bares[id++] = n;
            
            Arrays.sort(bares, 0, id);
            
            for (int i = 1; i < id; i++)
                
                if (bares[i] != bares[i - 1] + 1) {
                    System.out.println(bares[i - 1] + 1);
                    break;
                }
        }
    }
}