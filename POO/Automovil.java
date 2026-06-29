package POO;

public class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindrada;

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nfabricante = " + this.fabricante);
        sb.append("\nmodelo = " + this.modelo);
        sb.append("\ncolor = " + this.color);
        sb.append("cilindrada = " + this.cilindrada);
        return sb.toString();
    }

}
