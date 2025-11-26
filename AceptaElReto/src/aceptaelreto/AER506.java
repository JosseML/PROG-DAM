package aceptaelreto;

import java.util.Scanner;

public class AER506 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();

        int max, min;

        for (; casos-- > 0;) {
            max = in.nextInt();
            in.next(); // Se vacía la barra de separación
            min = in.nextInt();

            if (max < min) {
                System.out.println("MAL");
            } else {
                System.out.println("BIEN");
            }
        }
    }
}
