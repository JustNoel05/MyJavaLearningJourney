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
        String desc = s.nextLine();
        
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i = 0; i < 5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n " + producto.getCodigo() + ": ");
            nombre = s.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio del producto: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
            s.nextLine();
        }
    System.out.println(factura.generarDetalle());
    s.close();   
    }
}
