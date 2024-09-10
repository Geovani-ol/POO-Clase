import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int añoActual;

        System.out.print("Ingrese el año actual: ");
        añoActual = leer.nextInt();

        System.out.println("\nCoche Uno");
        Coche cocheUno = new Coche("Cadilac", "Escalade", 2023);
        cocheUno.mostrarInformacion();
        System.out.println("La edad del coche es: " + cocheUno.calcularEdadDelCoche(añoActual) + " año/s");

        System.out.println("\nCoche Dos");
        Coche cocheDos = new Coche("Chevrolet", "Blazer", 2021);
        cocheDos.mostrarInformacion();
        System.out.println("La edad del coche es: " + cocheDos.calcularEdadDelCoche(añoActual) + " año/s");

        System.out.println("\nCoche Tres");
        Coche cocheTres = new Coche("Mercedes-Benz", "S-Class", 2022);
        cocheTres.mostrarInformacion();
        System.out.println("La edad del coche es: " + cocheTres.calcularEdadDelCoche(añoActual) + " año/s");

        System.out.println("\nCoche Cuatro");
        Coche cocheCuatro = new Coche("BMW", "Serie 3", 2019);
        cocheCuatro.mostrarInformacion();
        System.out.println("La edad del coche es: " + cocheCuatro.calcularEdadDelCoche(añoActual) + " año/s");

        System.out.println("\nCoche Cinco");
        Coche cocheCinco = new Coche("Ford", "Mustang", 2015);
        cocheCinco.mostrarInformacion();
        System.out.println("La edad del coche es: " + cocheCinco.calcularEdadDelCoche(añoActual) + " año/s");

    }

}