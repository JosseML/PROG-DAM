package aceptaelreto;

import java.util.Scanner;

public class AER122 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int actual; // Punto kilométrico actual
        int anterior; // Punto kilométrico anterior

        while ((anterior = in.nextInt()) != -1) {
            while ((actual = in.nextInt()) != -1) {

                System.out.print(anterior + " " + actual);
            }
        }
    }
}
