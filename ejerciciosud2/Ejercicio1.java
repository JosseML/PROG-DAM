package ejerciciosud2;

public class Ejercicio1 {

    public static void main(String[] args) {
        // A)
        System.out.println((true && true) || false == true);
        
        // B)
        System.out.println((false || false) && false == true);
        
        // C)
        System.out.println((!(true && false)) == false);
        
        // D)
        int i = 1;
        int j = 0;
        int k = -1;
        
        System.out.println(i + k <= j - k * 3 && k >= 2);
        
        // E)
        i = 3;
        j = 2;
        k = -1;
                
        System.out.println(i == 3 || j <= 2 && k > 0);
        
        // F)
        i = 1;
        
        System.out.println(3 == 2 || 5 > i + i);
        
    }
}