package repetitivas;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numeroTerminos;
        double suma = 0;
        
        System.out.print("Cuántos términos quiere sumar?: ");
        numeroTerminos = in.nextInt();
       
        for (int i = 1; i <= numeroTerminos; i++)
            suma += 1D / i;
        
        System.out.println(suma);
    }
}