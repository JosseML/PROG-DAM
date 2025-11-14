package aceptaelreto;

import java.util.Scanner;

public class AER595 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        while (casos-- > 0) {

            int id = in.nextInt();
            int volumen = (id - 100) / 100 + 1;

            System.out.println(volumen);
        }
    }
}
