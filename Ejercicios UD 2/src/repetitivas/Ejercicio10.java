package repetitivas;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numTerminos;
        int termino;
        
        System.out.print("Indique el número de términos que desea ver: ");
        numTerminos = in.nextInt();
        
        termino = 1;
        
        for (int i = 0; i < numTerminos - 1; i++) {
            System.out.print(termino + ", ");
            termino *= -2;
        }
        if (numTerminos > 0)
            System.out.println(termino);
    }
}