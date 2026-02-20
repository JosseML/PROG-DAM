package ejercicios;

public class Ejercicio04 {

    public static void main(String[] args) {
       
       char a = 'a';
       char z = 'z';
       
       byte n = 97;
       
       // a contiene el codigo de la letra 'a' que es 97.
       // Java, al ver que es una variable de tipo char,
       // recurre a la tabla ASCII e imprime el carácter
       // asociado a su código.
       System.out.println(a);
       System.out.println(z);
       
       System.out.println((byte)a);
       System.out.println((byte)z);
       
       System.out.println("Número de letras minúsculas: ");
       System.out.println((byte)z - (byte)a + 1);
    }
}