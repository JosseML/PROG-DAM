package condicionales;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        int n1 = 5;
        int n2 = 8;
        int n3 = 10;
        int n4 = 15;
        int menor;
        
        menor = Math.min(Math.min(n1, n2), Math.min(n3, n4));
        System.out.println(menor);
    }
}