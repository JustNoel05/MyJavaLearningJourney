import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        

        int valor, indice,ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        
        System.out.println("Inserta un valor donde agregar en el arreglo: ");
        valor = s.nextInt();
        System.out.println("Ingresa el indice donde lo vayas a insertar: ");
        indice = s.nextInt();
        s.close();

        ultimo = a[a.length-1];
        for(int i = a.length-2; i >= indice; i--){
            a[i+1] = a[i];          
        }

        int[] b = new int[a.length+1];
        System.arraycopy(a, 0, b, 0, a.length);
        a = b;
        b[indice] = valor;
        b[b.length-1] = ultimo;

        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
