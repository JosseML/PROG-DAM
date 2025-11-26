package ejercicios;

public class Ejercicio15 {

    public static void main(String[] args) {
     
        int n = 4321;
        
        int millares;
        int centenas;
        int decenas;
        int unidades;
        
        millares = n / 1_000;
        centenas = (n % 1000) / 100;
        decenas = (n % 100) / 10;
        unidades = n % 10;
        
        System.out.println(millares + " millares");
        System.out.println(centenas + " centenas");
        System.out.println(decenas + " decenas");
        System.out.println(unidades + " unidades");
    }
}