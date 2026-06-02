import java.util.Scanner;

public class MultiplicacionSinAsterisco {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        int num1 = s.nextInt();
        System.out.println("Introduzca el segundo numero");
        int num2 = s.nextInt();
        int numMayor,numMenor;

        if(num1 < 0 && num2 < 0){
                num1 = -(num1);
                num2 = -(num2);
            }

        numMayor = num1 > num2 ? num1 : num2;
        numMenor = num1 > num2 ? num2: num1;


        for(int i = 0; i < numMayor - 1; i++){
            num1+=numMenor;
        }

        System.out.println(num1);
        s.close();
    }
}
