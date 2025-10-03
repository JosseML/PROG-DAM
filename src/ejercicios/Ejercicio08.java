package ejercicios;

public class Ejercicio08 {

    public static void main(String[] args) {
        
        int q = 2; // Cuidado!!! Nunca se usa el 2.
        int n = 10;
        
        q = ++n * 3;
        System.out.println(q); // 33
         // n vale 11.
         
        n = 10; // Se resetea el valor original.
        q = n++ * 3;
        System.out.println(q); // 30
    }
}