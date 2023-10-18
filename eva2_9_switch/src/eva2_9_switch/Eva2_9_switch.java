package eva2_9_switch;

import java.util.*;
public class Eva2_9_switch {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes;
        System.out.println("Ingrese el número de mes: ");
        mes = input.nextInt();
        switch(mes){
            case 1:
                System.out.println("El mes número " + mes + " es ENERO");
            break;
            case 2:
                System.out.println("El mes número " + mes + " es FEBRERO");
            break;
            case 3:
                System.out.println("El mes número " + mes + " es MARZO");
            break;
            case 4:
                System.out.println("El mes número " + mes + " es ABRIL");
            break;
            case 5:
                System.out.println("El mes número " + mes + " es MAYO");
            break;
            case 6:
                System.out.println("El mes número " + mes + " es JUNIO");
            break;
            case 7:
                System.out.println("El mes número " + mes + " es JULIO");
            break;
            case 8:
                System.out.println("El mes número " + mes + " es AGOSTO");
            break;
            case 9:
                System.out.println("El mes número " + mes + " es SEPTIEMBRE");
            break;
            case 10:
                System.out.println("El mes número " + mes + " es OCTUBRE");
            break;
            case 11:
                System.out.println("El mes número " + mes + " es NOVIEMBRE");
            break;
            case 12:
                System.out.println("El mes número " + mes + " es DICIEMBRE");
            break;
            default: //siempre es la última instrucción (pero es opcional)
                System.out.println("El número ingresado NO es un mes válido");
        }
    }
    
}
