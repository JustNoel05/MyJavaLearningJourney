import java.util.Scanner;

public class EjemploArreglosAgregarElementoOrdenado2 {
    public static void main(String[] args) {
        
        int[] a = new int[7];
        int valor, indice = 0, ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.println("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        
        System.out.println("Inserta un valor donde agregar en el arreglo: ");
        valor = s.nextInt();


        System.out.println("=== simon ===");
        ultimo = a[a.length-1];
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

        int[] b = new int [a.length +1];
        System.arraycopy(a, 0, b, 0, a.length);
        
        if(valor > ultimo){
            b[b.length -1 ] = valor;
        }else{
            b[b.length -1] = ultimo;
            b[indice] = valor;
        }

        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
        s.close();
        
    }
}

