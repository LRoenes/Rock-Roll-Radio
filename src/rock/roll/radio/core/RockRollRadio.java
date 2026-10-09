/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rock.roll.radio.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class RockRollRadio {
    private List<Artista> artistas;
    private List<Cancion> canciones;
    private List<Invitado> invitados;
    private List<Locutor> locutores;
    private List<Programa> programas;
    private List<Emision> emisiones;
     
    
    public RockRollRadio() {
        this.artistas = new ArrayList<>();
        this.canciones = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
        this.emisiones = new ArrayList<>();
    }
    
    
    public void addArtista(Artista a) {
        this.artistas.add(a);
    }
    
    public void addCancion(Cancion c){
        this.canciones.add(c);
    }


    public void addInvitado(Invitado i, Emision emision) {
        i.addEmision(emision);
        this.invitados.add(i);

    }

    public Artista getArtista(int index) {
        return this.artistas.get(index);
    }
    public List<Artista> getArtistas(){
        return this.artistas;
    }

    public Cancion getCancion(int index) {
        return this.canciones.get(index);
    }

    public void addPrograma(Programa p) {
        this.programas.add(p);
    }

    public Programa getPrograma(int index) {
        return this.programas.get(index);
    }

    public void addLocutor(Locutor l) {
        this.locutores.add(l);
    }

    public Locutor getLocutor(int index) {
        return this.locutores.get(index);
    }

    public void addEmision(Emision e) {
        this.emisiones.add(e);
    }

    public Emision getEmision(int index) {
        return this.emisiones.get(index);
    }
    public Emision getLastEmision(){
        Emision resultado = this.emisiones.get(this.emisiones.size());
        return resultado;
    }
    
    public Programa getProgramaConMasCancionesDeArtista(Artista a){
        return null;    
    }
}
