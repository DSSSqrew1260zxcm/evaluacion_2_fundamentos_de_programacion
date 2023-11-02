package eva2_19_validar_usuario;

import java.util.*;

public class Eva2_19_validar_usuario {
    final static String NOMBRE_USUARIO = "admin";
    final static String PASSWORD ="Admin";
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, password;
        System.out.println(NOMBRE_USUARIO + " " +PASSWORD);
        
        do{
            System.out.println("Ingrese el usuario: ");
            usuario = input.nextLine();
            System.out.println("Ingrese la contraseña: ");
            password = input.nextLine();
        }while((!usuario.equals(NOMBRE_USUARIO)) ||  (!password.equals(PASSWORD)));
        System.out.println("Acceso concedido. ¡¡¡BIENVENIDO!!!");
    }
}
