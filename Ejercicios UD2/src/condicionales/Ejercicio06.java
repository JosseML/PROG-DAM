package condicionales;

public class Ejercicio06 {

    public static void main(String[] args) {
        
        int salario = 1110;
        int hijos = 5;
        int porcentaje;

        if (hijos >= 10)
            porcentaje = 0;
        else if (hijos >= 8)
            porcentaje = 5;
        else if (hijos >= 6)
            porcentaje = 10;
        else if (hijos >= 3)
            porcentaje = 15;
        else
            porcentaje = 20;

        double salarioNeto = salario - (salario * porcentaje / 100.0);
        System.out.println("El salario neto es de " + salarioNeto + " €");
    }
}