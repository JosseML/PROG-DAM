package aceptaelreto;

import java.util.Scanner;

public class AER525 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i1, f1; // Inicio 1 y Final 1
        int i2, f2; // Inicio 2 y Final 2
        int temporal;
        int casos = in.nextInt();

        while (casos-- > 0) {
            i1 = in.nextInt();
            f1 = in.nextInt();
            i2 = in.nextInt();
            f2 = in.nextInt();

            if (i1 > f1) {
                temporal = i1;
                i1 = f1;
                f1 = temporal;
            }

            if (i2 > i2) {
                temporal = i2;
                i2 = f2;
                f2 = temporal;
            }

            if (i1 >= f2 || f1 <= i2) {
                System.out.println("SEPARADOS");
            } else {
                System.out.println("SOLAPADOS");
            }
        }
    }
}
