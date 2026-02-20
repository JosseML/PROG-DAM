package repetitivas;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int terminos;
        int mayor;
        int menor;
        int suma;
        int n;
        
        System.out.print("Cuántos números se van a teclear?: ");
        terminos = in.nextInt();
        
        System.out.print("Número: ");
        mayor = menor = suma = in.nextInt();
        
        // El bucle se itera una vez menos porque ya se pidió el primer número fuera de él.
        for (int i = 0; i < terminos - 1; i++) {
            System.out.print("Número: ");
            n = in.nextInt();
            suma += n;

            if (n > mayor)
                mayor = n;
            else if (n < menor)
                menor = n;
        }
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + (double)suma / terminos);
       
    }
}