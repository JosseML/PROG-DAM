package aceptaelreto;

import java.util.Scanner;

public class AER112 {

    public static void main(String[] args) {

        int distancia;  // metros
        int maximo;     // km/h
        int segundos;   // tiempo en recorrer la distancia

        Scanner in = new Scanner(System.in);

        while (true) {

            distancia = in.nextInt();
            maximo = in.nextInt();
            segundos = in.nextInt();

            if (distancia == 0 && maximo == 0 && segundos == 0) {
                break;
            }

            if (distancia <= 0 || maximo <= 0 || segundos <= 0) {
                System.out.println("ERROR");
            }
            continue;
        }
    }
}
