package condicionales;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        byte mes;
        
        System.out.print("Indique el número del mes: ");
        mes = in.nextByte();
        
        // Código para JDK anteriores al 14
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 días2");
                break;
            default:
                System.out.println("28 o 29 días");
        }
        
        // A partir del JDK 14
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 días");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 días2");
                break;
            default:
                System.out.println("28 o 29 días");
        }
    }
}