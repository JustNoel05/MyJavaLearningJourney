public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        
        int[] a = new int[10];

        for(int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }

        int aux = a[a.length-1];
        for(int i = a.length -1 ; i > 0 ; i--){
            a[i] = a[i - 1];
        }
        a[0] = aux;
 
        //Impresion
        for(int i = 0; i < a.length; i++){
            System.out.println("i:" + i + " valor:" + a[i]);
        }
    }
}
