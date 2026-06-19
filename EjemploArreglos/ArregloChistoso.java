import java.util.Scanner;

public class ArregloChistoso {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        int arregloTamanio = a.length;
        Scanner s = new Scanner (System.in);
        for(int i = 0; i < arregloTamanio; i++){
            System.out.println("Introduzca un numero entero: ");
            a[i] = s.nextInt();
        }
        int aux = arregloTamanio-1;
        System.out.println("==== Arreglo chistoso ====");
        for(int i = 0; i < arregloTamanio/2; i++){
            System.out.println(a[aux--]);
            System.out.println(a[i]);
        }

        s.close();

    }
}
