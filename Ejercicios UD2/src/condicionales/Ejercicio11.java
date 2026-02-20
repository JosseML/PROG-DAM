package condicionales;

import java.time.Year;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int año;
        boolean esBisiesto;
        
        System.out.print("Año: ");
        año = in.nextInt();
        
        // Primera alternativa
        if (Year.isLeap(año))
            System.out.println("Bisiesto");
        else
            System.out.println("No bisiesto");
        
        // Segunda alternativa
        System.out.println((Year.isLeap(año))? "Bisiesto" : "No bisiesto");
        
        // Tercera alternativa (La que pide el ejercicio)
        esBisiesto = (año % 4 == 0) &&
                     (año % 100 != 0 || año % 400 == 0);
        
        if (esBisiesto)
            System.out.println("Bisiesto");
        else
            System.out.println("No bisiesto");
        
        // Cuarta alternativa
        if (año % 4 == 0) {
            if (año % 100 != 0 || año % 400 == 0)
                System.out.println("Bisiesto");
            else
                System.out.println("No bisiesto");
        } else
            System.out.println("No bisiesto");
    }
}