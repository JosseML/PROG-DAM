package aceptaelreto;

import java.util.Scanner;

public class AER698 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int casos = in.nextInt();
        int lado;
        long suma;
        int mayor;
        int dato;
        
        while (casos-- > 0) {
            lado = in.nextInt();
            
            suma = mayor = 0;
            for (int i = 0; i < lado * lado; i++) {
                dato = in.nextInt();
                suma += dato;
                if (dato > mayor)
                    mayor = dato;
            }
            
            System.out.println((suma == 2 * mayor)? "SI" : "NO");
        }
    }
}