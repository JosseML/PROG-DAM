package aceptaelreto;

import java.util.*;

public class AER185 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        HashSet<String> si;
        TreeSet<String> no;
        
        int numPotitos;
        String ingrediente;
        
        while ((numPotitos = in.nextInt()) != 0) {
            si = new HashSet<>();
            no = new TreeSet<>();
            
            while (numPotitos-- > 0) {
                if (in.next().equals("SI:"))
                    while (!(ingrediente = in.next()).equals("FIN"))
                        si.add(ingrediente);
                else
                    while (!(ingrediente = in.next()).equals("FIN"))
                        no.add(ingrediente);
            }
            no.removeAll(si);
            
            if (no.isEmpty()) {
                System.out.println();
            } else {
                Iterator<String> it = no.iterator();
                while (it.hasNext()) {
                    System.out.print(it.next());
                    if (it.hasNext()) System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
