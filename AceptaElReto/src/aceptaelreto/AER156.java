package aceptaelreto;

import java.util.Scanner;

public class AER156 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int recorrido;
        int origen, destino;

        while ((origen = in.nextInt()) >= 0) {
            recorrido = 0;

            while ((destino = in.nextInt()) != -1){
                recorrido += Math.abs(origen - destino);
                origen = destino;
            }
            
            System.out.println(recorrido);
        }      
    }
}