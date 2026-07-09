public class OperadorInstanceOf {
    public static void main(String[] args) {
        
        String texto= new String("Creando un objeto de la clase string... que tal!");

        Integer num = 7;
        boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo Object= " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("Num es del tipo Object = " + b1);

        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo numer = " + b1);

        //b1 = b1 instanceof boolean;
        System.out.println("b1 es del tipo boolean = " + b1);
    }
}
