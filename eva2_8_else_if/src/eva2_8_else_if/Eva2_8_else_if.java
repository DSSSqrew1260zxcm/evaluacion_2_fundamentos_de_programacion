package eva2_8_else_if;

import java.util.*;

public class Eva2_8_else_if {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //captura el mes en formato númerico (entero)
        int mes;
        System.out.println("Ingrese el número de mes: ");
        mes = input.nextInt();
        //if ((mes >= 1) && (mes <= 12)) { //if ((mes > 0) && (mes > 13))
            if (mes == 1) {
                System.out.println("El mes número " + mes + " es ENERO");
            } else if (mes == 2) {
                System.out.println("El mes número " + mes + " es FEBRERO");
            } else if (mes == 3) {
                System.out.println("El mes número " + mes + " es MARZO");
            } else if (mes == 4) {
                System.out.println("El mes número " + mes + " es ABRIL");
            } else if (mes == 5) {
                System.out.println("El mes número " + mes + " es MAYO");
            } else if (mes == 6) {
                System.out.println("El mes número " + mes + " es JUNIO");
            } else if (mes == 7) {
                System.out.println("El mes número " + mes + " es JULIO");
            } else if (mes == 8) {
                System.out.println("El mes número " + mes + " es AGOSTO");
            } else if (mes == 9) {
                System.out.println("El mes número " + mes + " es SEPTIEMBRE");
            } else if (mes == 10) {
                System.out.println("El mes número " + mes + " es OCTUBRE");
            } else if (mes == 11) {
                System.out.println("El mes número " + mes + " es NOVIEMBRE");
            } else if (mes == 12) {
                System.out.println("El mes número " + mes + " es DICIEMBRE");
            }else{
            System.out.println("El número ingresado NO es un mes válido");
            }
     //}
    }
}
