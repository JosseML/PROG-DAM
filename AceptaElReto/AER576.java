package aceptaelreto;

import java.util.Scanner;

public class AER576 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numSegundos;
        int numDefiniciones;
        int totalDefiniciones;
        int totalSegundos;
        int horas;
        int minutos;
        int segundos;

        // Cada iteración representa un caso de prueba.
        while ((numSegundos = in.nextInt()) != 0) {
            totalDefiniciones = 0;

            while ((numDefiniciones = in.nextInt()) != 0) {
                totalDefiniciones += numDefiniciones;
            }

            totalSegundos = totalDefiniciones * numSegundos;

            horas = totalSegundos / 3600;
            totalSegundos %= 3600;

            minutos = totalSegundos / 60;

            segundos = totalSegundos % 60;

            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        }
    }
}
