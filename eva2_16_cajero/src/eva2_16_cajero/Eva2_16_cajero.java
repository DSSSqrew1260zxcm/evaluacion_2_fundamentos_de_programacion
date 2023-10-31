package eva2_16_cajero;

import java.util.*;

public class Eva2_16_cajero {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int cuenta = 1000;
        int retiro = 0;
        while(cuenta >0){
            System.out.println("¿Cuánto quieres retirar?");
            retiro = input.nextInt();
            cuenta -=retiro;
            System.out.println("Tu saldo restante es: " +cuenta);
        }
    }

}
