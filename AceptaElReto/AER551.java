package aceptaelreto;

import java.util.Scanner;

public class AER551 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String entrada;
        
        int id; // Índice para moverme sobre la cadena
        int limite;
        
        StringBuilder sb;
        
        while (in.hasNext()){
            
            sb = new StringBuilder();
            entrada = in.nextLine();
            id = 0; // Empezamos por el primer símbolo.
            
            while (id < entrada.length()){
                limite = (entrada.charAt(id) == '1')? 3:2;
                sb.append((char)Integer.parseInt(entrada.substring(id, id + limite)));
                id += limite;
            }
            System.out.println(sb.toString());
        }
    }
}