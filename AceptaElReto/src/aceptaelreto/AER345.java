package aceptaelreto;

import java.util.Scanner;

public class AER345 {

    static boolean estanTodos(boolean[] v) {
        for (int i = 1; i <= 9; i++) 
            if(!v[i])
                return false;
        return true;
    }
    
    static boolean cuadradoCorrecto(byte[][]m, byte f, byte c) {
        boolean[] esta = new boolean[10];
        
        for (int fila = f; fila < f + 3; fila++) 
            for (int col = c; col < c + 3; col++) 
                esta[m[fila][col]] = true;
        
        return estanTodos(esta);
    }
    
    static boolean cuadradosCorrectos(byte[][] m) {
        for (byte f = 0; f < 9; f += 3) 
            for (byte c = 0; c < 9; c += 3) 
                if (!cuadradoCorrecto(m, f, c))
                    return false;
        return true;
    }
    
    static boolean filaCorrecta(byte[] f) {
        boolean[] esta = new boolean[10];
        for (int i = 0; i < 9; i++) 
            esta[f[i]] = true;
        
        return estanTodos(esta);
    }

    static boolean filasCorrectas(byte[][] m) {
        for (int f = 0; f < 9; f++) 
            if (!filaCorrecta(m[f]))
                return false;
        return true;
    }

    static boolean columnaCorrecta(byte[][] m, byte c) {
        boolean[] esta = new boolean[10];
        for (int f = 0; f < 9; f++) 
            esta[m[f][c]] = true;
        
        return estanTodos(esta);
    }

    static boolean columnasCorrectas(byte[][] m) {
        for (byte c = 0; c < 9; c++) 
            if (!columnaCorrecta(m, c))
                return false;
        return true;
    }
    
    static boolean esCorrecto(byte[][] m) {
        return  filasCorrectas(m) &&
                columnasCorrectas(m) &&
                cuadradosCorrectos(m);
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int casos = in.nextInt();
        byte[][] m = new byte[9][9];
        
        while (casos-- > 0){
            for (int f = 0; f < 9; f++) 
                for (int c = 0; c < 9; c++)
                    m[f][c] = in.nextByte();
                 
            System.out.println(esCorrecto(m)? "SI" : "NO");
        }
    }
}