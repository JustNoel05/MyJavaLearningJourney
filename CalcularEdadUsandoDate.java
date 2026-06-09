import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdadUsandoDate {
    public static void main(String[] args) {
        double milisPorAnio = 1000.0 * 60.0 * 60.0 * 24.0 * 365.25;
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();

        System.out.println("Introduzca su edad con el formato (yyyy-MM-dd)");
        try {
            String edadUsuario = s.next();           
            Date edad = format.parse(edadUsuario);
            if(edad.compareTo(fechaActual) > 0 || edad.compareTo(fechaActual) == 0 ){
                System.out.println("Edad no valida, Introduzca su edad correctamente");
            }else{
                double calculo = fechaActual.getTime() - edad.getTime() ;
                calculo = calculo / milisPorAnio;
                System.out.println("Su edad es = " + (int)Math.floor(calculo));
            }
        } catch (ParseException e) {
             System.out.println("Error: El formato de fecha ingresado es incorrecto.");
        }
        s.close();
    }
}
