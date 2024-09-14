public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso("Programación en Java", "CS101", "Juan Pérez");
        Curso curso2 = new Curso("Estructura de Datos", "CS102", "María López");
        Curso curso3 = new Curso("Bases de Datos", "CS103", "Carlos Ruiz");

        Estudiante estudiante1 = new Estudiante("David González", "2024001");
        Estudiante estudiante2 = new Estudiante("Ana Sánchez", "2024002");

        estudiante1.agregarCurso(curso1);
        estudiante1.agregarCurso(curso2);

        estudiante2.agregarCurso(curso2);
        estudiante2.agregarCurso(curso3);

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

    }

}