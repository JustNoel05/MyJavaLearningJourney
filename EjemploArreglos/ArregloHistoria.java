import java.util.Arrays;
import java.util.Random;

public class ArregloHistoria {
    public static void main(String[] args) {
        
        int[] a = new int[12];

        Random random = new Random();

        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(1,6);
        }

        System.out.println("=== Arreglo A sin Ordenar ===");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }

        Arrays.sort(a);
    
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    b[i] +=1;
                }
            }
        }

        System.out.println();
        System.out.println("=== Arreglo A Ordenado ===");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("=== Arreglo B ===");

        for(int i = 0; i < b.length; i++){
            System.out.print(b[i]);
        }
        System.out.println();

        System.out.println("=== Histograma ===");
        for(int i = 0; i< b.length; i++){
            if(i > 0 && a[i] == a[i-1]){
                continue;
            }
            System.out.print(a[i] + ":");

            for(int j = 0; j<b[i] ; j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
}