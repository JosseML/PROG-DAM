package aceptaelreto;

import java.util.Arrays;
import java.util.Scanner;

public class AER666 {

    static boolean f(String a, String b) {
        
        int[] f = new int[26];

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 'A' && c <= 'Z') f[c - 'A']++;
            else if (c >= 'a' && c <= 'z') f[c - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c >= 'A' && c <= 'Z') f[c - 'A']--;
            else if (c >= 'a' && c <= 'z') f[c - 'a']--;
        }

        for (int x : f) if (x != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int t = Integer.parseInt(in.nextLine());

        while (t-- > 0) {
            char[] a = in.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase().toCharArray();
            char[] b = in.nextLine().replaceAll("[^A-Za-z]", "").toLowerCase().toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            System.out.println(Arrays.equals(a, b) ? "SI" : "NO");
        }
    }
}