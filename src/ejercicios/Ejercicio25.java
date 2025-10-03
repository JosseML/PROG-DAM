package ejercicios;

public class Ejercicio25 {

    public static void main(String[] args) {
        
        double m = 1;
        double n = 2;
        double p = 3;
        double q = 4;
        double x = 5;
        double y = 6;
        double a = 7;
        double b = 8;
        double resultado;
        
        // A)
        resultado = m / n * (p + q);
        System.out.println(resultado);
        
        // B) 
        resultado = m / n + 1;
        System.out.println(resultado);
        
        // C)
        resultado = (m + 1) / n;
        System.out.println(resultado);
        
        // D)
        resultado = m + n / 1;
        System.out.println(resultado);
        
        // E)
        resultado = Math.pow((x + y), 2) * (a - b);
        System.out.println(resultado);
    }
}