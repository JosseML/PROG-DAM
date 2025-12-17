package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

    private static void trianguloInterno(int n, int actual) {
        
        if (actual > n)
            return;
        
        for (int i = 1; i < actual; i++)
            
            System.out.println(i + " ");
        System.out.println(actual);
        
        trianguloInterno(n, actual + 1);
    }
    
    private static void triangulo(int n) {
        
        trianguloInterno(n, 1);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Valor de N: ");
        int n = in.nextInt();
        
        triangulo(n);
    }
}