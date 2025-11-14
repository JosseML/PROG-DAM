package aceptaelreto;

import java.util.Scanner;

public class AER191 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numAcuarios;
        int litros;
        int diferencia;
        int suma;
        int casos = in.nextInt();

        while (casos-- > 0) {
            numAcuarios = in.nextInt();
            litros = in.nextInt();
            diferencia = in.nextInt();
            // OJO!!!
            // La variable suma hay que inicializarla
            // para cada caso de prueba.
            suma = 0;

            while (numAcuarios-- > 0) {
                suma += litros;
                litros -= diferencia;
            }

            System.out.println(suma);
        }
    }
}
