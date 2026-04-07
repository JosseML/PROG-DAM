package aceptaelreto;

import java.util.Scanner;

public class AER337 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arriba = new int[6];
        int casos = in.nextInt();

        while (casos-- > 0) {

            for (int i = 0; i < 6; i++) {
                arriba[i] = in.nextInt();
            }

            boolean encajan = true;

            int altura = in.nextInt() + arriba[0];

            for (int i = 1; i < 6; i++) {

                if (in.nextInt() + arriba[i] != altura) {
                    encajan = false;
                }
            }

            System.out.println(encajan ? "SI" : "NO");
        }
    }
}