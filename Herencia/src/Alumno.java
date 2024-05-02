public class Alumno extends Persona {

    private String materia;
    private Persona persona;

    public Alumno(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void realizarAccion() {
        System.out.println( getNombre() + " está estudiando " + materia);
    }

}
