package eva2_17_while_infinito;

import java.util.*;

public class Eva2_17_while_infinito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor = 100;
        while(true){
            System.out.println("Introduce el número que piensas que es el correcto: ");
            int num = input.nextInt();
            if(num == valor){
                System.out.println("Acertaste!!!!!");
                break;//aquí termina el while
            }else{
                System.out.println("NO acertaste:(");
            }
            
        }
    }

}
