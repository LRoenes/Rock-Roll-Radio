/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rock.roll.radio.core;

import java.util.ArrayList;
import rock.roll.radio.core.Cancion;
import java.util.List;

/**
 *
 * @author Revan
 */
public class Emision {
    
    private int serial;
    private List<Cancion> canciones;
    private List<Invitado> invitados;
    private Programa programa;

    public Emision(Programa programa) {
        this.programa = programa;
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
    }

    public void addCancion(Cancion c) {
        canciones.add(c);
    }


}
