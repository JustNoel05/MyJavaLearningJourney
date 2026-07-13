package POO;

public class EjemploAutomovilRelacionesObjeto {
    public static void main(String[] args) {

        Rueda[] ruedasFord = new Rueda[5];
        

        Persona conductorFord = new Persona("Huitrado", "Marquez");

        Automovil ford = new Automovil("ford","Focus");
        ford.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        ford.setEstanque(new Estanque());
        ford.setColor(Color.AZUL);
        ford.setTipo(TipoAutomovil.HATCHBACK);
        ford.setConductor(conductorFord);
        //ford.setRuedas(ruedasFord);
        for(int i = 0; i < ruedasFord.length; i++){
            ford.addRueda(new Rueda("Yokohama", 16, 7.5));
        }
        
        
        Rueda[] ruedasMaz = new Rueda[5];
        
        Persona duende = new Persona("Duende", "Nigga");
        Automovil mazda = new Automovil("Huitrado","Uwuntu", Color.AMARILLO,
                         new Motor(3.0, TipoMotor.DIESEL),new Estanque(50),duende,ruedasMaz);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque(50));

        for(int i = 0; i < ruedasMaz.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 6.7));
        }

        Persona lee = new Persona("Lee", "sin");
        
        Automovil nissan = new Automovil("nissan", "Navara", Color.GRIS, 
                        new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
            
        nissan.setConductor(lee);
        nissan.setTipo(TipoAutomovil.SEDAN);
        nissan.addRueda(new Rueda("Pirelli", 20 ,11.5))
                                .addRueda(new Rueda("Pirelli", 20 ,11.5))
                                .addRueda(new Rueda("Pirelli", 20 ,11.5))
                                .addRueda(new Rueda("Pirelli", 20 ,11.5))
                                .addRueda(new Rueda("Pirelli", 20 ,11.5));

        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20 ,11.5),
                                new Rueda("Pirelli", 20 ,11.5),
                                new Rueda("Pirelli", 20 ,11.5),
                                new Rueda("Pirelli", 20 ,11.5),
                                new Rueda("Pirelli", 20 ,11.5)};

        Automovil nissan2 = new Automovil("nissan", "Navara", Color.GRIS, 
                        new Motor(4.0, TipoMotor.BENCINA), new Estanque(50),lee,ruedasNissan2);
        nissan2.setTipo(TipoAutomovil.SEDAN);

        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);
        //Automovil auto = new Automovil();

        System.out.println(ford.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());


        /* 
        System.out.println("Conductor ford:" + ford.getConductor());
        System.out.println("Ruedas ford: ");
        for(Rueda r: ford.getRuedas()){
            System.out.println(r.getFabricante() + ", aro " + r.getAro() + ", ancho " + r.getAncho());
        
        }*/
    }
}
