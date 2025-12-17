package aceptaelreto;

import java.util.Scanner;

public class AER182 {

    private static int getSiguienteRecursivo(int n) {

        if (n < 10) 
            return n;

        return (n % 10) * getSiguienteRecursivo(n / 10);
    }

    private static int getPersistenciaRecursivo(int n) {

        if (n < 10)
            return 0;

        return 1 + getPersistenciaRecursivo(getSiguienteRecursivo(n));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();

        while (casos-- > 0) {

            System.out.println(getPersistenciaRecursivo(in.nextInt()));
        }
    }
}
