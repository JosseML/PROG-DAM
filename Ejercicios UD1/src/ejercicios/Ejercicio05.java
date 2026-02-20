package ejercicios;

public class Ejercicio05 {

    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        int temporal;
        
         System.out.println("Situación inicial");
         System.out.println("a = " + a);
         System.out.println("b = " + b);
        
        temporal = a;
         a = b;
         b = temporal;
        
         System.out.println("Situación después del intercambio");
         System.out.println("a = " + a);
         System.out.println("b = " + b);
    }
}