public class EjemploSobreCarga {
    public static void main(String[] args) {
        
        //Calculadora cal = new Calculadora();

        System.out.println("Sumar int: " + Calculadora.sumar(10, 5));
        System.out.println("Sumar float: " + Calculadora.sumar(10.5f, 5f));
        System.out.println("Sumar float-int: " + Calculadora.sumar(10.5f, 5));
        System.out.println("Sumar int-float: " + Calculadora.sumar(10, 5.0f));
        System.out.println("Sumar double: " + Calculadora.sumar(10.0, 5.0));
        System.out.println("Sumar String: " + Calculadora.sumar("10","5"));
        System.out.println("Sumar tres int: " + Calculadora.sumar(10,5,3));
        System.out.println("Sumar 4 int: " + Calculadora.sumar(10,5,3,4));
        System.out.println("Sumar 6 int: " + Calculadora.sumar(10,5,3,4,5,6));
        System.out.println("Sumar float + n int: " + Calculadora.sumar(10.5f, 5, 9 ,15));
        System.out.println("Sumar 4 double: " + Calculadora.sumar(10.0, 5.0, 3.5, 4.5));

        System.out.println("sumar long: " + Calculadora.sumar(10L, 10L));
        System.out.println("Sumar int: " + Calculadora.sumar(10, '@'));
    }
}
