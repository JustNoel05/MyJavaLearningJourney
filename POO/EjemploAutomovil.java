package POO;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil ford = new Automovil();
        ford.fabricante = "ford";
        ford.modelo = "focus";
        ford.cilindrada = 6.9;
        ford.color = "Azul";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "BT-50";
        mazda.cilindrada = 3.0;
        mazda.color = "Rojo";

        System.out.println(ford.detalle());
        System.out.println(mazda.detalle());
    }
}
