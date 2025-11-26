package repetitivas;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numeroTerminos;
        double suma = 0;
        
        System.out.print("Cuántos términos quiere sumar?: ");
        numeroTerminos = in.nextInt();
       
        for (int i = 1; i <= numeroTerminos; i++)
            // No hay que hacer un cast porque el método
            // Math.pow(base, exponente) devuelve un double.
            suma += i / Math.pow(2, i);

        System.out.println(suma);
    }
}