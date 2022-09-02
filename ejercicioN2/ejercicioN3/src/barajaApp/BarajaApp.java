package barajaApp;

import java.util.Scanner;
import servicio.Servicio;

/**
 *
 * @author fer
 */
public class BarajaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicio eje3 = new Servicio();
        eje3.crearBaraja();
        int cont = 0;
        do {
            System.out.println("ingrese una opcion del siguente menu\n");
            System.out.println("_____________MENU____________");
            System.out.println("| 1) barajar el mazo         |");
            System.out.println("| 2) ver siguiente carta     |");
            System.out.println("| 3) pedir carta             |");
            System.out.println("| 4) ver las cartas usadas   |");
            System.out.println("| 5) ver carta aun en el mazo|");
            System.out.println("| 6) salir del programa      |");
            System.out.println("|____________________________|");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    //eje3.barajar();
                    System.out.println("el mazo esta mesclado");
                    break;
                case 2:
                    eje3.sienteCarta();
                    break;
                case 3:
                    eje3.darCartas();
                    break;
                case 4:
                    eje3.cartasMonton();
                    break;
                case 5:
                    eje3.mostrarBaraja();
                    break;
                case 6:
                    System.out.println("usted salio del programa");
                    cont = 1;
                    break;
                default:
                    System.out.println("ingreso una opcion incorrecta");
                    break;
            }
        } while (cont < 1);

    }

}
