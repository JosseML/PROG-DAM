package aceptaelreto;

import java.util.Scanner;

public class AER300 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int esPentavocalica;

        int casos = in.nextInt();
        in.nextLine(); // Se limpia el Enter
        String palabra;

        while (casos-- > 0) {
            palabra = in.nextLine();

            esPentavocalica = 0;

            for (int j = 0; j < palabra.length(); j++) {

                // La J indica la posición de la letra 
                // que estoy procesando en cada iteración
                switch (palabra.charAt(j)) {
                    case 'a':
                        esPentavocalica |= 1;
                        break;
                    case 'e':
                        esPentavocalica |= 2;
                        break;
                    case 'i':
                        esPentavocalica |= 4;
                        break;
                    case 'o':
                        esPentavocalica |= 8;
                        break;
                    case 'u':
                        esPentavocalica |= 16;
                        break;
                }
            }

            if (esPentavocalica == 31) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        }
    }
}
