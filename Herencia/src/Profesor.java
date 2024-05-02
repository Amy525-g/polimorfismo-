public class Profesor extends Persona {
    private String materia;
    private Persona per;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void realizarAccion() {
        System.out.println(getNombre()+ " está enseñando " + materia);
    }
}
