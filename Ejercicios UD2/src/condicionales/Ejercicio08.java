package condicionales;

public class Ejercicio08 {

    public static void main(String[] args) {
            
            int a, b, c, d;
            int centenas;
            
            a = 2;
            b = 3;
            c = 6;
            d = 2;
            
           centenas = a * 10 + b;
           
           if (c >= 50)
               centenas ++;
           
           System.out.println(centenas + "00");
    }
}