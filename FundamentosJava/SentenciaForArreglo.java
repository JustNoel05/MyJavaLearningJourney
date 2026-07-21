import javax.swing.JOptionPane;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        
        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].toLowerCase().contains("AndrEs".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("pePa".toLowerCase())){
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un Nombre, ejemplo \"Pepe\" o \"Maria\" ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
            encontrado = true;
            break;
            }
            System.out.println("Nombres = " + nombres[i]);
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, buscar + " Fue encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, buscar + " No fue encontrado");
        }

    }
}
