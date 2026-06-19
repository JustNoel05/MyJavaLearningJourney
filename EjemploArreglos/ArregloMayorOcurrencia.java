import java.util.Scanner;

public class ArregloMayorOcurrencia {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int mayorOcurrencias=0, elementoMasRepetido=0;
        for(int i = 0; i < a.length; i++){
            System.out.println("Introduzca un numero entero en el rango de (1-9): ");
            a[i] = s.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            int contador = 0;
            for(int j = 0; j < a.length; j++){
                if(a[i] == a[j]){
                    contador++;
                }
            }
            if(contador > mayorOcurrencias){
                mayorOcurrencias = contador;
                elementoMasRepetido = a[i];
            }
        }

        System.out.println("--- El arreglo dado ---");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("La mayor occurencias es: " + mayorOcurrencias);
        System.out.println("El elemento que mas se repite es: " + elementoMasRepetido);
        s.close();
    }
}
