package eva2_29_arreglos_mdim_2;

import java.util.*;

public class Eva2_29_arreglos_mdim_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] matriz = new int [3][];
        //podemos definir el tamaño de cada fila:
        matriz[0] = new int [10];
        matriz[1] = new int [5];
        matriz[2]=new int [3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 matriz[i][j] = (int)(Math.random() * 100);
            }
        }
         for (int i = 0; i < matriz.length; i++) { //filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.print("[" + matriz[i][j] + "]");
            }  
             System.out.println("");
        }
    }
    
}
