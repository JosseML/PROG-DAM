package aceptaelreto;

import java.util.Scanner;
import java.util.HashMap;

public class AER709 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numVotos;
        HashMap<String, Integer> mapa;
        String sede;
        String ganador;
        int max;
        
        while ((numVotos = in.nextInt()) != 0) {
            mapa = new HashMap<>();
            
            // Lectura de votos
            while (numVotos-- > 0) {
                sede = in.next();
                
                if (mapa.containsKey(sede))
                    mapa.put(sede, mapa.get(sede) + 1);
                else
                    mapa.put(sede, 1);
            }

            // Elección del ganador
            ganador = "";
            max = 0;
            
            for (String key: mapa.keySet()) {
                if (mapa.get(key) > max) {
                    ganador = key;
                    max = mapa.get(key);
                } else if (mapa.get(key) == max)
                    ganador = "EMPATE";
            }
            System.out.println(ganador);
        }
    }
}
