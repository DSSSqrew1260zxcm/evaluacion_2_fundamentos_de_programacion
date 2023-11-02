package eva2_18_do_while;

import java.util.*;

public class Eva2_18_do_while {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do { // este bloque siempre se va a ejecutar al menos una vez
            System.out.println("Intenta adivinar el número: ");
            num = input.nextInt();
        } while (num != 100);
        System.out.println("Acertaste!!!!");
    }

}
