package ejercicio6;

import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String binario = "";
        System.out.println("Ingresa el número para combertir a binario: ");
        num = input.nextInt();
        if (num > 0) {
            System.out.println("Los números NO son positivos");
        }
        while (num >=1) {            
            binario = num % 2 + binario;
            num /= 2;
        }
        System.out.println("El número en sistema binario es: " +binario);
    }
    
}
