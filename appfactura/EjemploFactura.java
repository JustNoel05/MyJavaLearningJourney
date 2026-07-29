import java.util.Scanner;

import org.davidhuitrado.appfacturas.modelo.Cliente;
import org.davidhuitrado.appfacturas.modelo.Factura;
import org.davidhuitrado.appfacturas.modelo.ItemFactura;
import org.davidhuitrado.appfacturas.modelo.Producto;


public class EjemploFactura {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setRfc("AUUD050917H");
        cliente.setNombre("David");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese la descripcion de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
        

        System.out.println();

        for(int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio del producto: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
    System.out.println(factura);
    s.close();   
    }
}
