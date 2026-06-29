package Matrices;

import java.util.Scanner;

public class EjemploMatricesSilla {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la silla a imprimir: ");
        int n = s.nextInt();
        if(n == 0){
            System.out.println("ERROR");
            System.exit(-1);
        }
        s.close();
        int[][] matriz = new int[n][n];


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 ||i == matriz[i].length/2 || j == n-1 && i > matriz[i].length/2){
                    matriz[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
