
package eva2_3_modulo;
import java.util.*;
public class eva2_3_modulo {

    public static void main(String[] args) {
     int num, residuo;
     Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el número:");
     num = input.nextInt();
     residuo = num % 2; // % modulo ---> residuo
     if(residuo == 0){
        System.out.println("El número es par");        
     }else{
         System.out.println("El número es impar");
     }
    }
    
}
