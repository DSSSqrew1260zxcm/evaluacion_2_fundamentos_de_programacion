package eva2_7_leap_year;
import java.util.*;
public class Eva2_7_leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, res4, res100, res400;
        System.out.println("Ingresa el año: ");
        year = input.nextInt();
        res4 = year % 4; // residuo de dividir el año entre 4
        res100 = year % 100; // residuo de dividir el año entre 100
        res400 = year % 400; // residuo de dividir el año entre 400
        
        if((res4 == 0) && ((res100 != 0) || (res400 == 0))){
            System.out.println("El año " + year+ " es bisiesto");
        }else{
            System.out.println("El año " + year+ " No es bisiesto");
        }
    }
    
}