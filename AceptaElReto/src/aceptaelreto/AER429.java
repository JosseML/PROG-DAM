package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class AER429 {
            
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numHangares;
        int numNaves;
        int nave;
        int[] hangares;
        boolean sePuedenAparcar;
        
        while ((numHangares = in.nextInt()) != 0) {
            
            hangares = new int[numHangares];
            
            for (int i = 0; i < numHangares; i++) {
                hangares[i] = in.nextInt();
            }
            
            numNaves = in.nextInt();
            
            sePuedenAparcar = true;
            
            while (numNaves-- > 0){
                
                Arrays.sort(hangares);
                
                nave = in.nextInt();
                
                if (nave > hangares[hangares.length - 1]){
                    sePuedenAparcar = false;
                    in.nextLine();
                    break;
                } else
                    hangares[hangares.length - 1] -= nave;
            }
            
            System.out.println(sePuedenAparcar? "SI" : "NO");
        }
    }
}
