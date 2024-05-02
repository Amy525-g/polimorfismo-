public class Guitarra extends Instrumento{

    private String NombreInstrumento;

    public Guitarra(String tecnica, String aprendizaje, String nombreInstrumento) {
        super(tecnica, aprendizaje);
        NombreInstrumento = nombreInstrumento;
    }

    public String getNombreInstrumento() {
        return NombreInstrumento;
    }

    public void setNombreInstrumento(String nombreInstrumento) {
        NombreInstrumento = nombreInstrumento;
    }

    @Override
    public String toString() {
        return "Guitarra [NombreInstrumento=" + NombreInstrumento + ", getTecnica()=" + getTecnica()
                + ", getAprendizaje()=" + getAprendizaje() + "]";
    }
    
}
