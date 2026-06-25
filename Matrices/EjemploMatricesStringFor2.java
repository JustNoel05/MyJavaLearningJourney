package Matrices;

public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {
        
        String[][] nombres = {{"Huitrado","David"},
        {"Kuahu","Jonathan"},{"Chupado","Josue"}};

        for(int i = 0; i < nombres.length; i++){
            for(int j = 0; j < nombres[i].length;j++){
                System.out.print(nombres[i][j] + " ");        
            }
            System.out.println();
        }
        
        System.out.println("Iterando con foreach");

        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.print(nombre + " ");
            }
            System.out.println();
        }
    }
}
