package expresiones;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int fila;
        int columna;
        
        System.out.print("Fila: ");
        fila = in.nextInt();
        
        System.out.print("Columna: ");
        columna = in.nextInt();
        
        System.out.println("(" + fila + ", " + columna + ") " + "dentro de la matriz: " + (fila >= 1 && fila <= 5 && columna >= 1 && columna <= 5)
        );
       
    }

}