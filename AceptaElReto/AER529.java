package aceptaelreto;

import java.util.Scanner;

public class AER529 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String entrada;

        int actual; // Nº de personas dentro del sistema en el momento actual.
        int maximo;

        int casos = in.nextInt();
        in.nextLine(); // Vaciado del Enter.

        while (casos-- > 0) {
            actual = maximo = 0;
            entrada = in.nextLine();

            for (int i = 0; i < entrada.length(); i++) {

                if (entrada.charAt(i) == 'I') {
                    actual++;
                    // maximo = Math.max(actual, maximo);
                    if (actual > maximo)
                        maximo = actual;
                } else if (actual > 0)
                    // IIIO
                    // Hay gente registrada y sale alguien.
                    // Hay que asumir que es una de las personas que vimos entrar
                    actual--;
                else
                    // IIOOOO
                    // OOOOOO
                    // OOOOII
                    // Vemos salir gente que no vimos entrar.
                    // Se incrementa el nº máximo de personas.
                    maximo++;
            }

            System.out.println(maximo);
        }
    }
}
