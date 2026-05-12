import javax.swing.JOptionPane;

public class NombreLargo {
    
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingresa el primer nombre: ");
        String nombre2 = JOptionPane.showInputDialog("Ingresa el Segundo nombre: ");
        String nombre3 = JOptionPane.showInputDialog("Ingresa el Tercer nombre: ");

        String primerNombre[] = nombre1.split(" ");
        String segundoNombre[] = nombre2.split(" ");
        String tercerNombre[] = nombre3.split(" ");

        String nombreMax[] = (primerNombre[0].length() > segundoNombre[0].length()) ?  primerNombre: segundoNombre;
        nombreMax = (nombreMax[0].length() > tercerNombre[0].length()) ?  nombreMax: tercerNombre;
        
        System.out.println(nombreMax[0] + " " + nombreMax[1] + " Tiene el nombre mas largo");
    }
}
