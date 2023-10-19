package eva2_10_calificaciones;
import java.util.*;
public class Eva2_10_calificaciones {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int cali;
        System.out.println("Ingrese su calificación: ");
        cali = input.nextInt();
        if ((cali >=90) && (cali<=100)) {
                System.out.println("Su calificación es: A");
            } else if ((cali>= 80)&&(cali<=89)) {
                System.out.println("Su calificación es: B");
            } else if ((cali>=70)&&(cali<=79)) {
                System.out.println("Su calificación es: C");
            } else if ((cali>=60)&&(cali<=69)) {
                System.out.println("Su calificación es: D");
            } else if ((cali >=0 )&&(cali <=59)) {
                System.out.println("Su calificación es: F");
            }else{
            System.out.println("El número ingresado NO es una calificación válida");
            }
    }
    
}
