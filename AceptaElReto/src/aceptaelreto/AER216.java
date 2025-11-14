package aceptaelreto;

import java.util.Scanner;

public class AER216 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int SEG_HORA = 3_600; // Segundos que tiene una hora

        int casos = in.nextInt();
        int gotas; // (0, 86.500)
        byte horas;
        byte minutos;
        byte segundos;

        for (int i = 0; i < casos; i++) {
            gotas = in.nextInt();

            horas = (byte) (gotas / SEG_HORA);
            gotas = gotas % 3600; // Segundos que no pude agrupar en horas

            minutos = (byte) (gotas / 60);

            segundos = (byte) (gotas % 60);

            System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
        }
    }
}
