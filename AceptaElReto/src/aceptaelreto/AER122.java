package aceptaelreto;

import java.util.Scanner;

public class AER122 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int actual;
        int anterior; // Punto kilométrico anterior
        int kmsLlanoActual;
        int max;
        int desde = 0; // PK de inicio de la etapa de avituallamiento
        int inicio; // PK donde empieza la etapa llana actual
        int pk; // Punto kilométrico actual

        // Cada iteración de este while es un caso de prueba
        while ((anterior = in.nextInt()) != -1) {
            kmsLlanoActual = 0;
            max = 0;
            inicio = 0;
            pk = 0;
            
            while ((actual = in.nextInt()) != -1) {
                pk++;
                if (anterior == actual) {
                    kmsLlanoActual++;
                    if (kmsLlanoActual > max) {
                        max = kmsLlanoActual;
                        desde = inicio;
                    }
                } else {
                    kmsLlanoActual = 0;
                    inicio = pk;
                }
                
                anterior = actual;
            }

            if (max == 0)
                System.out.println("HOY NO COMEN");
            else
                System.out.println(desde + " " + max);
        }
    }
}
