/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rock.roll.radio.core;

/**
 *
 * @author Luis
 */
public class RockRollRadio {
     
    
    public RockRollRadio() {
    }
    
    
    
    public void addArtista(Artista a) {
        artistas.add(a);
    }

    public void addInvitado(Invitado i) {
        invitados.add(i);
    }

    public Artista getArtista(int index) {
        return artistas.get(index);
    }

    public Cancion getCancion(int index) {
        return canciones.get(index);
    }

    public void addPrograma(Programa p) {
        programas.add(p);
    }

    public Programa getPrograma(int index) {
        return programas.get(index);
    }

    public void addLocutor(Locutor l) {
        locutores.add(l);
    }

    public Locutor getLocutor(int index) {
        return locutores.get(index);
    }

    public void addEmision(Emision e) {
        emisiones.add(e);
    }

    public Emision getEmision(int index) {
        return emisiones.get(index);
    }
    
    public Programa getProgramaConMasCancionesDeArtista(Artista a){
        return null;    
    }
}
