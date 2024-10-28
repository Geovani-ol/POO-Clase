import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PagoPaypal pagoPaypal = new PagoPaypal(200, "AS2F1AE3F1DF12", "usuario@email.com");
        pagoPaypal.procesarPago();

        System.out.println("*************************");

        PagoTarjeta pagoTarjeta = new PagoTarjeta(0, LocalDate.of(2028, 10, 10), "1AS3D1SA3E");
        pagoTarjeta.procesarPago();

    }

}