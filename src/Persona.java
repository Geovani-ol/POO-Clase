public class Persona {

    public String nombre;
    public int edad;
    public Double estatura;
    public Double peso;

    public Persona(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public void mostrarInfoPersona() {
        System.out.println("Nombre: " + this.nombre + ", edad: " + this.edad + ", estatura: " + this.estatura + ", peso: " + this.peso);
    }

}
