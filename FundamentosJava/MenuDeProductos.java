import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class MenuDeProductos {
    public static void main(String[] args) {
        Map<String, Integer> opciones = new HashMap<>();
        int opcionIndice = 0;

        while(opcionIndice != 5){
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);
            
            Object[] opArreglo = opciones.keySet().toArray();
            
            Object opcion = JOptionPane.showInputDialog(null,
                                "Seleccione un Opción", 
                                "Mantenedor de Productos", 
                                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);
            
            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                }
                
            switch (opcionIndice) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Usuario Actualizado con exito");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado con exito");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usuario Agregado con exito");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Listado de usuarios!");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Haz salido con exito!");
                    break;
                default:
                    break;
            }
        }
    }
}
