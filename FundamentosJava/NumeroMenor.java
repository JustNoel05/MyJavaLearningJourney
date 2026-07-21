import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa la cantidad de numeros a comparar: (Minimo de 10)");
        int n = scanner.nextInt();
        if(n < 10){
            System.out.println("El valor tiene que ser minimo de 10");
            scanner.close();
            return;
        }

        int[] numeros = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("ingrese el numero " + (i+1));
            numeros[i] = scanner.nextInt();
        }

        int numeroMenor = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] < numeroMenor){
                numeroMenor = numeros[i];
            }
        }
        System.out.println("El numero menor es: " + numeroMenor);
        if(numeroMenor < 10){
            System.out.println("El numero menor es menor a 10");
        }else{
            System.out.println("El numero menor es mayor a 10!");
        }
        scanner.close();
    }
}
