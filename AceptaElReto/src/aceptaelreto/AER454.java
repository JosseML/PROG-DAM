package aceptaelreto;

import java.util.Scanner;

public class AER454 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int distanciaMaxima;
        int desnivelMaximo;
        int distancia;
        int desnivel;
        int distanciaAcumulada;
        int desnivelAcumulado;
        int numJornadas;
        boolean destituido;

        while (in.hasNext()) {

            destituido = false;
            numJornadas = 1;

            distanciaMaxima = in.nextInt();
            desnivelMaximo = in.nextInt();

            distanciaAcumulada = 0;
            desnivelAcumulado = 0;

            distancia = in.nextInt();
            desnivel = in.nextInt();

            do {

                // Si un tramo por sí solo supera límites > DESTITUIDO
                if (distancia > distanciaMaxima || desnivel > desnivelMaximo) {
                    destituido = true;
                    break;
                }

                // Si cabe en la jornada actual
                if (distanciaAcumulada + distancia <= distanciaMaxima &&
                    desnivelAcumulado + Math.max(desnivel, 0) <= desnivelMaximo) {

                    distanciaAcumulada += distancia;
                    if (desnivel > 0)
                        desnivelAcumulado += desnivel;

                } else {
                    numJornadas++;
                    distanciaAcumulada = distancia;
                    desnivelAcumulado = Math.max(desnivel, 0);
                }

                distancia = in.nextInt();
                desnivel = in.nextInt();

            } while (distancia != 0 || desnivel != 0);

            if (destituido)
                System.out.println("DESTITUIDO");
            else
                System.out.println(numJornadas);
        }
    }
}
