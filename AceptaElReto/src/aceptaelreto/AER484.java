package aceptaelreto;

import java.util.Scanner;

public class AER484 {
    private static String dhahran(String n) {

        int i = 0;

        while (i < n.length() && n.charAt(i) == '0') {
            i++;
        }

        n = n.substring(i);

        if (n.isEmpty() || n.equals(".")) {
            return "0";
        }

        if (n.charAt(0) == '.') {
            n = "0" + n;
        }

        return n;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(dhahran(in.nextLine()));
        }
    }
}
