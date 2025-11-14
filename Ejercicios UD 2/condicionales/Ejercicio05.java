package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        int unidades;
        int descuento;
        double precioUnitario = 10;
        double precioFinal;
        Scanner in = new Scanner(System.in);
        
        System.out.printf("Unidades: ");
        unidades = in.nextInt();
        
        if (unidades > 100)
            descuento = 40;
        else if (unidades >= 25)
            descuento = 20;
        else if (unidades >= 10)
            descuento = 10;
        else
            descuento = 0;
        
        System.out.println("Descuento: " + descuento + "%");
        
        precioFinal = precioUnitario * (1 - descuento / 100D);
        System.out.println("Precio final unitario: " + precioFinal);
    }
}