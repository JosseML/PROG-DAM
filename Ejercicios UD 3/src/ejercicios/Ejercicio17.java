package ejercicios;

public class Ejercicio17 {

    private static int mcd (int a, int b) {
        
        if (b == 0)
            return a;
        
        return mcd(b, a % b);
    }
    
    public static void main(String[] args) {

        int a = 18;
        int b = 24;

        System.out.println(mcd(a, b));
    }
}