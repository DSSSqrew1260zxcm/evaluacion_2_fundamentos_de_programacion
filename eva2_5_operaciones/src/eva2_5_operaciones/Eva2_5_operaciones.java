package eva2_5_operaciones;

import java.util.*;

public class Eva2_5_operaciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;
        num1 = 50;
        num2 = 100;
        //Suma 
        // operador + 
        // Concatenar  --> Unir cadenas de texto
        resultado = num1 + num2;
        System.out.println("Suma:");
        System.out.println("Número 1 =  " + num1);
        System.out.println("Número 2 =  " + num2);
        System.out.println("Numéro 1 + Número 2 = " + resultado);
        //resta
        //operador -
        resultado = num1 - num2;
        System.out.println(""); // salto de linea (enter)
        System.out.println("Resta:");
        System.out.println("Número 1 =  " + num1);
        System.out.println("Número 2 =  " + num2);
        System.out.println("Numéro 1 - Número 2 = " + resultado);
        //multiplicación
        // operador *
        resultado = num1 * num2;
        System.out.println("");
        System.out.println("Multiplicación:");
        System.out.println("Número 1 =  " + num1);
        System.out.println("Número 2 =  " + num2);
        System.out.println("Numéro 1 X Número 2 = " + resultado);
        //división
        //operador /
        /*
        OJO: El tipo de dato es importante, si quieren 
        el resultado de una división, hay que manejarlo flotante
        si lo manejan entero, les dará el # de veces que cabe el 
        divisor en el dividendo (de forma entera)
         */
        num1 = 30;
        num2 = 14;
        resultado = num1 / num2;
        System.out.println("");
        System.out.println("División:");
        System.out.println("Número 1 =  " + num1);
        System.out.println("Número 2 =  " + num2);
        System.out.println("Numéro 1 / Número 2 = " + resultado);
        // División flotante
        double resultadoExa;
        resultadoExa = num1 / num2;
        System.out.println("");
        System.out.println("División exacta:");
        System.out.println("Número 1 =  " + num1);
        System.out.println("Número 2 =  " + num2);
        System.out.println("Numéro 1 / Número 2 = " + resultadoExa);
        
        double num2F;
        num2F = 14;
        resultadoExa = num1 / num2F;
        System.out.println("");
        System.out.println("División exacta (¿SERÁ?):");
        System.out.println("Número 1 =  " + num1);
        System.out.println("Número 2 =  " + num2F);
        System.out.println("Numéro 1 / Número 2 = " + resultadoExa);
        
        int cifra = 7;
        double cifraDouble = 7.0;
        
        double division = 100/10.0; 
        /*
        Se toma el divisor como entero 
        double division = 100/10.0; se toma el divisor como flotante
        */
       
          //precedencia de operaciones:
        System.out.println("");
        System.out.println("Precedencia de operaciones:");
        int a=5, b=3, c=2;
        int resultado1 = (a*b) + (a-c) *(b-a); 
        // (15) + (3) * (-2)
        //15 - 6
        System.out.println("El resultado de la procedencia es: " +resultado1);
        
        //potencias y raices
        System.out.println("");
        System.out.println("Potencia:");
        double potencia;
        potencia = Math.pow(100,0.5);
        System.out.println("La potencia es: " +potencia);
    }
}
