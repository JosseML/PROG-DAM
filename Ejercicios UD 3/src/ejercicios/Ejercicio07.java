package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

    private static boolean esHoraValida(int h, int m, int s) {
        return h >= 0 && h <= 23 &&
               m >= 0 && m <= 59 &&
               s >= 0 && s <= 59;
    }

    private static boolean esHoraValida(String hora) {
        // Se recibe la hora en este formato: hh:mm:ss
        int h = Byte.parseByte(hora.substring(0, 2));
        int m = Byte.parseByte(hora.substring(3, 5));
        int s = Byte.parseByte(hora.substring(6));

        return esHoraValida(h, m, s);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String hora = in.nextLine();

        System.out.println(esHoraValida(hora));
    }
}
