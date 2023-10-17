package eva2_6_and_or_operadores;
import java.util.*;
public class Eva2_6_and_or_operadores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cali;
        System.out.println("Introduce la calificación: ");
        cali = input.nextInt();
        
        /* Validar 
        una califcación es mayor o igual a cero   --> cali >= 0
        Y --> &&
        la calificación es menor o igual a 100    --> cali <=100
        */
        if((cali >= 0) && (cali <= 100)){ // valor valido
            System.out.println("La calificación " + cali + " es válida! :)");
            if(cali >= 70){
                System.out.println("Aprobado");
            }else{
                System.out.println("NO acreditado");
            }
        }else{
            System.out.println("La calificación " + cali + " NO es válida ):");
        }
    }    
}
