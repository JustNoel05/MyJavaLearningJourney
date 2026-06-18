import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        int indice;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        
        System.out.println("Ingresa el indice a borrar: ");
        indice = s.nextInt();
        s.close();
        for(int i = indice; i < a.length-1; i++){
                a[i] = a[i+1];
        }

        int[] b = new int[a.length-1];
        System.arraycopy(a, 0, b, 0, b.length);
        
        a = b;
        for(int i = 0; i <a.length;i++){
            System.out.println(i + " => " +a[i]);
        }

        
    }
}
