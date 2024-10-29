import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EnvioNacional envioNacional = new EnvioNacional(300.0, 6.0, 600);
        envioNacional.validarPeso();
        System.out.println(envioNacional.calcularTiempoYCostoEntrega());

        System.out.println("\n**********************************************\n");

        EnvioInternacional envioInternacional = new EnvioInternacional(500.0, 12.0, "Fancia");
        envioInternacional.validarPeso();
        System.out.println(envioInternacional.calcularTiempoYCostoEntrega());

    }

}