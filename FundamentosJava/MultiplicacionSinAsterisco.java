import java.util.Scanner;

public class MultiplicacionSinAsterisco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        int num1 = s.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = s.nextInt();
        int numMayor,resultado = 0;

        if(num1 < 0 && num2 < 0){
                num1 = -(num1);
                num2 = -(num2);
            }

        numMayor = num1 > num2 ? num1 : num2;

        for(int i = 0; i < numMayor; i++){
            resultado = resultado + num2;
        }

        System.out.println(resultado);
        s.close();
    }
}
