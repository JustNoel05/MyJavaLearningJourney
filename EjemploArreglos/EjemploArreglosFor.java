import java.util.Arrays;

public class EjemploArreglosFor{
    public static void main(String[] args) {
        
        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive 64B";
        productos[1] = "Samsung Galaxy";
        productos[2] = "M2";
        productos[3] = "Bad Dragon";
        productos[4] = "Tu ere pobre no tiene aiphon";
        productos[5] = "Switch";
        productos[6] = "CUCEI";

        Arrays.sort(productos);
        System.out.println("==== Usando for ====");
        for(int i= 0; i < total; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
        System.out.println("==== Usando foreach ====");

        for(String prod : productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("==== Usando while ====");
        int i = 0;
        while(i < total){
            System.out.println("Para indice " + i + ": " + productos[i]);
            i++;
        }
        System.out.println("==== Usando Dowhile ====");
        int j = 0;
        do{
            System.out.println("Para indice " + j + ": " + productos[j]);
            j++;
        }while(j < total);

        int[] numeros = new int[10];
        int totalNumeros = numeros.length;

        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }

        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numeros = " + numeros[k]);
        }

       

    }
}