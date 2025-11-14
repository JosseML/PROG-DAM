package aceptaelreto;

import java.util.Scanner;

public class AER605 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String linea;

        int verano;
        int invierno;

        while (!(linea = in.nextLine()).equals(".")) {

            verano = invierno = 0;

            for (int i = 0; i < linea.length() - 2; i += 2) {
                if (linea.charAt(i) == 'V') {
                    verano++;
                } else if (linea.charAt(i) == 'I') {
                    invierno++;
                }
            }

            if (verano > invierno) {
                System.out.println("VERANO");
            } else if (verano == invierno) {
                System.out.println("EMPATE");
            } else {
                System.out.println("INVIERNO");
            }
        }
    }
}
