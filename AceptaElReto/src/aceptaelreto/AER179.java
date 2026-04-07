package aceptaelreto;

import java.util.Scanner;

public class AER179 {

    public static void main(String[] args) {

        final int MAX = 1_000_001;

        Scanner in = new Scanner(System.in);

        int numMolinos;
        int[] molinos = new int[MAX];
        int numPreguntas;
        int desde;
        int hasta;

        while ((numMolinos = in.nextInt()) != 0) {

            for (int i = 1; i < numMolinos; i++)
                molinos[i] = in.nextInt() + molinos[i - 1];

            numPreguntas = in.nextInt();

            while (numPreguntas-- > 0) {

                desde = in.nextInt();
                hasta = in.nextInt();

                System.out.println(molinos[hasta] - molinos[desde - 1]);
            }
        }
    }
}