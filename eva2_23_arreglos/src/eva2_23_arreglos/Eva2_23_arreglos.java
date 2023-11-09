package eva2_23_arreglos;

public class Eva2_23_arreglos {

    public static void main(String[] args) {
        //Declarar el arreglo:
        int[] arreglo = new int[10];
        /*
            como se usa, el acceso es por índices
            el primer elemento del arreglo esta en la psoción 0 (cero)
            ultimo elemto es N - 1, N es el tamaño del arreglo
         */
        arreglo[0] = 10;
        arreglo[1] = 20;
        arreglo[2] = 30;
        arreglo[3] = 40;
        arreglo[4] = 50;
        arreglo[5] = 60;
        arreglo[6] = 70;
        arreglo[7] = 80;
        arreglo[8] = 90;
        arreglo[9] = 100;
        System.out.println(arreglo[7]);
        System.out.println("");
        ///
        String[] arregloCad = new String[5];
        arregloCad[0] = "Hola!";
        arregloCad[1] = "Mundo";
        arregloCad[2] = "me";
        arregloCad[3] = "llamo";
        arregloCad[4] = "DAYANA";
        System.out.println(arregloCad[0]);
        System.out.println(arregloCad[1]);
        System.out.println(arregloCad[2]);
        System.out.println(arregloCad[3]);
        System.out.println(arregloCad[4]);
    }

}