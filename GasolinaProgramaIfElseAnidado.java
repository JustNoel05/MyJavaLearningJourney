import java.util.Scanner;

public class GasolinaProgramaIfElseAnidado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de gasolina en Litros a llenar");
        int gasolina = s.nextInt();
        int capMaxima = 70;
        if(gasolina > capMaxima){
            System.out.println("Te pasaste de la capacidad del estanque");
        }else if(gasolina > 70){
            System.out.println("Estanque lleno");
        }else if (gasolina >= 60 && gasolina < 70) {
            System.out.println("Estanque Casi lleno");
        }else if(gasolina >= 40 && gasolina < 60){
            System.out.println("Estanque 3/4");
        }else if(gasolina >= 35 && gasolina < 40){
            System.out.println("Medio estanque");
        }else if(gasolina >= 20 && gasolina < 35){
            System.out.println("Suficiente");
        }else if(gasolina >= 1 && gasolina < 20){
            System.out.println("insuficiente");
        }
        s.close();
    }
}