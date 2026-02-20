package condicionales;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        byte dia;
        boolean clienteFrecuente;
        String frecuente;
        double precio;
        
        System.out.print("Indique el día de la semana: ");
        dia = in.nextByte();
        
        System.out.print("Es un cliente frecuente? (S/N): ");
        frecuente = in.next(); // Lee el siguiente texto. Tiene que estar delimitado por un Espacio o un Enter
        clienteFrecuente = frecuente.toUpperCase().charAt(0) == 'S';
        
        precio = switch (dia) {
            case 1, 2, 3, 4, 5 -> 12;
            default -> 15;
        };
        
        if (clienteFrecuente)
            precio *= 0.85; // Rebaja 15%
        
        System.out.println("Precio: " + precio + "€");
    }
}