
package eva2_2_if_anidado;
import java.util.*;
public class EVA2_2_IF_ANIDADO {

    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        num1 = input.nextInt();
        System.out.println("Ingresa el segundo número:");
        num2 = input.nextInt();
        
        // > operadores
        if(num1 > num2){ // verdad                 //concatenar
            System.out.println("El número más grande es el " +num1);  
        }else{ // falso, el num1 NO es más grande que el valor 1
            // if anidado: un if dentro de otro if
            //En JAVA:
            // = Es asignación
            // == Es comparación
            if(num1 == num2){ // verdad
                System.out.println(num1+ " es igual a " +num2);
            }else{
                System.out.println("El número más pequeño es " +num1);
            }
        }
    }
    
}
