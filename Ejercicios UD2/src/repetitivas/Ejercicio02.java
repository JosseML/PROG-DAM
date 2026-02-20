package repetitivas;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        final int MAX = 5;
        int n;
        int suma = 0;
        double media;
        
        for (int i = 1; i <= MAX; i++) {
            System.out.print("Teclee el número: " + i + ": ");
            n = in.nextInt();
            suma += n;
        }
        
        media = (double)suma / MAX;
        System.out.println("Media: " + media);
    }
}