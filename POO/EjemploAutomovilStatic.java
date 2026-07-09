package POO;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        
        Automovil ford = new Automovil("ford","Focus");
        ford.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        ford.setEstanque(new Estanque());
        ford.setColor(Color.AZUL);
        ford.setTipo(TipoAutomovil.HATCHBACK);
        

        Automovil mazda = new Automovil("Huitrado","Uwuntu", Color.AMARILLO,
                         new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(50));
        System.out.println("Mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("nissan", "Navara", Color.GRIS, 
                        new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.SEDAN);

        Automovil nissan2 = new Automovil("nissan", "Navara", Color.GRIS, 
                        new Motor(4.0, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setTipo(TipoAutomovil.SEDAN);

        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);
        //Automovil auto = new Automovil();

        System.out.println(ford.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));

        System.out.println("Velocidad maxima carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad Maxima ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoFord = ford.getTipo();
        System.out.println("Tipo ford = " + tipoFord.getNombre());
        System.out.println("Tipo ford descripcion = " + tipoFord.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));
    }
}
