package aceptaelreto;

import java.util.Scanner;

public class AER694 {

    private static String acronimo(String entrada) {
        
        Scanner in = new Scanner(entrada);
        
        StringBuilder sb = new StringBuilder();

        while (in.hasNext()) {
            String palabra = in.next();
            sb.append(Character.toUpperCase(palabra.charAt(0)));
        }

        in.close();
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int casos = in.nextInt();
        in.nextLine();
        
        while (casos-- > 0) {
            String entrada = in.nextLine();
            System.out.println(acronimo(entrada));  
        }
        
        in.close();
    }
}