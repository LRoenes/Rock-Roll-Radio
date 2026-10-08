/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rock.roll.radio.core;

import java.util.List;

/**
 *
 * @author Revan
 */
public class Artista extends Persona{
    private List<Cancion> canciones;

    public Artista(List<Cancion> canciones, String nombre) {
        super(nombre);
        this.canciones = canciones;
    }
    
        
}
