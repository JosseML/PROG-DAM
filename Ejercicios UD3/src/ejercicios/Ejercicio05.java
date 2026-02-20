package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

    private static double getPorcentaje(String texto, char c) {

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            
            if (texto.charAt(i) == c)
                contador++;
        }

        return (contador * 100d) / texto.length();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String texto = in.nextLine();

        System.out.println("a: " + getPorcentaje(texto, 'a') + "%");
        System.out.println("e: " + getPorcentaje(texto, 'e') + "%");
        System.out.println("i: " + getPorcentaje(texto, 'i') + "%");
        System.out.println("o: " + getPorcentaje(texto, 'o') + "%");
        System.out.println("u: " + getPorcentaje(texto, 'u') + "%");
    }
}
