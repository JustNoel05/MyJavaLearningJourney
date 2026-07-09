package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Motor motorFord = new Motor(2.0, TipoMotor.BENCINA);
        Automovil ford = new Automovil("ford","Focus");
        ford.setMotor(motorFord);
        ford.setEstanque(new Estanque());
        ford.setColor(Color.AZUL);

        Automovil mazda = new Automovil("Huitrado","Uwuntu", Color.NEGRO, new Motor(3.0 , TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        System.out.println("Mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("nissan", "Navara", Color.GRIS, 
                        new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));

        Automovil nissan2 = new Automovil("nissan", "Navara", Color.GRIS,
            new Motor(3.5, TipoMotor.BENCINA), new Estanque(45));


        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales con equals? " + (nissan.equals(nissan2)));

        System.out.println(ford.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(ford.acelerar(300));
        System.out.println(ford.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometros por litro: " + ford.calcularConsumo(300, .6f));
        System.out.println("Kilometros por litro: " + ford.calcularConsumo(300, 60));
        System.out.println("Kilometros por litro: " + nissan.calcularConsumo(300, 60));
    }
}
