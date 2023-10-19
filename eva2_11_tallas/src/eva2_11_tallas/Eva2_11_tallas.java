package eva2_11_tallas;
import java.util.*;
public class Eva2_11_tallas {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int talla;
        System.out.println("Ingrese la talla a buscar:");
        talla = input.nextInt();
        switch(talla){
            case 29:
                System.out.println("La talla es SMALL (CHICA)");
            break;
            case 42:
                System.out.println("La talla es MEDIUM (MEDIANA)");
            break;
            case 44:
                  System.out.println("La talla es LARGE (GRANDE)");
            break;
            case 48:
                  System.out.println("La talla es XLARGE (EXTRA GRANDE)");
            break;
            default:
                System.out.println("El valor de la talla es desconocido");
        }
        
    }
    
}
