package eva2_26_uso_arreglos;

import java.util.*;

public class Eva2_26_uso_arreglos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opci, orde;
       String [] platillos = new String[10];
       platillos[0] = "Tacos";
       platillos[1] = "Tortas de lomo";
       platillos[2] = "Hamburgesas";
       platillos[3] = "Burritos";
       platillos[4] = "Pizzas";
       platillos[5] = "Tripitas";
       platillos[6] = "Papa asada";
       platillos[7] = "Carnitas";
       platillos[8] = "Nuggets";
       platillos[9] = "Pollo asado";
       double [] precio = {70, 65, 80, 35, 45, 95, 60, 100, 40, 150};
        System.out.println("--------------------> MENÚ <--------------------");
        for (int i = 0; i < platillos.length; i++) {
            System.out.println(i + " - " + platillos[i] + ": $ " + precio[i]);
        }
        System.out.println("");
        System.out.println("¿Qué desea ordenar?");
        opci = input.nextInt();
        System.out.println("¿Cuántas ordenes desea?");
        orde = input.nextInt();
        System.out.println("El total de la cuenta es de : $" + (orde * precio[opci]));
    }
    
}
