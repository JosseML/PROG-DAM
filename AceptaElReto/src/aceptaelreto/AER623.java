package aceptaelreto;

import java.util.Scanner;

public class AER623 {

    static boolean gano(byte[] contadores) {

        for (int i = 0; i < 10; i++) {

            if (contadores[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int casos = in.nextInt();
        
        String numero;
        
        byte[] contadores;
        
        while (casos-- > 0) {
            
            contadores = new byte [10];
            
            numero = in.next();
            
            for (int i = 0; i < numero.length(); i++)
                contadores[numero.charAt(i) - '0']++;
            numero = in.next();
            for (int i = 0; i < numero.length(); i++)
                contadores[numero.charAt(i) - '0']--;
            
            System.out.println(gano(contadores)? "GANA" : "PIERDE");
        }
    }
}