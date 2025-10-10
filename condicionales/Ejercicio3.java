package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;

        Scanner in = new Scanner(System.in);
        System.out.printf("Indique un número: ");
        numero = in.nextInt();

        if (numero != 0) {
            if (numero % 2 == 0)
                System.out.println(numero + " es par");
            else
                System.out.println(numero + " es impar");
        }
    }
}