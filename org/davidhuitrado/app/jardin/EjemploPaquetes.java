package org.davidhuitrado.app.jardin;

import org.davidhuitrado.app.hogar.*;
import static org.davidhuitrado.app.hogar.Persona.*;
import static org.davidhuitrado.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        
        org.davidhuitrado.app.hogar.Persona p = new Persona();
        p.setNombre("David");
        p.setApellido("Aguilar");
        p.setColorPelo(NEGRO);
        System.out.println(p.nombre);
        
        Perro perro = new Perro();
        perro.nombre = "Aki";
        perro.raza = "Shih tzu";

        String jugando = perro.jugar(p);
        System.out.println("Jugando = " + jugando);

        String saludo = saludar();
        System.out.println("Saludo = " + saludo);
        //String generoMujer = GENERO_FEMENINO;
        //String generoHombre = GENERO_MASCULINO;


    }
}
