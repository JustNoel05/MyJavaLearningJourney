import javax.swing.JOptionPane;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;
        
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println(numeroDecimal);

        String resultadoBinario = "numero binario de " + " = " +  Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        System.out.println(numeroDecimal + " = " +  Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b11110;
        System.out.println(numeroBinario);
        String resultadoOctal = "\nNumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println("Numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));

        //Poniendo 0 al inicio lo detecta como octal
        int numeroOctal = 036;
        System.out.println(numeroOctal);

        String resultadoHex = "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println("Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1e;
        System.out.println(numeroHex);

        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }    
}
