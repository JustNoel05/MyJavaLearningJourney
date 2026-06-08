import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        
        Calendar calendario = Calendar.getInstance();

        //calendario.set(2026, Calendar.SEPTEMBER,25,18,20,10);
        calendario.set(Calendar.YEAR, 2026);
        calendario.set(Calendar.MONTH,Calendar.SEPTEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 17);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 123);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin Formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha Con Formato = " + fechaConFormato);
    }
}
