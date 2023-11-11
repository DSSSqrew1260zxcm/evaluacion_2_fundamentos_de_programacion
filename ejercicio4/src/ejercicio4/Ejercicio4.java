package ejercicio4;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String ter = "";
        while (!ter.equals("si")){  
            System.out.println("Introduce un número: ");
            num = input.nextInt();
            if (num > 0) {
                System.out.println("El número es positivo.");
            } else if (num < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
            System.out.println("");
            System.out.println("¿Deseas terminar el programa?");
            ter = input.next(); 
            System.out.println("");
        }
    }
}
