package ejercicios;

public class Ejercicio32 {

    public static void main(String[] args) {
     
        double fahrenheit;
        double celsius;
       
       // A) 86 Grados Fahrenheit
       fahrenheit = 86;
       celsius = (fahrenheit - 32) / 9 * 5;
        System.out.println(celsius + " Celsius");
       
       // B) 33 Grados Celsius
       celsius = 33;
       fahrenheit = celsius * 9 / 5 + 32;
       /*
            fahrenheit = celsius * ((double)9 / 5 + 32;
            En esta última expresión se convierte el 9 a double porque, en caso contrario, se hace la división entera 9/5 que da 1 como resultado.
            Al hacer el cast, se logra hacer una división de double.
       */
        System.out.println(fahrenheit + " Fahrenheit");
    }
}