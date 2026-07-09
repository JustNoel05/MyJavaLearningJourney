package POO;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {
        
        Automovil ford = new Automovil("ford","Focus");
        ford.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        ford.setEstanque(new Estanque());
        ford.setColor(Color.AZUL);
        ford.setTipo(TipoAutomovil.HATCHBACK);
        
        Automovil mazda = new Automovil("Huitrado","Uwuntu", Color.AMARILLO,
                         new Motor(3.0, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("Mazda.fabricante = " + mazda.getFabricante());

        TipoAutomovil tipo = ford.getTipo();
        System.out.println("Tipo ford = " + tipo.getNombre());
        System.out.println("Tipo ford descripcion = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE:
                System.out.println("El automovil es depoprtivo y descapotable de dos puertas");
                break;
            case COUPE:
                System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
                break;
            case FURGON:
                System.out.println("Es un automovil utilitario de transporte, de empresas");
                break;
            case HATCHBACK:
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
                break;
            case PICKUP:
                System.out.println("Es un automovil de doble cabina o camioneta");
                break;
            case SEDAN:
                System.out.println("Es un automovil mediano");
                break;
            case STATION_WAGON:
                System.out.println("Es un automovil mas grande, con maleta grande...");
                break;
            default:
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.print(ta + " => " + ta.name() + ", " + 
                            ta.getNombre() + ", " +
                            ta.getDescripcion() + ", " + 
                            ta.getNumeroPuerta()+ ", ");
            System.out.println();
        }
    }
}
