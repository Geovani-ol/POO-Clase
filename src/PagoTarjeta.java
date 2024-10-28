import java.time.LocalDate;

public class PagoTarjeta extends Pago {
    private LocalDate fechaVencimientoTarjeta;
    private String numeroTarjeta;

    public PagoTarjeta(int monto, LocalDate fechaVencimientoTarjeta, String numeroTarjeta) {
        super(monto);
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        super.validarPago();
        if (fechaVencimientoTarjeta.isBefore(LocalDate.now())) {
            System.out.println("No se pudo procesar el pago");
            System.out.println("Tarjeta vencida");
        } else {
            System.out.println("Pago completado");
            System.out.println("Monto: " + super.getMonto());
            System.out.println("Monto con descuento: " + (super.getMonto() - (super.getMonto() * obtenerDescuento(super.getMonto()))));
            System.out.println("Número de tarjeta: " + numeroTarjeta);
        }
    }

    @Override
    public Double obtenerDescuento(int monto) {
        if (fechaVencimientoTarjeta.isAfter(LocalDate.of(2030, 1, 1))) {
            if (numeroTarjeta.contains("888") && !numeroTarjeta.contains("A")) {
                return .12;
            } else {
                return 0.20;
            }
        } else if (fechaVencimientoTarjeta.isAfter(LocalDate.of(2028, 1, 1))) {
            if (numeroTarjeta.contains("999")) {
                return 0.8;
            } else {
                return 0.3;
            }
        } else {
            return 0.1;
        }
    }
}
