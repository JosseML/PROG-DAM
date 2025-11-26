package aceptaelreto;

import java.util.Scanner;

public class AER165 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero;
        boolean esHyperpar;

        while ((numero = in.nextInt()) >= 0) {
            esHyperpar = true;

            while (numero != 0) {

                while (numero != 0) {
                    if (((numero % 10) & 1) % 2 != 0) {
                        esHyperpar = false;
                    }
                    numero /= 10;
                }
                
                System.out.println((esHyperpar)? "SI" : "NO");
            }
        }
    }
}