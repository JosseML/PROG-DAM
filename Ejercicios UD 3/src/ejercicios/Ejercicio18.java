package ejercicios;

public class Ejercicio18 {

    private static boolean esPalindromo(String cadena) {
        
        int i = 0; // Índice por la izquierda
        int j = cadena.length() - 1; // Índice por la derecha
        
        while (i < j) {
            if (cadena.charAt(i++) != cadena.charAt(j--))
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        String cadena = "reconocer";
        
        if (esPalindromo(cadena))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }
}