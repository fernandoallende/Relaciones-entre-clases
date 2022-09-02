package servicio;

import entidades.Baraja;
import entidades.Carta;
import enumerados.Paloo;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

/*• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se
 */
public class Servicio {

    private final Scanner leer = new Scanner(System.in);
    private final Baraja inicial = new Baraja();
    private final Baraja cartasEntregadas = new Baraja();

    public Baraja crearBaraja() {
        System.out.println("\n");
        ArrayList<Carta> a = new ArrayList();
        ArrayList<Carta> b = new ArrayList();
        cartasEntregadas.setCarta(b);

        for (Paloo aux : Paloo.values()) {
            for (int i = 0; i < 12; i++) {
                if (i + 1 == 8 || i + 1 == 9) {
                } else {
                    a.add(new Carta(i + 1, aux));
                }
            }
        }
        inicial.setCarta(a);
        System.out.println("las cartar ya estan para qe comience el juego ");
        for (Carta carta : a) {
            System.out.println(carta.toString());
        }
        return inicial;
    }

    public void barajar() {
        Collections.shuffle(inicial.getCarta());

        for (Carta al : inicial.getCarta()) {
            System.out.println(al);
        }
    }

    public Carta sienteCarta() {
       Carta c = inicial.getCarta().get(0);
        System.out.println("la siguiente carta es el " + inicial.getCarta().get(0).toString());
        return c;
    }

    public void cartasDisponibles() {
        System.out.println("Cartas disponible " + inicial.getCarta().size());
    }

    public void darCartas() {
        System.out.println("ingrese la cantidad de carta que quiere recibir");
        int cant = leer.nextInt();
        if (cant <= inicial.getCarta().size()) {
            for (int i = 0; i < cant; i++) {
                System.out.println("se va a entregar " + inicial.getCarta().get(i).toString() + " al jugador");
            }
            for (int i = 0; i < cant; i++) {
                cartasEntregadas.getCarta().add(inicial.getCarta().get(i));
                inicial.getCarta().remove(i);
            }
        } else {
            System.out.println("no hay es cantidad de carta y no se va a entregar ninguna carta al jugador");
        }
    }

    public void cartasMonton() {
        if (cartasEntregadas.getCarta().size() == 0) {
            System.out.println("aun no han sacado carta del mazo ");
        } else {
            System.out.println("\n");
            String parrafo = "";
            int control = 0;
            for (Object aux : cartasEntregadas.getCarta()) {
                parrafo = parrafo.concat(aux.toString());
                parrafo = parrafo.concat(",");
                control++;
                if (control == 10) {
                    System.out.println("Las cartas retiradas son: "+parrafo);
                    parrafo = "";
                    control = 0;
                }
            }
        }

    }

    public void mostrarBaraja(){
        if(inicial.getCarta().size()== 0){
            System.out.println("\n");
            String parrafo="";
            int control=0;
            for (Object object :inicial.getCarta()) {
                parrafo = parrafo.concat(object.toString());
                parrafo = parrafo.concat(",");
                control++;
            }
            if (control == 10) {
                System.out.println("Las cartas de mazo son: "+parrafo);
                parrafo = "";
                control = 0;
            }
        }else{
            System.out.println("no qqueda cartas en la baraja");
        }
    }
}
