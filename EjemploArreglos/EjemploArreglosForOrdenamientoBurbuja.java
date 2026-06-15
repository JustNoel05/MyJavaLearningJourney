//import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja{

        public static void arregloInverso(String[] arreglo){
    
            int total2 = arreglo.length;
            int total = arreglo.length;

            for(int i = 0; i < total2; i++){
                String actual = arreglo[i];
                String inverso = arreglo[total -1 - i];
                arreglo[i] = inverso;
                arreglo[total- 1-i] = actual;
                total2--;
            }
        }
        
        @SuppressWarnings({"rawtypes", "unchecked"})
        public static void sortBurbuja(Object[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = auxiliar;
                }
            }
        }
    }
        public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64B", "Samsung Galaxy", "M2",
                            "Bad Dragon", "Tu ere pobre no tiene aiphon", "Switch", "CUCEI"};
        int total = productos.length;
        sortBurbuja(productos);
        System.out.println("==== Usando for ====");
        for(int i= 0; i < total; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
        
        System.out.println();
        System.out.println("========= Arreglo de Numeros =========");
        Integer[] numeros = new Integer[4];

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);
        
        for (int i  = 0; i < numeros.length; i++){
            System.out.println("i = " + i + " : " + numeros[i] );
        }
    }
}
