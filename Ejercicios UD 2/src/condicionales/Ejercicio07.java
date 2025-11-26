package condicionales;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        byte hora;
        byte minutos;
        boolean pm;
        
        System.out.print("Hora: ");
        hora = in.nextByte();
        
        System.out.print("Minutos: ");
        minutos = in.nextByte();
        
        pm = hora >= 12;
        
        if (hora > 12)
            hora -= 12;
        
        System.out.printf("%02d:%02d", hora, minutos);
        
        if (pm)
            System.out.println(" PM");
        else
            System.out.println(" AM");
    }
}