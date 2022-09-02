
package entidades;

import java.util.ArrayList;

/**
 *
 * @author fer
 */
public class Baraja {
   
    private  ArrayList<Carta> cartas;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> carta) {
        this.cartas = carta;
    }

    public ArrayList<Carta> getCarta() {
        return cartas;
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.cartas= cartas;
    }

    @Override
    public String toString() {
        return "Barajas{" + "carta=" + cartas + '}';
    }
    
    
    
    
}
