package eva2_27_busqueda_arreglos;

import java.util.*;

public class Eva2_27_busqueda_arreglos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        /* 
        Crear un arreglo de 15 elementos
        llenarlo con valores aleatorios
         */
        int[] arreglo = new int[15];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        System.out.println("Qué número buscas?");
        num = input.nextInt();
        boolean ver = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num) { //valor encontrado
                System.out.println("Valor encontrado en la posición: " + (i + 1));
                ver = true;
                break;
            }
        }
        if (!ver) {
            System.out.println("valor no encontrado");
        }
    }
}
