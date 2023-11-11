package ejercicio7;

import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int may = 0, men = 1002030070;
        while (true) { 
            int num;
            System.out.println("Introduce un número positivo (para terminar el programa ingresa un número negativo.).");
            num = input.nextInt();
            if (num < 0) {
                break;
            }
            if (num > may) {
                may = num;
            }
            if (num < men) {
                men = num;
            } 
        }
        System.out.println("El número más grande es: " +may);
        System.out.println("El número más pequeño es: " +men);
    }
    
}
