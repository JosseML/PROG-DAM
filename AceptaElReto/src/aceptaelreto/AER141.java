package aceptaelreto;

import java.util.Scanner;

public class AER141 {
    
    static boolean estaEquilibrada(String expresion) {
        
        char[] pila = new char[expresion.length()];
        int cima = -1;
        char lectura;
        char apertura;
        
        for (int i = 0; i < expresion.length(); i++) {
            lectura = expresion.charAt(i);
            
            if (lectura == '(' || lectura == '{' || lectura == '[')
                pila[++cima] = lectura;
            else if (lectura == ')' || lectura == '}' || lectura == ']') {
                    if (cima == -1)
                        return false;

                    apertura = pila[cima--];
                    if (lectura == ')' && apertura != '(' ||
                        lectura == '}' && apertura != '{' ||
                        lectura == ']' && apertura != '[')
                        return false;
            }
        }
        
        return cima == -1;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        while (in.hasNext())
            System.out.println(estaEquilibrada(in.nextLine())? "YES" : "NO");
    }
}