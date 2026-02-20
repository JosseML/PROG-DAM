package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

    private static boolean esBisiesto(int año) {

        return (año % 4 == 0) && (año % 100 != 0 || año % 400 == 0);
    }

    private static int getDiasMes(int mes, int año) {

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                return (esBisiesto(año)) ? 29 : 28;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Mes: ");
        int mes = in.nextInt();
        System.out.print("Año: ");
        int año = in.nextInt();

        System.out.println(getDiasMes(mes, año));
    }
}
