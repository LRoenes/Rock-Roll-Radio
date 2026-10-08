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
public class Programa {
    private String nombre;
    private int serial;
    private List<Emision> emisiones;
    private List<Locutor> locutores;
    
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Emision getLastEmision(){
        return null;
    }
    

}
