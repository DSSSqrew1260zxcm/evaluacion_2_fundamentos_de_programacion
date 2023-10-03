
package eva2_2_if;
import java.util.*;
public class Eva2_2_if {


    public static void main(String[] args) {
        int cali;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la calificación: ");
        cali = input.nextInt();
        
        if (cali >= 70){ //if (expresión a evaluar) //este se ejecuta si es verdadero
            System.out.println("Aprobaste!!");
        }else{ //este se ejecuta si es falso
            System.out.println("No aprobaste:(");
        }
    }
    
}
