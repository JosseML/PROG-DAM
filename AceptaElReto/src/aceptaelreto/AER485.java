package aceptaelreto;

import java.util.Scanner;

public class AER485 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numEtapas;
        int[] distancias;
        int distanciaTotal;

        while ((numEtapas = in.nextInt()) != 0) {
            distancias = new int[numEtapas];
            
            distanciaTotal = 0;
            
            for (int i = 0; i < numEtapas; i++) {
                distancias[i] = in.nextInt();
                distanciaTotal += distancias[i];
            }

            for (int i = 0; i < numEtapas - 1; i++) {
                System.out.println(distanciaTotal + " ");
                distanciaTotal -= distancias[i];
            }
            
            System.out.println(distanciaTotal);
        }
    }
}