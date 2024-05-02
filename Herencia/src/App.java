public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Piano ob = new Piano("Avanzado", "Avanzado", "La Cancion"); 
        System.out.println(ob.toString());
        Alumno alumno = new Alumno("Juan", "Matemáticas");
        Profesor profesor = new Profesor("María", "Matemáticas");
        alumno.realizarAccion();
        profesor.realizarAccion();

     }

}
