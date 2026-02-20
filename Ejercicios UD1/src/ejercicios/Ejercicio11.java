package ejercicios;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        // A
        int x = 50;
        
        /*
           x = x * 8;
           x *= 8;
        */
        
        x = x << 3;
        
        /*
           50 = 00110010
           Primer desplazamiento:  001100100 (100)
           Segundo desplazamiento: 0011001000 (200)
           Tercer desplazamiento:  00110010000 (400)
        */
                
        System.out.println(x);
       
       // B
       byte n = (byte)x;
        System.out.println(n);
        /*
            00110010000 (x)
        Al hacer el cast, no quedamos con los 8 bits
        menos significativos. El resto se cortan.
               10010000 (n)
        */
    }
}