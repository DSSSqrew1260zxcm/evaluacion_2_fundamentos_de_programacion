package eva2_12_carreras;
import java.util.*;
public class Eva2_12_carreras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carrera;
        System.out.println("Ingrese la carrera:");
        carrera = input.nextLine();
        switch(carrera){
            case "ISC":
                System.out.println("La carrera es: INGENIERIA EN SISTEMAS COMPUTACIONALES");
            break;
            case "INF":
                System.out.println("La carrera es: INGENIERIA INFORMATICA");
            break;
            case "IND":
                System.out.println("La carrera es: INGENIERIA INDUSTRIAL");
            break;
            case "IDI":
                System.out.println("La carrera es: INGENIERIA EN DISEÑO INDUSTRIAL");
            break;
            case "LA":
                System.out.println("La carrera es: LICENCIATURA EN ADMINISTRACIÓN");
            break;
            case "IGE":
                System.out.println("La carrera es: INGENIERIA EN GESTIÓN EMPRESARIAL");
            break;
            case "ARQ":
                System.out.println("La carrera es: ARQUITECTURA");
            break;
            default:
                System.out.println("La carrera NO existe");
        }
        
    }
    
}
