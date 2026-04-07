package aceptaelreto;

import java.util.Scanner;

public class AER479 {

    private static int getDistancia(char[][] mapa, int f, int c, String direccion) {

        int vf = 0;
        int vc = 0;
        int nf = f;
        int nc = c;
        int pasos = 0;
        
        boolean estoyDentro = true;

        if (direccion.equals("ARRIBA"))
            vf = -1;
        else if (direccion.equals("ABAJO"))
            vf = 1;
        else if (direccion.equals("IZQUIERDA")) 
            vc = -1;
        else
            vc = 1;

        while ((estoyDentro = nf >= 0 && nf < mapa.length && nc >= 0 && nc < mapa[0].length) && mapa[nf][nc] == '.') {

            nf += vf;
            nc += vc;
            pasos++;
        }

        if (!estoyDentro)
            return -1;
        else
            return pasos;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int distancia;
        int filas;
        int numConsultas;
        char[][] mapa;
        String direccion;
        
        int f, c;
        
        while ((filas = in.nextInt()) != 0) {

            in.nextInt();
            in.nextLine();

            mapa = new char[filas][];

            for (int fila = 0; fila < filas; fila++)
                mapa[fila] = in.nextLine().toCharArray();

            numConsultas = in.nextInt();

            for (int i = 0; i < numConsultas; i++) {
                f = in.nextInt() - 1;
                c = in.nextInt() - 1;
                direccion = in.nextLine().substring(1);

                distancia = getDistancia(mapa, f, c, direccion);

                System.out.println(distancia != -1 ? distancia : "NINGUNO");
            }

            System.out.println("---");
        }
    }
}