package aceptaelreto;

import java.util.Scanner;

public class AER140 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String entrada;
        String salida;

        int suma; // Suma de todos los dígitos de cada número.

        // Con cualquier número negativo, acaba el proceso
        while ((entrada = in.nextLine()).charAt(0) != '-') {

            suma = 0;
            salida = "";

            for (int i = 0; i < entrada.length() - 1; i++) {

                suma += entrada.charAt(i) - '0';
                salida = salida + entrada.charAt(i) + " + ";
            }

            // Caso especial: El último dígito no tiene a su derecha el signo +
            suma += entrada.charAt(entrada.length() - 1) - '0';
            salida = salida + entrada.charAt(entrada.length() - 1);
            System.out.println(salida + " = " + suma);
        }
    }
}
