package ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ejercicio39 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        double sueldoFijo;
        double sueldoFinal;
        double comision;
        double ventas;
        double kilometraje;
        double kilometrosRecorridos;
        double dietas;
        byte diasDesplazamiento;
        
        System.out.print("Sueldo fijo: ");
        sueldoFijo = in.nextDouble();
        
        System.out.print("Importe ventas realizadas: ");
        ventas = in.nextDouble();
        
        System.out.print("Kilómetros recorridos: ");
        kilometrosRecorridos = in.nextDouble();
        
        System.out.print("Número días de desplazamiento: ");
        diasDesplazamiento = in.nextByte();
        
        comision = ventas * 0.05;
        kilometraje = kilometrosRecorridos * 0.19;
        dietas = 30 * diasDesplazamiento;
        
        sueldoFinal = sueldoFijo + comision + kilometraje + dietas;
        
        sueldoFinal *= 0.81;
        System.out.println("Sueldo: " + sueldoFinal);

        sueldoFinal -= 150;
        System.out.printf("Sueldo final: %.2f%n", + sueldoFinal);
        System.out.println("Sueldo final: " + df.format(sueldoFinal));
        System.out.println("Sueldo final: " + nf.format(sueldoFinal));
    }
}