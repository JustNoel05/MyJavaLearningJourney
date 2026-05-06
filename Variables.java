public class Variables {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde java!";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase()= "+ saludar.toUpperCase());
        
        int numero = 11;
        System.out.println(numero);
        boolean valor = true;

        int numero2 = 5;
        if(valor){
            System.out.println(numero);
            numero2 = 10;
        }
        System.out.println(numero2);
        
        //var numero3 = "15";
        boolean bandera = true;
        String nombre;
        nombre = "huitrado";
        if(bandera){
            nombre = "juan";
        }
        System.out.println(nombre);

        
    }
}
