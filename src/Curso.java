public class Curso {

    private String nombreCurso;
    private String codigoCurso;
    private String instructor;

    public Curso(String nombreCurso, String codigoCurso, String instructor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.instructor = instructor;
    }

    public void mostrarInfoCurso() {
        System.out.println("Curso: " + getNombreCurso() + " | Código: " + getCodigoCurso() + " | Instructor: " + getInstructor());
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public String getInstructor() {
        return instructor;
    }

}
