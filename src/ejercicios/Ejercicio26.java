package ejercicios;

public class Ejercicio26 {

    public static void main(String[] args) {
        
        double pies = 1;
        double pulgadas;
        double yardas;
        double centimetros;
        double metros;
        
        // C�lculo de pulgadas. (1 pie = 12 pulgadas)
        pulgadas = pies * 12;
        
        // C�lculo de yardas. ( 1 yarda = 3 pies)
        yardas = pies / 3;
        
        // C�lculo de centimetros. (1 pulgada = 2,54 centimetros)        
        centimetros = pulgadas * 2.54;
        
        // C�lculo de metros. (1 metro = 100 centimetros)
        metros = centimetros / 100;
        
        System.out.println(pies + " pies equilaven a:");     
        System.out.println("\tPulgadas: " + pulgadas);
        System.out.println("\tYardas: " + yardas);
        System.out.println("\tCent�metros: " + centimetros);
        System.out.println("\tMetros: " + metros);
    }
}