package ejercicios;

public class Ejercicio04 {

    public static void main(String[] args) {
       
       char a = 'a';
       char z = 'z';
       
       byte n = 97;
       
       // a contiene el codigo de la letra 'a' que es 97.
       // Java, al ver que es una variable de tipo char,
       // recurre a la tabla ASCII e imprime el car�cter
       // asociado a su c�digo.
       System.out.println(a);
       System.out.println(z);
       
       System.out.println((byte)a);
       System.out.println((byte)z);
       
       System.out.println("N�mero de letras min�sculas: ");
       System.out.println((byte)z - (byte)a + 1);
    }
}