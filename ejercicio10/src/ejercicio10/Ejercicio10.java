package ejercicio10;

import java.util.*;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cadena;
        
        System.out.println("Ingrese una cadena: ");
        cadena = input.nextLine();
        
        if (isNumeric(cadena)) {
            System.out.println("Es válido.");
        } else {
            System.out.println("NO es válido");
        }
    }
    
    public static boolean isNumeric(String a) {
        boolean i;

        try {
            Integer.parseInt(a);
            i = true;
        } catch (NumberFormatException excepcion) {
            i = false;
        }

        return i;
    }
}
