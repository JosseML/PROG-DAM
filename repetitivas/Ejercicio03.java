package repetitivas;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int max;
        int n;
        int suma = 0;
        double media;
        
        System.out.print("Cuántos números va a teclear? ");
        max = in.nextInt();
        
        for (int i = 1; i <= max; i++) {
            System.out.print("Teclee el número: " + i + ": ");
            n = in.nextInt();
            suma += n;
        }
        
        media = (double)suma / max;
        System.out.println("Media: " + media);
    }
}