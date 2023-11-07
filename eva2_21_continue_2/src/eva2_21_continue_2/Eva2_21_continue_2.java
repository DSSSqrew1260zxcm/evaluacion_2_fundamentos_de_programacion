package eva2_21_continue_2;
import java.util.*;
public class Eva2_21_continue_2 {

    public static void main(String[] args) {
        for (int i=1; i<15; i++){
            //Modulo --> %
            if((i%2) != 0){
                continue;
             }    
            System.out.print(i + " - ");
           
        }
    }
    
}
