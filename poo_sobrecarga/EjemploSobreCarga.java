public class EjemploSobreCarga {
    public static void main(String[] args) {
        
        Calculadora cal = new Calculadora();

        System.out.println("Sumar int: " + cal.sumar(10, 5));
        System.out.println("Sumar float: " + cal.sumar(10.5f, 5f));
        System.out.println("Sumar float-int: " + cal.sumar(10.5f, 5));
        System.out.println("Sumar int-float: " + cal.sumar(10, 5.0f));
        System.out.println("Sumar double: " + cal.sumar(10.0, 5.0));
        System.out.println("Sumar String: " + cal.sumar("10","5"));
        System.out.println("Sumar tres int: " + cal.sumar(10,5,3));

        System.out.println("sumar long: " + cal.sumar(10L, 10L));
        System.out.println("Sumar int: " + cal.sumar(10, '@'));
    }
}
