import java.util.Scanner;

public class ArregloTarea {
    public static void main(String[] args) {
        
        double[] a = new double[7];
        Scanner s = new Scanner(System.in);
        int tamanioArreglo = a.length;
        double promedioPositivo = 0,cantidadPositivos = 0,
        promedioNegativos = 0,cantidadNegativos = 0,cantidadCeros = 0;

        for(int i = 0; i < tamanioArreglo; i++){
            System.out.println("introduzca un numero: ");
            a[i] = s.nextDouble();
        }

        for(int i = 0; i < tamanioArreglo-1; i++){
            if(a[i] > 0){
                cantidadPositivos++;
                promedioPositivo += a[i];
            }else if(a[i] < 0){
                cantidadNegativos++;
                promedioNegativos += a[i];
            }else if(a[i] == 0){
                cantidadCeros++;
            }
        }
        System.out.println("--- Arreglo introducido ---");
        for(int i = 0; i < tamanioArreglo; i++){
            System.out.println(a[i]);
        }

        System.out.println("Promedio Numeros Positivos = " + (promedioPositivo/cantidadPositivos));
        System.out.println("Promedio Numeros Negativos = " + (promedioNegativos/cantidadNegativos));
        System.out.println("Cantidad de ceros = " + cantidadCeros);
        s.close();
    }
}
