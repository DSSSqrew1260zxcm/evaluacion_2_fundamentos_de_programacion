package eva2_30_cubo;

import java.util.*;

public class Eva2_30_cubo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cubo [][][] = new int [3][4][5];
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] =(int)(Math.random()*100);
                    System.out.print("[" + cubo[i][j][k] + "]");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
}
