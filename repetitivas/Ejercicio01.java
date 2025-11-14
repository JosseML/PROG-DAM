package repetitivas;

public class Ejercicio01 {

    public static void main(String[] args) {
     
        int suma = 0;
        
        for (int i = 1; i <= 100; i++)
            suma += i;
        
        System.out.println(suma);
        
        suma = 100 * (100 + 1) / 2;
        System.out.println(suma);
        
        suma = 100 * (100 + 1) >> 1;
        System.out.println(suma);
    }
}