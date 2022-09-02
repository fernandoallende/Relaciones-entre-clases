package personaApp;

import identidades.Perro;
import identidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/* Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/
/**
 *
 * @author fer
 */
public class EjercicioN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> p = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Persona pers = new Persona();
            System.out.println(" AHORA VAMOS A LLENAR LOS DATOS DE LA PERSONA QE ADOPTE UN PERRO \n");
            System.out.println(" ingrese el nombre");
            pers.setNombre(leer.next());
            System.out.println(" ingrese el apellido");
            pers.setApellido(leer.next());
            System.out.println(" ingrese la edad");
            pers.setEdad(leer.nextInt());
            System.out.println(" ingrese el documento ");
            pers.setDni(leer.nextInt());
            System.out.println(" AHORA INGRESARA LOS DATOS DEL PERRO QE DESEA ADOPTAR\n");
            for (int j = 0; j < 1; j++) {
                Perro perr = new Perro();
                System.out.println("ingrese el nombre del perro ");
                perr.setNombre(leer.next());
                System.out.println("ingrese la raza del perro ");
                perr.setRaza(leer.next());
                System.out.println("ingrese la edad del perro ");
                perr.setEdad(leer.nextInt());
                System.out.println("ingrese el tamaño del perro ");
                perr.setTamano(leer.nextInt());
                pers.setPerro(perr);
            }
            p.add(pers);
        }
        for (Persona persona : p) {
            System.out.println(persona.toString());
           
        }
  

    }
}
