package POO;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris oscuro"),
    NARANJO("Naranja"),
    NEGRO("Nigga");

    private final String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return this.color;
    }
}
