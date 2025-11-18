package aceptaelreto;

import java.util.Scanner;

public class AER151 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        byte lado;
        short dato;
        boolean esIdentidad;

        // En cada iteracción se procesa una matriz
        while ((lado = in.nextByte()) != 0) {
            esIdentidad = true;
            
            for (byte fila = 0; fila < lado; fila++) {
                for (byte col = 0; col < lado; col++) {
                    dato = in.nextShort();
                    // Es identidad si: fila y col son iguales y dato = 1 o fila y col son distintas y dato = 0
                    // Si no se cumplen las condiciones anteriores no es identidad
                    if ((fila == col && dato != 1)
                        ||
                        (fila != col && dato != 0))
                        esIdentidad = false;
                }
            }
            System.out.println((esIdentidad)? "SI" : "NO");
        }
    }
}
