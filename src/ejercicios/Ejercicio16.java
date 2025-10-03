package ejercicios;

public class Ejercicio16 {

    public static void main(String[] args) {
     
        int contador = 8; // [0, 10]
        
         contador = ++contador % 10;
         System.out.println(contador);
    }
}