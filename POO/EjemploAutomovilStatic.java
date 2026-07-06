package POO;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        
        Automovil ford = new Automovil("ford","Focus");
        ford.setCilindrada(6.9);
        ford.setColor("Azul");

        Automovil mazda = new Automovil("Huitrado","Uwuntu", "cafe", 6.9);
        System.out.println("Mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("nissan", "Navara", "Gris oscuro", 3.5, 50);

        Automovil nissan2 = new Automovil("nissan", "Navara", "Gris oscuro", 3.5, 50);

        nissan2.setColor("Amarillo");
        Automovil.setColorPatente("Azul");
        //Automovil auto = new Automovil();

        System.out.println(ford.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
    }
}
