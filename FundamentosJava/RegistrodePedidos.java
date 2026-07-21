import javax.swing.JOptionPane;

public class RegistrodePedidos {
    public static void main(String[] args) {
        
        String cantidadTexto = JOptionPane.showInputDialog("Introduzca la cantidad de Objetos");
        Integer cantidad = Integer.parseInt(cantidadTexto);
        String PrecioUnitarioTexto = JOptionPane.showInputDialog("Introduzca la cantidad del precio unitario");
        Integer precioUnitario = Integer.parseInt(PrecioUnitarioTexto);
        
        int total = cantidad * precioUnitario;

        System.out.println("Cantidad = " + cantidad);
        System.err.println("precioUnitario = " + precioUnitario);
        System.out.println("Total = " + total);
        
        boolean promocion = false;
        if(total > 100){
            promocion = true;
        }
        
        System.out.println("¿Aplica promocion? " + promocion);
    }
}
