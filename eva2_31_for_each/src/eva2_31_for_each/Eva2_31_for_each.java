package eva2_31_for_each;

import java.util.*;

public class Eva2_31_for_each {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arreglo = new int [10];
        for (int i = 0; i < 10; i++) {
            arreglo [i] = (int)(Math.random() * 100);
        }
        /*
        FOR EACH  ---> For especial para arreglos
        solo funciona para lectura de arreglos
        */
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }
        System.out.println("");
        String cadenas[] = new String[5];
        cadenas [0] = "Hola";
        cadenas [1] = ", ";
        cadenas [2] = "soy ";
        cadenas [3] = "Dayana";
        cadenas [4] = "!!!!";
        
        for (String cad : cadenas) {
            System.out.print(cad);
        }
    }
    
}
