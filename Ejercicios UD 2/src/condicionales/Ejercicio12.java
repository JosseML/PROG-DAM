package condicionales;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int km;
        double importe;
        final int FIJO = 30;
        final double IMPORTE_KM_TRAMO2 = 0.20;
        final double IMPORTE_KM_TRAMO3 = 0.15;
        final int LIMITE_TRAMO1 = 300;
        final int LIMITE_TRAMO2 = 1000;
                
        System.out.println("Kilometros recorridos: ");
        km = in.nextInt();
        
        if (km <= LIMITE_TRAMO1)
            importe = FIJO;
        else if (km <= LIMITE_TRAMO2)
            importe = (FIJO + (km - LIMITE_TRAMO1) * IMPORTE_KM_TRAMO2);
        else
            importe = FIJO 
                    + (LIMITE_TRAMO2 - LIMITE_TRAMO1) * IMPORTE_KM_TRAMO2 
                    + (km - LIMITE_TRAMO2) * IMPORTE_KM_TRAMO3;
      
        System.out.println(importe + " €");
    }
}