public abstract class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }


    public abstract void realizarAccion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
