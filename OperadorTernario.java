import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
        //String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        //System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;
        
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("ingrese la nota de Matematicas entre 2.0 - 7.0");
        matematicas = s.nextDouble();
        System.out.println("ingrese la nota de Ciencias entre 2.0 - 7.0");
        ciencias = s.nextDouble();
        System.out.println("ingrese la nota de Historia entre 2.0 - 7.0");
        historia = s.nextDouble();
        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 5.49 ? "aprobado" : "Rechazado";
        System.out.println("estado =" + estado);

        /*
        if(promedio >= 5.49){
            estado = "Aprobado";
        } else{
            estado = "rechazado";
        }
        */
       scanner.close();
    }
}
