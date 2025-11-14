package ejercicios;

public class Ejercicio29 {

    public static void main(String[] args) {
        
        final double G = 6.674E-11;
        double m1 = 2;
        double m2 = 3;
        double d = 2;
        
        double f = G * m1 * m2 / Math.pow(d, 2);
        
        // 1.0011 E-10
        System.out.println(f);
    }
}