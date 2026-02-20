package ejercicios;

public class Ejercicio17 {

    public static void main(String[] args) {
        
       int n = 10;
       int p = 4;
       int q = 2;
       double z;
       
       z = n / p;               // 2.0
        System.out.println(z);
        
       z = (double) n / p;      // 2.5
        System.out.println(z);
        
       z = (double) (n /p);     // 2.0
        System.out.println(z);
        
       z += n;                  // 12.0
        System.out.println(z);
        
       q *= z;                  // 24
        System.out.println(q);
        
       z += 2;                  // 14.0
        System.out.println(z);
    }
}