import java.util.Random;
import java.util.Scanner;

public class ArregloValorMayor {
    public static void main(String[] args) {
        
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        
        int tamanioArreglo = a.length, max = 0;
        for(int i = 0; i < tamanioArreglo; i++){
            int numRandom = random.nextInt(11,99);
            a[i] = numRandom;
        }
        max = a[0];
        for(int i= 0; i < tamanioArreglo-1; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        
        System.out.println("Numero mayor = " + max);
        System.out.println("--- Arreglo generado aleatoriamente ---  ");
        for(int i = 0; i< tamanioArreglo; i++){
            System.out.println(a[i]);
        }


        s.close();
    }
}
