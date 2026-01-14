package aceptaelreto;

import java.util.Scanner;

public class AER593 {

    static int getNumeroAnalisis(String muestras) {
        
        if (muestras.length() == 1)
            
            return 1;
        
        if (muestras.contains("1")) {
            
            int index;
            
            index = (muestras.length() % 2 == 0) ? muestras.length() / 2 : muestras.length() / 2 + 1;
            
            return 1 + getNumeroAnalisis(muestras.substring(0, index)) + getNumeroAnalisis(muestras.substring(index));
        
        } else
            return 1;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        while (in.nextInt() != 0)
            System.out.println(getNumeroAnalisis(in.next()));
    }
}
