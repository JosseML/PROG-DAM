package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    private static int fibonacci(int termino) {
        
        if (termino == 0 || termino == 1)
            return 1;
        
        return fibonacci(termino - 1) + fibonacci(termino - 2);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int termino;
        
        System.out.print("Indica hasta qué termino quieres ver de la serie Fibonacci: ");
        termino = in.nextInt();
        
        for (int i = 0; i < termino; i++)
             System.out.print(fibonacci(i) + ", ");
        System.out.println(fibonacci(termino));
    }
}