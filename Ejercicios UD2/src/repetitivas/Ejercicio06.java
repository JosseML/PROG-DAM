package repetitivas;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numeroTerminos;
        double suma = 0;
        int numerador = 0;
        int denominador = 2;
        
        System.out.print("Cuántos términos quiere sumar?: ");
        numeroTerminos = in.nextInt();
       
        for (int i = 0; i < numeroTerminos; i++) {
            suma += (double)numerador / denominador;
            
            numerador += 5;
            denominador *= 3;
        }
        
        System.out.println(suma);
    }
}