package aceptaelreto;

import java.util.Scanner;

public class AER237 {

    static int getNumeroDigitos(long n) {
        
        int ret = 0;
        
        do {
            ret++;
            n /= 10;
        } while (n != 0);
        
        return ret;
    }
    
    static boolean esPolidivisible(long n, int numDigitos) {
        
        if (numDigitos == 1)
            return true;
        
        if (n % numDigitos == 0)
            return esPolidivisible(n / 10, numDigitos - 1);
        else
            return false;
    }
    
    static boolean esPolidivisible(long n){
        
        return esPolidivisible(n, getNumeroDigitos(n));
    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            
            long n = in.nextLong();
        
            if (esPolidivisible(n))
                
                System.out.println("POLIDIVISIBLE");
            else
                System.out.println("NO POLIDIVISIBLE");
        }
    }
}
