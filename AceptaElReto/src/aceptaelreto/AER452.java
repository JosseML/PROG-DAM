package aceptaelreto;

import java.util.*;

public class AER452 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numBolas;

        while ((numBolas = in.nextInt()) != 0) {

            int[] bolas = new int[numBolas];

            for (int i = 0; i < numBolas; i++) {
                bolas[i] = in.nextInt();
            }

            Arrays.sort(bolas);

            TreeSet<Integer> set = new TreeSet<>();

            for (int i = bolas.length - 1; i > 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    set.add(bolas[i] - bolas[j]);
                }
            }

            Iterator<Integer> it = set.iterator();
            StringBuilder sb = new StringBuilder();

            while (it.hasNext()) {
                sb.append(it.next());
                if (it.hasNext()) sb.append(" ");
            }

            System.out.println(sb);
        }
    }
}
