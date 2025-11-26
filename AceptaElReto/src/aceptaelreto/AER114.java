package aceptaelreto;

import java.util.Scanner;

public class AER114 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        int n;

        while (casos-- > 0) {
            n = in.nextInt();

            switch (n) {
                case (0):
                    System.out.println("1");
                    break;
                case (1):
                    System.out.println("1");
                    break;
                case (2):
                    System.out.println("2");
                    break;
                case (3):
                    System.out.println("6");
                    break;
                case (4):
                    System.out.println("4");
                    break;
                default:
                    System.out.println("0");
            }
        }
    }
}
