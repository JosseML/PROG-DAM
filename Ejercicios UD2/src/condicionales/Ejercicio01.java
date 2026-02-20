package condicionales;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        
        int nota;
        boolean notaValida;
        
        Scanner in = new Scanner(System.in);
        System.out.printf("Indique una nota: ");
        nota = in.nextInt();
        
        notaValida = nota >= 0 && nota <= 10;
        
        if (notaValida)
            System.out.println("Nota correcta");
        else
            System.out.println("Nota incorrecta");
    }
}