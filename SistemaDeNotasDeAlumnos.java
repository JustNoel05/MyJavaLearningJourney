import java.util.Scanner;
public class SistemaDeNotasDeAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[20];

        double promedio5 = 0,notas5 = 0 ,promedioInferior4 = 0,notas4 = 0;
        int notas1 = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Introduzca la nota " + (i+1) + " (Con escala de 1-7): ");
            notas[i] = scanner.nextDouble();
            if(notas[i] < 1 || notas[i] > 7){
                System.out.println("Escriba bien la nota");
                i--;
                continue;
            }
            if(notas[i] == 0){
                System.out.println("ERROR no se puede capturar valor 0");
                break;
            }else if(notas[i] >= 1 && notas[i] < 2){
                notas1++;
            }else if(notas[i] < 4){
                promedioInferior4++;
                notas4 += notas[i];
            }else if(notas[i] >= 5){
                notas5 += notas[i];
                promedio5++;
            }
        }
        System.out.println("Promedio de las notas mayores a 5: " + notas5/promedio5);
        System.out.println("Promedio de notas inferiores a 4: " + notas4/promedioInferior4);
        System.out.println("Cantidad de notas 1: " + notas1);
        scanner.close();
    }
}
