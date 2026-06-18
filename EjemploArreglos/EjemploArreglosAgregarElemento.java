import java.util.Scanner;

public class EjemploArreglosAgregarElemento {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        int valor, indice;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        a[a.length-1] = 0;
        
        System.out.println("Inserta un valor donde agregar en el arreglo: ");
        valor = s.nextInt();
        System.out.println("Ingresa el indice donde lo vayas a insertar: ");
        indice = s.nextInt();
        s.close();
        System.out.println("=== simon ===");

        for(int i = a.length-1; i > indice; i--){
            a[i] = a[i-1];          
        }
        a[indice] = valor;
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        
    }
}
