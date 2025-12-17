package aceptaelreto;

import java.util.Scanner;

public class AER372 {

    private static String reverseRecursivo(String texto) {

        if (texto.length() == 0)
            return "";

        return texto.charAt(texto.length() - 1) + reverseRecursivo(texto.substring(0, texto.length() - 1));
    }
    
    private static String resuelve(String frase){
        
        return reverseRecursivo(frase);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int casos = in.nextInt();
        in.nextLine();
        
        while (casos-- > 0)
           System.out.println(resuelve(in.nextLine()));
    }
}
