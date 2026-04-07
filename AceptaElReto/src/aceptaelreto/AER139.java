package aceptaelreto;

import java.util.Scanner;
import java.util.HashSet;

public class AER139 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n;
        
        while ((n = in.nextInt()) != 0)
            resolverCaso(n);
    }

    static int siguiente(int n) {

        int suma = 0;
            
        if (n == 0) {
            return 0;
        }

        return (int)Math.pow(n % 10, 3) + siguiente(n / 10);
    }
    
    static void resolverCaso(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (true) {
            System.out.print(n);

            if (n == 1){
                System.out.println(" -> cubifinito.");
                return;
            }

            if (set.contains(n)) {
                System.out.println(" -> no cubifinito.");
                return;
            }
            
            System.out.print(" - ");
            set.add(n);
            n = siguiente(n);
        }
    }
}
