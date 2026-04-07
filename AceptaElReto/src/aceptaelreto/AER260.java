package aceptaelreto;

import java.util.Scanner;

public class AER260 {

    static boolean esAnagrama(int[] frase) {

        for (int i = 'a'; i <= 'z'; i++) {

            if ((frase[i] % 2) != 0)
                
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        in.nextLine();

        String cadena;
        int[] frase;

        while (casos-- > 0) {

            frase = new int[123];

            cadena = in.nextLine();
            for (int i = 0; i < cadena.length(); i++)

                if (cadena.charAt(i) != ' ')
                    frase[cadena.charAt(i) | 32]++;
                
            cadena = in.nextLine();
            for (int i = 0; i < cadena.length(); i++)

                if (cadena.charAt(i) != ' ')
                    frase[cadena.charAt(i) | 32]++;
                    
            System.out.println(esAnagrama(frase) ? "SI" : "NO");
        }
    }
}