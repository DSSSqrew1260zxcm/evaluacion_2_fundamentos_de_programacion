package eva2_13_ciclos_for;

import java.util.*;
public class Eva2_13_ciclos_for {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //for ----> desde
        //punto de inicio, condición para continuar , avence a retroceso
        //mientras la condición es verdad el for se ejecuto
        //cuando es falso termina
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("");
        //imprimir los números pares de 0 a 100, incluyendo a 0 y 100
        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i + " - ");
        }
    }
    
}
