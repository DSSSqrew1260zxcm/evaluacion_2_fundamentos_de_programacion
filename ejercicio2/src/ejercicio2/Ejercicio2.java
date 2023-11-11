package ejercicio2;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingresa el primer número:");
        num1 = input.nextInt();
        System.out.println("Ingresa el segundo número:");
        num2 = input.nextInt();
        System.out.println("");
        if ((num1 < 0) || (num2<0)) {
            System.out.println("Los números NO son positivos.");
            return;
        }
        if(num1 < num2){
            for (int i = num1+1; i < num2; i++) {
                if((i%2) != 0){
                   continue;
                }    
                System.out.print(i + " - ");
            }
        }else{
            for (int i = num2+1; i < num1; i++) {
                if((i%2) != 0){
                   continue;
                }    
                System.out.print(i + " - ");
            }
        }
    }
}
