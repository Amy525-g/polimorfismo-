public class Instrumento {

    private String Tecnica;
    private String Aprendizaje;
    
    public Instrumento(String tecnica, String aprendizaje) {
        Tecnica = tecnica;
        Aprendizaje = aprendizaje;
    }

    public String getTecnica() {
        return Tecnica;
    }

    public void setTecnica(String tecnica) {
        Tecnica = tecnica;
    }

    public String getAprendizaje() {
        return Aprendizaje;
    }

    public void setAprendizaje(String aprendizaje) {
        Aprendizaje = aprendizaje;
    }
    
}
