package ejercicio5;

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, r = 1;

        System.out.println("Introduzca un número base: ");
        num1 = input.nextInt();
        System.out.println("Introduzca un número exponente: ");
        num2 = input.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Los números NO son positivos");

        }
        for (int i = 0; i < num2; i++) {
            r *= num1;
        }

        System.out.println("La potencia de " + num1 + " elevada a la " + num2 + " es: " + r);

    }

}
