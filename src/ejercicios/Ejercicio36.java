package ejercicios;

import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        
        final int MINUTOSDIA = 1_440;
                
        Scanner in = new Scanner(System.in);
        int hora, minutos;
        int minutosTotales;
        int segundosRestantes;
        
        System.out.print("Horas: ");
        hora = in.nextByte();
        
        System.out.print("Minutos: ");
        minutos = in.nextInt();
        minutosTotales = hora * 60 + minutos;
        
       segundosRestantes = (MINUTOSDIA - minutosTotales) * 60;
       
        System.out.println("Segundos que faltan hasta la media noche: " + segundosRestantes);
    }
}