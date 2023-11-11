package ejercicio9;

import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String le;
        String le1;
        char[] astring;
        int cont = 0;
        
        System.out.println("Ingrese una cadena de texto: ");
        le = input.nextLine();
        System.out.println("Ingrese el caracter a buscar: ");
        le1 = input.nextLine();
        
        astring = le.toCharArray();
        
        for (int i = 0; i < astring.length; i++) {
            if (astring[i] == le1.charAt(0)) {
                cont += 1;
            }
        }
        
        System.out.println("El carácter '"+le1+"' aparece "+cont+" número de veces en la TARJETA.");
    }
}
