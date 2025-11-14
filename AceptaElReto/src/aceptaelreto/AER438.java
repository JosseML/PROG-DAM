package aceptaelreto;

import java.util.Scanner;

public class AER438 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String texto;

        int letras;
        int exclamaciones;

        while (in.hasNext()) {
            texto = in.nextLine();

            letras = 0;
            exclamaciones = 0;

            // Cada iteración procesa una letra
            for (int i = 0; i < texto.length(); i++) {

                if (texto.charAt(i) == '!') {
                    exclamaciones++;
                } else if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z'
                        || texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                    letras++;
                }
            }

            if (exclamaciones > letras) {
                System.out.println("ESGRITO");
            } else {
                System.out.println("escrito");
            }
        }
    }
}
