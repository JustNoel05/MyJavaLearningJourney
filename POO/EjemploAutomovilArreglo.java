package POO;

import java.util.Arrays;

public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorFord = new Persona("Huitrado", "Marquez");
        Automovil ford = new Automovil("ford","Focus");
        ford.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        ford.setEstanque(new Estanque());
        ford.setColor(Color.AZUL);
        ford.setTipo(TipoAutomovil.HATCHBACK);
        ford.setConductor(conductorFord);
       
        Persona duende = new Persona("Duende", "Nigga");
        Automovil mazda = new Automovil("Huitrado","Uwuntu", Color.AMARILLO,
                         new Motor(3.0, TipoMotor.DIESEL),new Estanque(50));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(50));
        mazda.setConductor(duende);

        Automovil nissan = new Automovil("nissan", "Navara", Color.GRIS, 
                        new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(duende);
        nissan.setTipo(TipoAutomovil.SEDAN);

        Persona lee = new Persona("Lee", "sin");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, 
                        new Motor(16, TipoMotor.BENCINA), new Estanque(50));
        suzuki.setConductor(lee);
        suzuki.setTipo(TipoAutomovil.SUV);
        suzuki.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("David", "Martinez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = ford;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);

        for(int i = 0; i < autos.length; i++){
            System.out.println(autos[i]);
        }
    }
}
