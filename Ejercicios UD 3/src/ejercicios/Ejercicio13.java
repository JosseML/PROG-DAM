package ejercicios;

public class Ejercicio13 {

    private static double potenciaInterno(double base, int exponente) {

        if (exponente == 1)
            return base;

        return base * potencia(base, exponente - 1);
    }

    private static double potencia(double base, int exponente) {

        if (exponente == 0)
            return 1;

        if (exponente < 0)
            return 1 / potenciaInterno(base, -exponente);
        return potenciaInterno(base, exponente);
    }

    public static void main(String[] args) {

        System.out.println(potencia(7, 9));
    }
}
