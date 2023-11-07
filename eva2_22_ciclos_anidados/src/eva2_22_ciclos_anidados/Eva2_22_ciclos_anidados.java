package eva2_22_ciclos_anidados;

import java.util.*;

public class Eva2_22_ciclos_anidados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num = input.nextInt();
        /*
        for (int i = 1; i >= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
         */

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }

}
