package ejercicios;

public class Ejercicio12 {

    private static int getNumeroDigitos(int n) {

        // Caso base
        if (n < 10)
            return 1;

        // Caso recursivo
        // En cada paso contabilizamos un dígito
        return 1 + getNumeroDigitos(n / 10);
    }

    public static void main(String[] args) {

        int n = 123456789;

        System.out.println(getNumeroDigitos(n));
    }
}
