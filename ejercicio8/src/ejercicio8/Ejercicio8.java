package ejercicio8;

import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char letra;

        do {
            System.out.println("Introduce un carácter (ESPACIO para terminar el programa): ");
            letra = input.nextLine().charAt(0);
            if (letra != ' ') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            }
        } while (letra != ' ');

        System.out.println("Programa FINALIZADO.");
    }
    }
    
}
