package ejercicios;

public class Ejercicio26 {

    public static void main(String[] args) {
        
        double pies = 1;
        double pulgadas;
        double yardas;
        double centimetros;
        double metros;
        
        // Cálculo de pulgadas. (1 pie = 12 pulgadas)
        pulgadas = pies * 12;
        
        // Cálculo de yardas. ( 1 yarda = 3 pies)
        yardas = pies / 3;
        
        // Cálculo de centimetros. (1 pulgada = 2,54 centimetros)        
        centimetros = pulgadas * 2.54;
        
        // Cálculo de metros. (1 metro = 100 centimetros)
        metros = centimetros / 100;
        
        System.out.println(pies + " pies equilaven a:");     
        System.out.println("\tPulgadas: " + pulgadas);
        System.out.println("\tYardas: " + yardas);
        System.out.println("\tCentímetros: " + centimetros);
        System.out.println("\tMetros: " + metros);
    }
}