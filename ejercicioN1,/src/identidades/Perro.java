package identidades;

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro  nombre, raza, edad y tamaño*/
public class Perro {
    //ATRIBUTOS
    private String nombre;
    private String raza;
    private int edad;
    private int tamano;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, int tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "años , tamano=" + tamano + "cm}";
    }

}
