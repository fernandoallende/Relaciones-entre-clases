
package enumerados;


public enum Paloo {
    ESPADA,
    BASTO,
    ORO,
    COPA;
    
    private String nombre;

    private Paloo() {
    }

    private Paloo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
