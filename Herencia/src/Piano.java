public class Piano extends Instrumento{

    private String NombreCancion;

    public Piano(String tecnica, String aprendizaje, String nombreCancion) {
        super(tecnica, aprendizaje);
        NombreCancion = nombreCancion;
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        NombreCancion = nombreCancion;
    }

    @Override
    public String toString() {
        return "Piano [NombreCancion=" + NombreCancion + ", getTecnica()=" + getTecnica() + ", getAprendizaje()="
                + getAprendizaje() + "]";
    }

  
    
}
