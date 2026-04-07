package aceptaelreto;

import java.util.Scanner;

public class AER336 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        byte[] pesos;
        int numNinos;
        int suma;
        int sumaIzquierda;
        int sumaDerecha;
        int diferenciaAnterior;
        int diferenciaActual;
        
        while (in.hasNext()){
            numNinos = in.nextInt();
            pesos = new byte[numNinos];
            suma = 0;
            
            for (int i = 0; i < numNinos; i++) {
                pesos[i] = in.nextByte();
                suma += pesos[i];
            }
            
            sumaIzquierda = 0;
            sumaDerecha = suma;
            diferenciaAnterior = suma;
            
            for (int i = 0; i < numNinos; i++) {
                sumaIzquierda += pesos[i];
                sumaDerecha -= pesos[i];
                diferenciaActual = Math.abs(sumaIzquierda - sumaDerecha);
                
                if (diferenciaActual == diferenciaAnterior) {
                    System.out.println("NO JUEGAN");
                    break;
                } else if (diferenciaActual > diferenciaAnterior) {
                    System.out.println(i + " " + (sumaIzquierda - pesos[i]) + " " + (sumaDerecha + pesos[i]));
                    break;
                } else {
                    diferenciaAnterior = diferenciaActual;
                }
            }
        }
    }
}