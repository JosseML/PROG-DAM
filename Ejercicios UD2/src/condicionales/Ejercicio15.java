package condicionales;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int a, b, c;
        int discriminante;
        double x1, x2;
        double parteReal;

        System.out.println("Teclee los coeficientes de la ecuación de segundo grado");
        System.out.print("a: ");
        a = in.nextInt();
        System.out.print("b: ");
        b = in.nextInt();
        System.out.print("c: ");
        c = in.nextInt();

        if (a == 0) {
            System.out.println("La solución es: " + ((double) -c / b));
        } else {
            discriminante = b * b - 4 * a * c;
            if (discriminante >= 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Solución x1: " + x1);
                System.out.println("Solución x2: " + x2);
            } else {
                parteReal = -b / (2 * a);
                x1 = Math.sqrt(discriminante * -1) / (2 * a);
                x2 = x1 * -1;
                System.out.println("Parte real: " + parteReal);
                System.out.println("Parte imaginaria 1: " + x1 + " i");
                System.out.println("Parte imaginaria 2: " + x2 + " i");
            }
        }
    }
}