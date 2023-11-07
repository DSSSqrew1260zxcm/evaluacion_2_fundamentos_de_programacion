package eva2_20_continue;

import java.util.*;

public class Eva2_20_continue {

    public static void main(String[] args) {
        //break--> termina el ciclo
        for (int i = 1; i <= 15; i++) {
            if (i == 10) {
                break;
            }
            System.out.print(i + " - ");

        }
        System.out.println("");
        //continue --> termina la interación  actual
        for (int i = 1; i <= 15; i++) {
            if (i == 10) {
                continue;
            }
            System.out.print(i + " - ");

        }
    }

}
