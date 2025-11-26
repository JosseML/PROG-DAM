package aceptaelreto;

import java.util.Scanner;

public class AER456 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        int ancho, alto;
        int cuadraditos;
        int necesito;
        int tabletas;

        while (casos-- > 0) {
            // Ancho y alto de una tableta
            ancho = in.nextInt();
            alto = in.nextInt();

            // Cuadraditos que tiene una tabla de chocolate.
            cuadraditos = ancho * alto;

            necesito = in.nextInt();

            if (cuadraditos < necesito) {
                tabletas = necesito / cuadraditos;

                if (necesito % cuadraditos == 0) {
                    System.out.println(tabletas);
                } else {
                    System.out.println(tabletas + 1);
                }
            } else {
                System.out.println("1"); // Con una tableta es suficiente.
            }
        }
    }
}
