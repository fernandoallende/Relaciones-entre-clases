/*
 *Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
/*Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
package entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugador;
    private Revolver revolveDeAgua;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugador, Revolver revolveDeAgua) {
        this.jugador = jugador;
        this.revolveDeAgua = revolveDeAgua;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public Revolver getRevolveDeAgua() {
        return revolveDeAgua;
    }

    public void setRevolveDeAgua(Revolver revolveDeAgua) {
        this.revolveDeAgua = revolveDeAgua;
    }

    //METODOS
    public void llenarJuego(ArrayList<Jugador> j2, Revolver r2) {
        jugador = j2;
        revolveDeAgua = r2;

    }

    public boolean ronda(int i) {
        boolean juegoSiguiente = true;

        jugador.get(i).disparo(revolveDeAgua);
        if (jugador.get(i).getMojado()) {
            juegoSiguiente = false;
        }
        return juegoSiguiente;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador= " + jugador + ", revolveDeAgua= " + revolveDeAgua + '}';
    }

}
