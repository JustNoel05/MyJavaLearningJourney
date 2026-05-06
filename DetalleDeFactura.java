import java.util.Scanner;

public class DetalleDeFactura{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca los detales de la Factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Introduzca el primer precio: ");
        double precio1 = scanner.nextDouble();
        System.out.println("Introduzca el segundo precio: ");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * .19;
        double totalNeto = totalBruto + impuesto;
        
        String detalle = ("La factura producto de " + nombreFactura + 
        " Tiene un total bruto de " + totalBruto  + ", con un impuesto de " + impuesto
            + " y el monto despues del impuesto es de " + totalNeto);

        System.out.println(detalle);
        scanner.close();
    }
}