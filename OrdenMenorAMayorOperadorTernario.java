import java.util.Scanner;

public class OrdenMenorAMayor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int num1 = s.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = s.nextInt();
        String aux;

        aux = (num1 < num2) ? (num1 + " " + num2) : (num2 + " " + num1);
        System.out.println(aux);

        s.close();
    }
}
