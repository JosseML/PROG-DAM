package aceptaelreto;

import java.util.Scanner;

public class AER117 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        in.nextLine();
        String linea;
        String nombre;

        while (casos-- > 0) {
            linea = in.nextLine();

            nombre = linea.substring(4);
            System.out.println("Hola, " + nombre + ".");
        }
    }
}
