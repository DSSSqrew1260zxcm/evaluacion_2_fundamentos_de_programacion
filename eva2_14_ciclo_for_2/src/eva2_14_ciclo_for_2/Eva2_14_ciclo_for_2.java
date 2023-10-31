package eva2_14_ciclo_for_2;
import java.util.*;
public class Eva2_14_ciclo_for_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //vamos a capturar califcaciones de un rupo y generar el promedio
        int no_cali;
        int sumaCali = 0; //0 es el neutro aditivo, 1 es el neutro multiplicativo 
        System.out.println("Introduce el número de calificaciones:");
        no_cali = input.nextInt();
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 1; i <= no_cali; i++) {
            int cali;
            System.out.println("Introduce la calificación:");
            cali = input.nextInt();
            //sumatoria de calificaciones:
            //ACUMULADORES
            //sumacali = samacali + cali;
            sumaCali += cali;
        }
        /*
            el promedio es sumaCali / no_cali, pero ambos son enteros y dividir
            enteros en JAVA da como resultado un entro, SIN decimales 
        */
        double promedio = sumaCali / (no_cali*1.0);
        System.out.println("El promedio es: " + promedio);
    }
    
}
