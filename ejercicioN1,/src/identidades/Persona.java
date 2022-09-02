/*
 *Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
 */
package identidades;

public class Persona {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private String apellido;
    private int dni;
    private Perro perro;

    public Persona() {
        
    }

    public Persona(String nombre, int edad, String apellido, int dni, Perro perro) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre +", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + "," + perro + '}';
    }
    

}
