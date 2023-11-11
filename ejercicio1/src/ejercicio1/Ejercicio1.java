package ejercicio1;

import java.util.*;

public class Ejercicio1 {

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
        if(num1 <= num2){
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }else{
            for (int i = num2; i <= num1; i++) {
                System.out.println(i);
            }
        }
    }
}
