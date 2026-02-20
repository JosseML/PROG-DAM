package ejercicios;

public class Ejercicio33 {

    public static void main(String[] args) {
        
        /*
            Nota final:
                - 55% de la media de sus tres evaluaciones
                - 30% examen final
                - 15% trabajo final
        */
        double eval1, eval2, eval3;
        double media;
        double examenFinal;
        double trabajoFinal;
        double notaFinal;
        
        eval1 = 9;
        eval2 = 7.5;
        eval3 = 4.8;
        media = (eval1 + eval2 + eval3) / 3;
        /*
            Si los valores fuesen enteros, habría que hacer un cast.
            media = (eval1 + eval2 + eval3) / 3;
        */
       examenFinal = 6;
       trabajoFinal = 7.5;
       
       notaFinal = media * 0.55 + examenFinal * 0.3 + trabajoFinal * 0.15;
       
        System.out.println("Nota final: " + notaFinal);
       
    }
}