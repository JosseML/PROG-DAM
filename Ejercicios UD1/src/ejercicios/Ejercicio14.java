package ejercicios;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        final int SEGS = 186_455;
        final int SEGUNDOS_DIA = 86_400;
        final int SEGUNDOS_HORA = 3_600;
        final int SEGUNDOS_MINUTO = 60;
        
        int dias;
        int horas;
        int minutos;
        int segundos;
        int remanente;
        
        System.out.println(SEGS + " segundos corresponden a:");
        
        dias = SEGS / SEGUNDOS_DIA;
        System.out.println(dias + " días.");
        
        remanente = SEGS % SEGUNDOS_DIA;
        horas = remanente / SEGUNDOS_HORA;
        System.out.println(horas + " horas.");
        
        remanente %= SEGUNDOS_HORA;
        minutos = remanente / SEGUNDOS_MINUTO;
        System.out.println(minutos + " minutos.");
        
        segundos = remanente % SEGUNDOS_MINUTO;
        System.out.println(segundos + " segundos.");
    }
}