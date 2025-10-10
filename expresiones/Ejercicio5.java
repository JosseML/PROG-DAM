package expresiones;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        final int MAX = 5;
        int n;
        
        System.out.print("Opción del menú (1 - " + MAX + "): ");
        n = in.nextInt();
        
        System.out.println("Opción correcta: " + (n > 0 && n <= MAX));
    }
}