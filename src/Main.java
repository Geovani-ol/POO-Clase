import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int op;

        System.out.print("Seleccione un ejercicio (1, 2, 3): ");
        op = leer.nextInt();

        switch (op){

            case 1:

                Rectangulo rectangulo = new Rectangulo();
                System.out.println("* Rectangulo *");
                rectangulo.calcularPerimetro(10, 5);
                rectangulo.calcularPerimetro(15.8, 10.2);
                rectangulo.calcularArea(15, 20);
                rectangulo.calcularArea(10.5, 13.8);
                break;

            case 2:

                Empleado empleado = new Empleado();
                System.out.println("* Empleado *");
                empleado.calcularSalario(3500.00);
                empleado.calcularSalario(3500.00, 1550.50);
                empleado.calcularSalario(3500.00, 1550.50, 4.5);
                break;

            case 3:

                CalculadoraImpuestos impuestos = new CalculadoraImpuestos();
                impuestos.calcularImpuestos(8000);
                impuestos.calcularImpuestos(8000, 6.2);
                impuestos.calcularImpuestos(8500.50, 6.2, 500.00);
                break;

        }

    }

}