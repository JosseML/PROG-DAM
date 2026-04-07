package aceptaelreto;

import java.util.Scanner;

public class AER124 {

    static void rellenar(byte[] v, String n) {

        int j = v.length - 1;
        
        for (int i = n.length() - 1; i >= 0; i--) 
            v[j--] = (byte)(n.charAt(i) - '0');
    }
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String n1, n2;
        
        n1 = in.next();
        n2 = in.next();
        
        int max;
        
        byte[] v1, v2;
        
        while (!n1.equals("0") || !n2.equals("0")) {
            max = Math.max(n1.length(), n2.length());
            
            v1 = new byte[max];
            v2 = new byte[max];

            rellenar(v1, n1);
            rellenar(v2, n2);
            
            n1 = in.next();
            n2 = in.next();
        }
    }
}