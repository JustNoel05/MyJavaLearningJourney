package Matrices;

public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Huitrado";
        nombres[0][1] = "David";
        nombres[1][0] = "Kuahu";
        nombres[1][1] = "Jonathan";
        nombres[2][0] = "Chupado";
        nombres[2][1] = "Josue";

        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length;j++){
                System.out.print(nombres[i][j] + " ");        
            }
            System.out.println();
        }
        
        System.out.println("Iterando con foreach");

        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
