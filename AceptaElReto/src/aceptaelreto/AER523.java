package aceptaelreto;

import java.util.Scanner;

public class AER523 {

    private static final Scanner in = new Scanner(System.in);

    private static void resuelveCaso() {

        String matricula;
        int masAntiguos = 0;
        int masModernos = 0;
        int comparacion;

        // Matrícula de Edu
        int eduNumero;
        String eduLetras;

        // Leer matrícula de Edu
        matricula = in.next();
        eduNumero = Integer.parseInt(matricula.substring(0, 4));
        eduLetras = matricula.substring(4);

        // Leer matrículas de los otros coches
        while (!(matricula = in.next()).equals("0")) {
            
            int otroNumero = Integer.parseInt(matricula.substring(0, 4));
            String otroLetras = matricula.substring(4);

            comparacion = eduLetras.compareTo(otroLetras);

            if (comparacion > 0)
                masAntiguos++;
            else if (comparacion < 0)
                masModernos++;
            else if (eduNumero < otroNumero)
                masModernos++;
            else
                masAntiguos++;
        }

        System.out.println(masAntiguos + " " + masModernos);
    }

    public static void main(String[] args) {
        int casos = in.nextInt();
        while (casos-- > 0)
            resuelveCaso();
    }
}
