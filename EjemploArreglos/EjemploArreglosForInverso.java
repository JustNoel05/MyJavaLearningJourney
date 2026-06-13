import java.util.Arrays;

public class EjemploArreglosForInverso{
    public static void main(String[] args) {
        
        //String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64B", "Samsung Galaxy", "M2",
                            "Bad Dragon", "Tu ere pobre no tiene aiphon", "Switch", "CUCEI"};
        int total = productos.length;

        /*productos[0] = "Kingston Pendrive 64B";
        productos[1] = "Samsung Galaxy";
        productos[2] = "M2";
        productos[3] = "Bad Dragon";
        productos[4] = "Tu ere pobre no tiene aiphon";
        productos[5] = "Switch";
        productos[6] = "CUCEI";
        */
       
        Arrays.sort(productos);
        System.out.println("==== Usando for ====");
        for(int i= 0; i < total; i++){
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
        
        for(int i = 0; i<total; i++){
            System.out.println("para i = " + (total -1 - i) + " Valor: " + productos[total - 1 - i]);
        }

        System.out.println("Usando for inverso 2");
        for(int i = total -1; i >= 0; i--){
            System.out.println("Para i = " + i + " valor " + productos[i]);
        }
       

    }
}