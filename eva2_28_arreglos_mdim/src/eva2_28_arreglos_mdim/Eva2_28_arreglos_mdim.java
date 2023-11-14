package eva2_28_arreglos_mdim;

import java.util.*;

public class Eva2_28_arreglos_mdim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //arreglo de dos dimensiones: matriz
                                            //filas, columnas
        int [][] matriz = new int [5][10];
        //asignar valor;
        matriz [1][3] = 100;
        System.out.println("Valor en [1][3] = " + matriz [1][3]);
        System.out.println("matriz.length = " +matriz.length);
        
        //matriz.length siempre es la primera dimensión
        for (int i = 0; i < matriz.length; i++) { //filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                matriz[i][j] = (int)(Math.random() * 100);
            }  
        }
        //leer nuestro arreglo
         for (int i = 0; i < matriz.length; i++) { //filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.print("[" + matriz[i][j] + "]");
            }  
             System.out.println("");
        }
    }
    
}
