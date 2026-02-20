package ejercicios;

public class Ejercicio05 {

    public static void main(String[] args) {

        final int MAX = 1_000_000;
        
        int[] contadores = new int[7];

        for (int i = 0; i < MAX; i++) {
            contadores[(int) ((Math.random() * 6) + 1)]++;
        }

        // Número de veces que salió cada número
        for (int i = 1; i < 7; i++) {

            System.out.println(i + ":" + contadores[i]);
        }

        for (int i = 1; i < 7; i++) {
            System.out.println(i + ": " + contadores[i] * 100D / MAX + "/");
        }
    }
}