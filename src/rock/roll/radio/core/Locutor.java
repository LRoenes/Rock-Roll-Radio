/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rock.roll.radio.core;

import java.util.ArrayList;
import rock.roll.radio.core.Emision;
import java.util.List;

/**
 *
 * @author Revan
 */
public class Locutor extends Persona {
    private List<Emision> emisiones;

    public Locutor(String nombre) {
        super(nombre);
        this.emisiones = new ArrayList<>();
    }
    

    
    
}
