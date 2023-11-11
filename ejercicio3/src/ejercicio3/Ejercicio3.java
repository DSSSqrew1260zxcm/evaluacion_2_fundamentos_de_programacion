package ejercicio3;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sumatoria = 0;
        System.out.println("Ingrese un número:");
        num = input.nextInt();
        System.out.println("");
        for (int i = 1; i <= num; i++) {
            sumatoria += i;
        } 
        System.out.println("La sumatoria de los números es: " +sumatoria);
    }

}
