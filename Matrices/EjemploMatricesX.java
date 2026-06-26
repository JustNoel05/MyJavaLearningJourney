package Matrices;

import java.util.Scanner;

public class EjemploMatricesX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el tamaño de la X a imprimir: ");
        int n = s.nextInt();
        if(n == 0){
            System.out.println("ERROR");
            System.exit(-1);
        }
        s.close();
        String[][] matriz = new String[n][n];


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j  || i + j == n-1){
                    matriz[i][j] = "X";
                }else{
                    matriz[i][j] = "_";
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
