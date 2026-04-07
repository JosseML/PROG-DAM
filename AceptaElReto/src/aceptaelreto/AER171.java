package aceptaelreto;

import java.util.Scanner;

public class AER171 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            int n = in.nextInt();
            if (n == 0) break;

            int[] montanas = new int[n];

            for (int i = 0; i < n; i++) {
                montanas[i] = in.nextInt();
            }

            int maxEste = -1;
            int abadias = 0;

            // Recorremos de derecha a izquierda
            for (int i = n - 1; i >= 0; i--) {
                if (montanas[i] > maxEste) {
                    abadias++;
                    maxEste = montanas[i];
                }
            }

            System.out.println(abadias);
        }
    }
}
