package aceptaelreto;

import java.util.Scanner;

public class AER219 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numeroCasos = in.nextInt();
        int numDecimos;
        int decimo;
        int contador;

        // Hacemos tantas iteraciones como tantas iteraciones como casos de pruebas tengamos
        for (int i = 0; i < numeroCasos; i++) {
            contador = 0;
            numDecimos = in.nextInt();

            for (int j = 0; j < numDecimos; j++) {
                decimo = in.nextInt();

                if (decimo % 2 == 0) {
                    contador++;
                }
            }

            System.out.println(contador);
        }
    }
}
