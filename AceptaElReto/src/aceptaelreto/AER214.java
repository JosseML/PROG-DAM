package aceptaelreto;

import java.util.Scanner;
import java.util.HashMap;

public class AER214 {

    static void nuevo(HashMap<String, Integer> map, String nuevo) {

        if (map.containsKey(nuevo)) {
            map.put(nuevo, map.get(nuevo) + 1);
        } else {
            map.put(nuevo, 1);
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int numReyesAnteriores;
        int numReyesSiguientes;
        String nombre;
        HashMap<String, Integer> map;
        
        while ((numReyesAnteriores = in.nextInt()) != 0) {

            map = new HashMap<>();
        
            while (numReyesAnteriores-- > 0) {
                nombre = in.next();
                nuevo(map, nombre);
            }

            numReyesSiguientes = in.nextInt();
        
            while (numReyesSiguientes-- > 0) {
                nombre = in.next();
                nuevo(map, nombre);
                System.out.println(map.get(nombre));
            }
            
            System.out.println();
        }
    }
}
