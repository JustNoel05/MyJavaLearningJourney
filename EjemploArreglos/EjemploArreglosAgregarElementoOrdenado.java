import java.util.Scanner;

public class EjemploArreglosAgregarElementoOrdenado {
    public static void main(String[] args) {
        
        int[] a = new int[7];
        int valor, indice = 0;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        
        System.out.println("Inserta un valor donde agregar en el arreglo: ");
        valor = s.nextInt();

        System.out.println("=== simon ===");
        for(int i = 0; i < a.length-1; i++){
            if(valor < a[i]){
                indice = i;
                break;
            }
        }

        for(int i = a.length-1; i > indice; i--){
            a[i] = a[i-1];          
        }
        a[indice] = valor;
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        s.close();
        
    }
}

/*
for (int i = 0; i < arreglo.length; i++){
    if(numeroInsertar < arreglo[i] ){
        posicion = i; //Obtenemos el indice donde insertar el numero del usuario
        break;
    }
}
*/
