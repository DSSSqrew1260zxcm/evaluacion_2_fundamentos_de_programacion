
package eva2_4_año_bisisesto;
import java.util.*;
public class Eva2_4_año_bisisesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, residuo;
        System.out.println("Ingresa el año: ");
        year = input.nextInt();
        // Verificar si es divisible entre 4
        residuo = year % 4;
        if (residuo == 0){ // divisible entre 4, no es garantia de que sea año bisiesto
            // verificar si es divisible entre 100
            residuo = year%100;
            if(residuo == 0){ //Si no es divisible entre 100, es bisiesto
                //Verificar si es divisible entre 400
                residuo = year%400;
                if(residuo == 0){ //si es divisible entre 400, es bisiesto
                    System.out.println("El año SI es bisiesto");
                }else{
                    System.out.println("El año ya NO es bisiesto");
                }
            }else{
                System.out.println("El año SI es bisiesto");
            }
        }else{
            System.out.println("El año ya NO es bisiesto");
        }
    }
    
}