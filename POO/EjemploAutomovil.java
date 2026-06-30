package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil ford = new Automovil();
        ford.setFabricante("ford");
        ford.setModelo("Focus");
        ford.setCilindrada(6.9);
        ford.setColor("Azul");

        Automovil mazda = new Automovil();
        mazda.setFabricante("Huitrado");
        mazda.setModelo("Uwuntu");
        mazda.setCilindrada(6.9);
        mazda.setColor("Cafe");

        System.out.println("Mazda.fabricante = " + mazda.getFabricante());

        System.out.println(ford.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(ford.acelerar(300));
        System.out.println(ford.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro: " + ford.calcularConsumo(300, .6f));
        System.out.println("Kilometros por litro: " + ford.calcularConsumo(300, 60));
    }
}
