package org.davidhuitrado.app.jardin;

import org.davidhuitrado.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }

    
}
