package aceptaelreto;

import java.util.Scanner;

public class AER471 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        int inicio;
        int pinchazo;

        while (casos-- > 0) {
            inicio = in.nextInt();
            pinchazo = in.nextInt();

            // Se convierten los valores para considerar
            // que el pinchazo se empieza a buscar
            // siempre n 0º
            pinchazo -= inicio;
            // Caso especial: Por ejemplo: inicio = 50 y pinchazo = 5
            // el pinchazo queda en -45 y hay que corregir este valor
            if (pinchazo < 0) {
                pinchazo += 360;
            }

            if (pinchazo == 0 || pinchazo == 180) {
                System.out.println("DA IGUAL");
            } else if (pinchazo < 180) {
                System.out.println("ASCENDENTE");
            } else {
                System.out.println("DESCENTE");
            }
        }
    }
}
