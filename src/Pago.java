public abstract class Pago {
    private int monto;

    public Pago(int monto) {
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }

    public abstract void procesarPago();

    public abstract Double obtenerDescuento(int monto);

    public void validarPago() {
        if (monto <= 0) {
            System.out.println("Monto del pago inválido");
        } else {
            System.out.println("Monto del pago correcto ");
        }
    }
}
