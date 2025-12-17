package aceptaelreto;

import java.util.Scanner;

public class AER446 {
    
    private static final Scanner in = new Scanner(System.in);

    private static boolean esAbuelaVerdadera() {
        
        String nieto = in.next();
        int numNietos = in.nextInt();
        String ultimoNieto = "";
        
        for (int i = 0; i < numNietos; i++) {
            ultimoNieto = in.next();
            
            if (ultimoNieto.equals(nieto) && i < numNietos - 1) {
                in.nextLine();
                return false;
            }
        }
    
    return ultimoNieto.equals(nieto) && numNietos > 1;
}
    public static void main(String[] args) {
        
        int casos = in.nextInt();
        
        while (casos-- > 0) 
            System.out.println(esAbuelaVerdadera()? "VERDADERA" : "FALSA");
    }
}