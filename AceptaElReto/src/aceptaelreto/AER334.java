package aceptaelreto;

import java.util.Scanner;

public class AER334 {

    private static boolean esGalo(String nombre) {
        return nombre.endsWith("IX");
    }

    private static boolean esRomano(String nombre) {
        return nombre.endsWith("US") || nombre.endsWith("UM");
    }

    private static boolean esGodo(String nombre) {
        return nombre.endsWith("IC");
    }

    private static boolean esGriego(String nombre) {
        return nombre.endsWith("AS");
    }

    private static boolean esNormando(String nombre) {
        return nombre.endsWith("AF");
    }

    private static boolean esBreton(String nombre) {
        return nombre.endsWith("IS") || nombre.endsWith("OS") || nombre.endsWith("AX");
    }

    private static boolean esHispano(String nombre) {
        return nombre.endsWith("EZ");
    }

    private static boolean esIndio(String nombre) {
        return nombre.endsWith("A");
    }

    private static boolean esPicto(String nombre) {
        return nombre.startsWith("MAC");
    }
    
    private static String getOrigen(String nombre) {

        if (esGalo(nombre))
            return "GALO";
        else if (esRomano(nombre))
            return "ROMANO";
        else if (esGodo(nombre))
            return "GODO";
        else if (esGriego(nombre))
            return "GRIEGO";
        else if (esNormando(nombre))
            return "NORMANDO";
        else if (esBreton(nombre))
            return "BRETON";
        else if (esHispano(nombre))
            return "HISPANO";
        else if (esIndio(nombre))
            return "INDIO";
        else if (esPicto(nombre))
            return "PICTO";
        else if (
            esGalo(nombre)     || esRomano(nombre) ||
            esGodo(nombre)     || esGriego(nombre) ||
            esNormando(nombre) || esBreton(nombre) ||
            esHispano(nombre)  || esIndio(nombre)
        )
            return "MULATO";
        else
            return "PLUS ULTRA";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int casos = in.nextInt();
        in.nextLine(); // limpiar salto

        while (casos-- > 0) {
            System.out.println(getOrigen(in.nextLine()));
        }
    }
}
