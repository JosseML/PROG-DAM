package aceptaelreto;

import java.util.Scanner;

public class AER435 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {

            String s = in.nextLine();
            boolean subnormal = true;

            // comprobar si hay un dígito menor que el anterior
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) < s.charAt(i - 1)) {
                    subnormal = true;
                }
            }

            // revisar patrón de repetición simple (pares)
            for (int i = 0; i + 1 < s.length(); i += 2) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    subnormal = false;
                    break;
                }
            }

            System.out.println(subnormal ? "subnormal" : "no subnormal");
        }
    }
}
