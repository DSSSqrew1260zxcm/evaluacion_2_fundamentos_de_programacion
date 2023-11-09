package eva2_25_arreglos;

import java.util.*;

public class Eva2_25_arreglos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cali;
        int[] arregloCali;
        System.out.println("Introduce el número de calificaciones a capturar: ");
        cali = input.nextInt();
        arregloCali = new int[cali];
        for (int i = 0; i < cali; i++) {
            System.out.println("Introduce la calificación: ");
            arregloCali[i] = input.nextInt();
        }
        for (int i = 0; i < cali; i++) {
            System.out.print(arregloCali[i] + " - ");
        }
    }

}
